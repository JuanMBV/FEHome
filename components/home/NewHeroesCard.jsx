import { View, Text } from "react-native";
import NewHeroes from "./NewHeroes";
import Resplandent from "./Resplandent";
import Legendary from "./Legendary";

export default function NewHeroesCard() {
  return (
    <View className="bg-white items-center rounded-md w-11/12 min-h-fit mt-4 py-5">
      <Text className="text-2xl">Newest Heroes</Text>
      <Legendary />
      <Resplandent />
      <NewHeroes />
    </View>
  );
}