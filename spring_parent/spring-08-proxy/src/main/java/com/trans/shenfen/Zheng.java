package com.trans.shenfen;

import org.apache.http.HttpResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fanzx
 * @create 2021/8/16 17:21
 */
public class Zheng {

    public static void main(String[] args) {
        String host = "https://idcard.market.alicloudapi.com";
        String path = "/lianzhuo/idcard";
        String method = "GET";
        String appcode = "d3e69784e7084ee88fa0ba8b07498da8";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("cardno", "");
        querys.put("name", "于清晰");


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
