# react-native-android-update

This is an android update module.


# Install

## Install package

```
npm i react-native-android-update.13 --save
```

Link the package using react-native link:

```
react-native link react-native-android-update.13
```

## Usage

Import library
```javascript
import AndroidUpdateApp from 'react-native-android-update.13';
```
## Check for updates

```javascript
 componentWillMount() {
    AndroidUpdateApp.updateAndroid(
      'https://you url',
      'you appkey'
    );
  }
```


### Documentation

#### Params

|Key       | Description          | Type  | Default|
| ---      | -----------          | ----  | ------ |
|udpateUrl | config url           |string |        |
|appKey    | needed parameters    |string |        |
|version   | version name         |string | Automatically read the versionName of build.gradle |

#### Methods

| Name          | Description       | Type | Default|
| ------------- | ------------------| ---- | ------ |
| updateAndroid | check for update  |      |        |



### Notice

#### Data types supported:
```json
{
  "code": 0,
  "info": null,
  "data": {
    "apkVersion": "0.0.13",
    "apkUrl": "http",
    "updateLog": "test",
    "apkSize": "30M",
    "newMd": "sssskjlfae",
    "isConstraint": "false",
    "isUpgrade": "true"
  }
}
```


Thanks to
---

- [AppUpdate](https://github.com/WVector/AppUpdate)
