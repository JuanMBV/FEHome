import { useRouter } from "expo-router";
import { View, Text } from "react-native";
export default function Hero() {
  const url = useRouter();

  <View className="justify-center items-centers">
    <Text>Url:{url.pathname}</Text>
  </View>
}