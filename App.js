import { StatusBar } from 'react-native-web';
import { View } from 'react-native';
import Main from './components/Main';
import { SafeAreaProvider } from 'react-native-safe-area-context';

export default function App() {
  return (
    <SafeAreaProvider>
      <View className='flex-1 justify-center items-center'>
        <StatusBar style="dark" />
        <Main />
      </View>
    </SafeAreaProvider>
  );
}