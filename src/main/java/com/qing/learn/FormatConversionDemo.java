package com.qing.learn;

import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;

/**
 * 格式转换
 */
public class FormatConversionDemo {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\resources\\images\\cat.jpg";

        Thumbnails.of(path)
                .size(1280,1024)
                .outputFormat("png")
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\13.png");

        Thumbnails.of(path)
                .size(1280,1024)
                .outputFormat("gif")
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\14.gif");
    }
}
