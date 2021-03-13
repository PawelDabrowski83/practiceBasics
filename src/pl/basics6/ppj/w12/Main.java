package pl.basics6.ppj.w12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String pathfile = "D:\\PPJ\\folder\\1.txt";

        try {
            FileOutputStream fos = new FileOutputStream(pathfile);
            fos.write(123453675 >> 24);
            fos.write(123453675 >> 16);
            fos.write(123453675 >> 8);
            fos.write(123453675 >> 0);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(pathfile);
//            System.out.println(fis.read());
//            fis.close();
            int tmp = 0;
            for (int i = 0; i < 4; i++) {
                tmp = (tmp << 8) | fis.read();
            }
            fis.close();

            System.out.println(tmp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
