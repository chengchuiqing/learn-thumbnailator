package com.qing.learn;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import java.io.IOException;

/**
 * 裁剪
 */
public class CroppingDemo {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\resources\\images\\cat.jpg";

        //图片中心400*400的区域
        Thumbnails.of(path)
                .sourceRegion(Positions.CENTER,400,400)
                .size(200,200)
                .keepAspectRatio(false)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\10.jpg");

        //图片右下400*400的区域
        Thumbnails.of(path)
                .sourceRegion(Positions.BOTTOM_RIGHT,400,400)
                .size(200,200)
                .keepAspectRatio(false)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\11.jpg");

        //指定坐标
        Thumbnails.of(path)
                .sourceRegion(600,500,400,400)
                .size(200,200)
                .keepAspectRatio(false)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\12.jpg");
    }
}
