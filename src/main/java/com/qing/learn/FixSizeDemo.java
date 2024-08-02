package com.qing.learn;


import net.coobird.thumbnailator.Thumbnails;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 指定大小【缩放】
 */
public class FixSizeDemo {
    public static void main(String[] args) throws IOException {
        /*
         * 若图片横比200小，高比300小，不变
         * 若图片横比200小，高比300大，高缩小到300，图片比例不变
         * 若图片横比200大，高比300小，横缩小到200，图片比例不变
         * 若图片横比200大，高比300大，图片按比例缩小，横为200或高为300
         */
        String path = "src\\main\\resources\\images/cat.jpg";

        Thumbnails.of(path)
                .size(200, 300)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\1.jpg");

        Thumbnails.of(path)
                .size(2560, 2048)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\2.jpg");
    }
}
