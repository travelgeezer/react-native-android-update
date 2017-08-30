package com.geezer.appupdate;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.geezer.appupdate.UpdateAppHttpUtil;
import com.geezer.appupdate.UpdateAppManager;

/**
 * Created by geezer. on 2017/8/29.
 */

public class UpdateModule extends ReactContextBaseJavaModule {

    private static final String REACT_CLASS = "AndroidUpdateApp";

    public UpdateModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void updateAndroid(String updateUrl, String key) {
        new UpdateAppManager
                .Builder()
                //当前Activity
                .setActivity(getCurrentActivity())
                //更新地址
                .setUpdateUrl(updateUrl)
                .setAppKey(key)
                //.setAppKey("ab55ce55Ac4bcP408cPb8c1Aaeac179c5f6f")
                //实现httpManager接口的对象
                .setHttpManager(new UpdateAppHttpUtil())
                .build()
                .update();
    }
}
