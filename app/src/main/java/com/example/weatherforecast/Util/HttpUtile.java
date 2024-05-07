package com.example.weatherforecast.Util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

//okhttp出色封装三行完成与服务器交互
//全国数据在服务器端实现,使用OKHTTP发起http请求，传入请求并注册回调处理服务器响应
public class HttpUtile {
  public static void    sendOkHttpRequest(String address,okhttp3.Callback callback) {
    OkHttpClient client  = new OkHttpClient();
    //request属于不能继承的类初始化Builder静态类调用url方法，最后调用Requset的build方法
    Request request = new Request.Builder().url(address).build();
    client.newCall(request).enqueue(callback);
  }

}
