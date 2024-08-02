package com.qing.learn;


import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;

/**
 * 按照比例进行缩放
 */
public class ScaleSizeDemo {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\resources\\images/cat.jpg";

        Thumbnails.of(path)
                .scale(0.25f)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\3.jpg");

        Thumbnails.of(path)
                .scale(1.10f)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\4.jpg");
    }
}
