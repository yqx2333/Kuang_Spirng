package com.yqx.thread.demo01;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author fanzx
 * @create 2021/9/24 15:08
 * 多线程实现图片下载
 */
public class ImageUpload2 extends Thread {

    private String url;
    private String file;

    public ImageUpload2(String url,String file){
        this.url = url;
        this.file = file;
    }

    @Override
    public void run() {
        WebImageUpload webImageUpload = new WebImageUpload();
        webImageUpload.imageUpload(url,file);
    }

    public static void main(String[] args) {
        ImageUpload2 imageUpload1 = new ImageUpload2("url","fileName");
        ImageUpload2 imageUpload2 = new ImageUpload2("url","fileName");
        ImageUpload2 imageUpload3 = new ImageUpload2("url","fileName");
        imageUpload1.start();
        imageUpload2.start();
        imageUpload3.start();
    }
}
class WebImageUpload{
    public void imageUpload(String url,String file){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}