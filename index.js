import { NativeModules } from 'react-native';
const AndroidUpdateApp =  NativeModules.AndroidUpdateApp;

export default {
  updateAndroid: (updateUrl, key) => AndroidUpdateApp.updateAndroid(key, updateUrl)
}
