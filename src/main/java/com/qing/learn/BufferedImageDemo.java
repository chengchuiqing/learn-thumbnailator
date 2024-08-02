package com.qing.learn;

import net.coobird.thumbnailator.Thumbnails;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BufferedImageDemo {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\resources\\images\\cat.jpg";

        BufferedImage thumbnail= Thumbnails.of(path)
                .size(1280,1024)
                .asBufferedImage();
        ImageIO.write(thumbnail,"jpg", new File("C:\\Users\\Administrator\\Desktop\\temp\\img\\16.jpg"));
    }
}
