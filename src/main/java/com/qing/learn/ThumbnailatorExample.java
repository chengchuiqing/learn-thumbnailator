package com.qing.learn;

import net.coobird.thumbnailator.Thumbnails;
import java.io.File;
import java.io.IOException;

public class ThumbnailatorExample {
    public static void main(String[] args) {
        try {
            // 获取资源文件夹中的图片路径
            File sourceFile = new File(ThumbnailatorExample.class.getResource("/images/cat.jpg").toURI());
            
            // 指定输出文件路径
            File outputFile = new File("C:\\Users\\Administrator\\Desktop\\temp\\img\\thumbnail.jpg");
            
            // 生成缩略图
            Thumbnails.of(sourceFile)
                      .size(100, 100) // 设置缩略图的尺寸
                      .toFile(outputFile); // 输出文件
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}