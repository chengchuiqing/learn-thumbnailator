package com.qing.learn;

import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;

/**
 * 不按照比例，指定大小进行缩放
 */
public class NotSizeDemo {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\resources\\images/cat.jpg";

        Thumbnails.of(path)
                .size(200,200)
                .keepAspectRatio(false)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\5.jpg");
    }
}
