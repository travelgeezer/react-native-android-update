package com.geezer.appupdate;

import org.json.JSONObject;

/**
 * 新版本版本检测回调
 */
public class UpdateCallback {

    /**
     * 解析json,自定义协议
     *
     * @param json 服务器返回的json
     * @return UpdateAppBean
     */
    protected UpdateAppBean parseJson(String json) {
        UpdateAppBean updateAppBean = new UpdateAppBean();
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONObject data = jsonObject.getJSONObject("data");
            updateAppBean.setUpdate(data.optBoolean("isUpgrade"))
                    .setNewVersion(data.optString("apkVersion"))
                    .setApkFileUrl(data.optString("apkUrl"))
                    .setTargetSize(data.optString("apkSize"))
                    .setUpdateLog(data.optString("updateLog"))
                    .setConstraint(data.optBoolean("isConstraint"))
                    .setNewMd5(data.optString("newMd"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return updateAppBean;
    }

    /**
     * 有新版本
     *
     * @param updateApp        新版本信息
     * @param updateAppManager app更新管理器
     */
    protected void hasNewApp(UpdateAppBean updateApp, UpdateAppManager updateAppManager) {
//        updateAppManager.showDialogFragment();
        updateAppManager.showDialogFragment();
    }

    /**
     * 网路请求之后
     */
    protected void onAfter() {
    }


    /**
     * 没有新版本
     */
    protected void noNewApp() {
    }

    /**
     * 网络请求之前
     */
    protected void onBefore() {
    }

}
