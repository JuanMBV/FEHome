import { View } from 'react-native';
import ImgRounded from './ImgRounded';

export default function NewHeroes() {
  return (
    <View className="flex-row mt-4">
      <ImgRounded src={require('../../assets/img_hero/img_hero_edelgard_sun_empresses.webp')}/>
      <ImgRounded src={require('../../assets/img_hero/img_hero_claude_tropical_trouble.webp')}/>
      <ImgRounded src={require('../../assets/img_hero/img_hero_dimitri_sky_blue_lion.webp')}/>
      <ImgRounded src={require('../../assets/img_hero/img_hero_micaiah_wavecrest_maiden.webp')}/>
      <ImgRounded src={require('../../assets/img_hero/img_hero_elincia_seaside_queen.webp')}/>
    </View>
  )
}