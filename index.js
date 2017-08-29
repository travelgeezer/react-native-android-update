import { NativeModules, Platform } from 'react-native';
const AndroidUpdateApp =  NativeModules.AndroidUpdateApp;

export default {
  updateAndroid: Platform.OS == 'android'
   ? (updateUrl, key) => AndroidUpdateApp.updateAndroid(updateUrl, key)
   : () => {}
}
