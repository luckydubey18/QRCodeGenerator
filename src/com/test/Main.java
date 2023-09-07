package com.test;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\DELL\\Desktop\\qr.jpg");

            String content = "This is my generated qr code welcomm!!!";

            ByteArrayOutputStream out = QRCode.from(content).to(ImageType.PNG).stream();

            FileOutputStream fos = new FileOutputStream(file);
            fos.write(out.toByteArray());
            fos.close();
            System.out.println("Success");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
