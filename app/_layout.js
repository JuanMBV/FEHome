import { Stack } from "expo-router";
import { View } from "react-native";

export default function Layout() {  
  return (
    <View className="flex-1 bg-black">
      <Stack
        screenOptions={{
          headerStyle: { backgroundColor: "white" },
          headerTintColor: "black",
          headerTitle: "FEHome",
          headerLeft: () => {},
          headerRight: () => {},
        }}
      />
    </View>
  );
}