package com.geezer.appupdate;

import java.io.Serializable;

/**
 * Created by geezer. on 2017/8/29.
 */

public class UpdateBean implements Serializable {

    /**
     * code : 0
     * info : null
     * data : {"apkVersion":"0.0.13","apkUrl":"http","updateLog":"test","apkSize":"30M","newMd":"sssskjlfae","isConstraint":"false","isUpgrade":"true"}
     */

    private int code;
    private Object info;
    private UpdateAppBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public UpdateAppBean getData() {
        return data;
    }

    public void setData(UpdateAppBean data) {
        this.data = data;
    }
}
