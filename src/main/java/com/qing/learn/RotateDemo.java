package com.qing.learn;

import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;

/**
 * 旋转
 */
public class RotateDemo {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\resources\\images\\cat.jpg";

        Thumbnails.of(path)
                .size(1280,1024)
                .rotate(90)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\6.jpg");

        Thumbnails.of(path)
                .size(1280,1024)
                .rotate(-90)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\7.jpg");
    }
}
