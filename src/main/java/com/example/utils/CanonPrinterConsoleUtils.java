package com.example.utils;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.squareup.okhttp.*;
import com.squareup.okhttp.internal.framed.Header;

import java.io.IOException;
import java.net.HttpCookie;

/**
 * @author YouChuanlong
 * @date 2022/12/12 14:06
 */
public class CanonPrinterConsoleUtils {

    private String printerConsoleAddress = "http://192.168.1.88:8000/";

    private String sessionId;


    /**
     * 模拟登陆
     * @param username 账号
     * @param password 密码
     */
        public void login(String username,String password) {

            OkHttpClient client = new OkHttpClient();
            //Header header = new Header();

            Request req = new Request.Builder().build();
            HttpCookie ckSessionId = new HttpCookie("sessionid","eb962ba7a04d416b90aa1f5ae6c7cd55");
            HttpCookie canonLoginSsn = new HttpCookie("com.canon.meap.service.login.session","9855558");
            HttpCookie portalLang = new HttpCookie("portalLang","ch");
            HttpCookie iR = new HttpCookie("iR","3323276457");
            HttpCookie[] cookies = new HttpCookie[] {ckSessionId,canonLoginSsn,portalLang};
            HttpRequest request = HttpRequest.post(printerConsoleAddress + "portal").cookie(cookies);
            HttpResponse resp = request.execute();

            String body = resp.body();
            System.out.println(body);

        }

    public static void main(String[] args) {
        CanonPrinterConsoleUtils utils = new CanonPrinterConsoleUtils();
        utils.login("","");
    }
}
