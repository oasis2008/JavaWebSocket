package com.zhangke.websocket.util;

import android.util.Log;

/**
 * Logable 默认实现类
 * <p>
 * Created by ZhangKe on 2019/4/29.
 */
public class LogImpl implements Logable {

    private static final String TAG = "Java-WebSocket";

    @Override
    public void v(String tag, String msg) {
        Log.v(TAG, msg);
    }

    @Override
    public void v(String tag, String msg, Throwable tr) {
        Log.v(TAG, msg, tr);
    }

    @Override
    public void d(String tag, String text) {
        Log.d(TAG, text);
    }

    @Override
    public void d(String tag, String text, Throwable tr) {
        Log.d(TAG, text, tr);
    }

    @Override
    public void i(String tag, String text) {
        Log.i(TAG, text);
    }

    @Override
    public void i(String tag, String text, Throwable tr) {
        Log.i(TAG, text, tr);
    }

    @Override
    public void e(String tag, String text) {
        Log.e(TAG, text);
    }

    @Override
    public void e(String tag, String msg, Throwable tr) {
        Log.e(TAG, msg, tr);
    }

    @Override
    public void w(String tag, Throwable tr) {
        Log.w(TAG, tr);
    }

    @Override
    public void wtf(String tag, String msg) {
        Log.wtf(TAG, msg);
    }

    @Override
    public void wtf(String tag, Throwable tr) {
        Log.wtf(TAG, tr);
    }

    @Override
    public void wtf(String tag, String msg, Throwable tr) {
        Log.wtf(TAG, msg, tr);
    }
}
