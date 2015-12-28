package com.example.bajian.ndkdemo;

/**
 * Created by bajian on 2015/12/28.
 * email 313066164@qq.com
 */
public class NDKJniUtil {

    static {
        System.loadLibrary("NDKJniUtil");   //defaultConfig.ndk.moduleName
    }
    public native String getCString();
}
