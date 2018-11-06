package com.xtan.tanglanqin.tlame;

import android.app.Application;


/**
 * Created by tlq on 2018/8/20.
 */

/**
 ░░░░░░░░░░▄░░░░░░░░░░░░░▄░░░░░
 ░░░░░░░░░▐█░░░░░░░░░░░▄▀▒▌░░░░
 ░░░░░░░░▐▀▒█░░░░░░░░▄▀▒░▒▐░░░░
 ░░░░░░░▐▄░▒▒▀▀▀▀▄▄▄▀▒▒░░▒▐░░░░
 ░░░░░▄▄▀▒▒▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░░░░
 ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░░░░
 ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒░░░░
 ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒░░░░
 ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄░░░
 ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▐░░░
 ░▌▒▄█████▄░▒▒░░░░░░░░░░▒▒▒▒▐░░
 ░▌▒▌███▄▌▄░▒▒░░░░░░░░░░▒▒▒▐░░░
 ░▌▒▒▌▀▀▀▌▒▒▒▒░░░░░░▒▒▒▒▒▒▒▐░░░
 ░░▌▒▒▒▒▒▒▒░░░░░░░░▒▒▒▒▒▒▐░░░░░
 ░░░▌▒▒▒▒▒░░░░░░▒▒▒▒▒▒▒▐░░░░░░░
 ░░░▌▒▒▒░░░░░░░▒▒▒▒▒▒▒▐░░░░░░░░
        单身狗就这样默默地看着你，一句话也不说。
 */
public class XtanApplication extends Application {
    private static XtanApplication mInstance;

    public static XtanApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

    }


}
