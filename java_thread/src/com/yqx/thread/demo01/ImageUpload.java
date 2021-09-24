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
public class ImageUpload extends Thread{
    private String url;
    private String fileName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ImageUpload(String url,String fileName){
        this.url = url;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downLoader(url,fileName);
        System.out.println("下载的文件名为:" + fileName);
    }

    public static void main(String[] args) {
        ImageUpload imageUpload = new ImageUpload("https://img0.baidu.com/it/u=1077360284,2857506492&fm=26&fmt=auto", "11111.jpg");
        ImageUpload imageUpload1 = new ImageUpload("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic3.zhimg.com%2F50%2Fv2-2c739e302fd6ed9b6c6d13b4c3e58b7b_hd.jpg&refer=http%3A%2F%2Fpic3.zhimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635060682&t=cac4d7350e58d7ce94142730ec59fc37", "22222.jpg");
        ImageUpload imageUpload2 = new ImageUpload("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2F50a5e3fa7feb094a0f9cf644d9231e1b3fa2cfb3133bb-XF2bdj_fw658&refer=http%3A%2F%2Fhbimg.b0.upaiyun.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1635060682&t=6bd65450d9346f56f0a44ebfaf398a41", "33333.jpg");
        // 下载图片
        imageUpload.start();
        imageUpload1.start();
        imageUpload2.start();
    }
}
class WebDownLoader{
    /**
     * 图片下载帮助类
     * @param url
     * @param fileName
     */
    public void downLoader(String url,String fileName){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("downLoaderError" + e);
        }
    }
}
