package com.qing.learn;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class WatermarkDemo {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\resources\\images\\cat.jpg";
        String watermarkPath = "src\\main\\resources\\images\\pinup.png";

        Thumbnails.of(path)
                .size(1280,1024)
                .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(watermarkPath)),0.5f)
                .outputQuality(0.8f)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\8.jpg");

        Thumbnails.of(path)
                .size(1280,1024)
                .watermark(Positions.CENTER,ImageIO.read(new File(watermarkPath)),0.5f)
                .outputQuality(0.8f)
                .toFile("C:\\Users\\Administrator\\Desktop\\temp\\img\\9.jpg");
    }
}
