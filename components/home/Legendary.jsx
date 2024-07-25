import { View, Text } from 'react-native';
import ImgRounded from './ImgRounded';

export default function Legendary() {
  return (
    <View className="flex-row items-center mt-4">
      <Text>Legendary:</Text>
      <ImgRounded src={require('../../assets/img_hero/img_hero_myrrh_guardian_dragon.webp')}/>
    </View>
  )
}