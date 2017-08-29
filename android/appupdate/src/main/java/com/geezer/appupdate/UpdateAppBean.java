package com.geezer.appupdate;

import java.io.Serializable;

/**
 * 版本信息
 */
public class UpdateAppBean implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * update : Yes
     * apkVersion : xxxxx
     * apk_url : http://cdn.the.url.of.apk/or/patch
     * updateLog : xxxx
     * delta : false
     * newMd : xxxxxxxxxxxxxx
     * apkSize : 601132
     */
    //是否有新版本
    private boolean isUpgrade;
    //新版本号
    private String apkVersion;
    //新app下载地址
    private String apkUrl;
    //更新日志
    private String updateLog;
    //新app大小
    private String apkSize;
    //是否强制更新
    private boolean isConstraint;
    //md5
    private String newMd;
    //是否增量 暂时不用
    private boolean delta;
    /**********以下是内部使用的数据**********/

    //网络工具，内部使用
    private HttpManager httpManager;
    private String targetPath;
    private boolean mHideDialog;
    private boolean mShowIgnoreVersion;
    private boolean mDismissNotificationProgress;
    private boolean mOnlyWifi;

    //是否隐藏对话框下载进度条,内部使用
    public boolean isHideDialog() {
        return mHideDialog;
    }

    public void setHideDialog(boolean hideDialog) {
        mHideDialog = hideDialog;
    }

    public boolean isUpdate() {
        return isUpgrade;
    }

    public HttpManager getHttpManager() {
        return httpManager;
    }

    public void setHttpManager(HttpManager httpManager) {
        this.httpManager = httpManager;
    }

    public String getTargetPath() {
        return targetPath;
    }

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    public boolean isConstraint() {
        return isConstraint;
    }

    public UpdateAppBean setConstraint(boolean isConstraint) {
        this.isConstraint = isConstraint;
        return this;
    }


    public UpdateAppBean setUpdate(boolean update) {
        this.isUpgrade = update;
        return this;
    }

    public String getNewVersion() {
        return apkVersion;
    }

    public UpdateAppBean setNewVersion(String apkVersion) {
        this.apkVersion = apkVersion;
        return this;
    }

    public String getApkFileUrl() {
        return apkUrl;
    }


    public UpdateAppBean setApkFileUrl(String apkUrl) {
        this.apkUrl = apkUrl;
        return this;
    }

    public String getUpdateLog() {
        return updateLog;
    }

    public UpdateAppBean setUpdateLog(String updateLog) {
        this.updateLog = updateLog;
        return this;
    }

    public boolean isDelta() {
        return delta;
    }

    public void setDelta(boolean delta) {
        this.delta = delta;
    }

    public String getNewMd5() {
        return newMd;
    }

    public UpdateAppBean setNewMd5(String newMd) {
        this.newMd = newMd;
        return this;
    }

    public String getTargetSize() {
        return apkSize;
    }

    public UpdateAppBean setTargetSize(String apkSize) {
        this.apkSize = apkSize;
        return this;
    }

    public boolean isShowIgnoreVersion() {
        return mShowIgnoreVersion;
    }

    public void showIgnoreVersion(boolean showIgnoreVersion) {
        mShowIgnoreVersion = showIgnoreVersion;
    }

    public void dismissNotificationProgress(boolean dismissNotificationProgress) {
        mDismissNotificationProgress = dismissNotificationProgress;
    }

    public boolean isDismissNotificationProgress() {
        return mDismissNotificationProgress;
    }

    public boolean isOnlyWifi() {
        return mOnlyWifi;
    }

    public void setOnlyWifi(boolean onlyWifi) {
        mOnlyWifi = onlyWifi;
    }

}
