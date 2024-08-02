package com.qing.learn;

import net.coobird.thumbnailator.Thumbnails;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 输出流
 */
public class OutputStreamosDemo {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\resources\\images\\cat.jpg";

        OutputStream os= new FileOutputStream("C:\\Users\\Administrator\\Desktop\\temp\\img\\15.jpg");
        Thumbnails.of(path)
                .size(1280,1024)
                .toOutputStream(os);
    }
}
