package com.juan.fehome.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.juan.fehome.R
import com.juan.fehome.navigation.AppScreens
import com.juan.fehome.ui.theme.FEHomeTheme

/**
 * Created by JuanMBV
 */

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavController){
    FEHomeTheme {
        ContentMainScreen(navController)
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
private fun ContentMainScreen(navController: NavController){
    Scaffold (
        topBar = {TopAppBar()}
    ){
        // Columna para dividir la pantalla en secciones
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(10.dp) // Esto espacea cada seccion
        ){
            ContentNewestHeroes(navController)
            CommingSoon()
        }
    }
}

@Composable
private fun ContentNewestHeroes(navController: NavController){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(270.dp)
            .padding(top = 6.dp, start = 6.dp, end = 6.dp)
            .clip(shape = RoundedCornerShape(10.dp)),
        color = MaterialTheme.colors.primary,
    ) {
        Column(
            modifier = Modifier.padding(10.dp), // Me quede haciendo el padding para acomodar el texto
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Contenido de la sección 1
            Text(
                text = "Newest Heroes",
                color = MaterialTheme.colors.onPrimary,
                fontSize = 25.sp,
            )
            RowLegendary(navController)
            RowResplandent(navController)
            RowNewHeroes(navController)
        }
    }
}



@Composable
private fun RowLegendary(navController: NavController){
    Row(
        modifier = Modifier.padding(top = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Legendary:     ",
            color = MaterialTheme.colors.onPrimary,
            fontSize = 18.sp,
        )
        NewestHeroButton(R.drawable.img_hero_myrrh_guardian_dragon, Color.Blue, navController)
    }
}

@Composable
private fun RowResplandent(navController: NavController){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Resplandent:     ",
            color = MaterialTheme.colors.onPrimary,
            fontSize = 18.sp,
        )
        NewestHeroButton(R.drawable.img_hero_matthew_r, Color.Gray, navController)
    }
}

@Composable
private fun RowNewHeroes(navController: NavController){
    Row(
        modifier = Modifier.padding(3.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        NewestHeroButton(R.drawable.img_hero_edelgard_sun_empresses, Color.Red, navController)
        NewestHeroButton(R.drawable.img_hero_claude_tropical_trouble, Color.Blue, navController)
        NewestHeroButton(R.drawable.img_hero_dimitri_sky_blue_lion, Color.Green, navController)
        NewestHeroButton(R.drawable.img_hero_micaiah_wavecrest_maiden, Color.Gray, navController)
        NewestHeroButton(R.drawable.img_hero_elincia_seaside_queen, Color.Blue, navController)
    }
}

@Composable
private fun CommingSoon(){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(start = 6.dp, end = 6.dp)
            .clip(shape = RoundedCornerShape(10.dp)),
        color = MaterialTheme.colors.primary,
    ) {
        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Contenido de la sección 1
            Text(
                text = "Comming Soon",
                color = MaterialTheme.colors.onPrimary,
                fontSize = 25.sp,
            )
        }
    }
}

@Composable
fun NewestHeroButton(imageResId: Int, circleColor: Color, navController: NavController) {
    Box(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp) // Aplica el padding al contenedor Box
            .clip(shape = CircleShape)
            .border(2.dp, circleColor, CircleShape)
            .clickable {
                navController.navigate(AppScreens.HeroInfoScreen.route)
            },
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(imageResId),
            contentDescription = "Image of the newest heroes current",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}


@Composable
private fun TopAppBar() {
    TopAppBar(
        title = { Text(text = "FEHome", modifier = Modifier.padding(10.dp)) },
        actions = {}
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    val navController = rememberNavController()
    MainScreen(navController)
}