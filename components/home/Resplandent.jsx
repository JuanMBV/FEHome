import { View, Text } from 'react-native';
import ImgRounded from './ImgRounded';

export default function Resplandent() {
  return (
    <View className="flex-row items-center mt-4">
        <Text>Resplandent:</Text>
        <ImgRounded src={require('../../assets/img_hero/img_hero_matthew_r.webp')} />
      </View>
  )
}