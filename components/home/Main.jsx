import { Text, View } from 'react-native';
import { useSafeAreaInsets } from 'react-native-safe-area-context';
import NewHeroesCard from './NewHeroesCard';

export default function Main() {
  const insets = useSafeAreaInsets();
  return (  
    <View className="flex-1 items-center" style={{ paddingBottom: insets.bottom}}>
      <NewHeroesCard />
    </View>
  );
}