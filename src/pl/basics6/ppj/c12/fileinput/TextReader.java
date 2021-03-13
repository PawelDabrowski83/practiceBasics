package pl.basics6.ppj.c12.fileinput;

import java.io.FileInputStream;
import java.io.IOException;

public class TextReader {
    public static void main(String[] args) {

        try {
            FileInputStream fileIn = new FileInputStream("D:\\PpjTest.txt");
            boolean hokey = true;
            for (int i = 0; i < i + 1 && hokey; i++) {
                int currentInt = fileIn.read();
                char current = (char) currentInt;
                System.out.print(current);
                if (currentInt == -1) {
                    hokey = false;
                    {
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
