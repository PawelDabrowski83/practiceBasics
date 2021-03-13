package pl.basics6.ppj.c13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    static final String keywords[] = { "abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "extends", "false",
            "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while" };

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        String filepath = "D:\\PPJ\\PPJ_31_1107.java";
        checkWords(filepath);
    }

    public static void checkWords(String filepath) {
        String[] wordsInFile = new String[0];
        try {
            FileInputStream fis = new FileInputStream(filepath);
            int data = fis.read();
            StringBuffer stringBuffer = new StringBuffer();
            while (data != -1) {
                stringBuffer.append((char) data);
                data = fis.read();
            }
            fis.close();
            wordsInFile = stringBuffer.toString().split("\\s+");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < keywords.length; i++) {
            System.out.print("Słowo kluczowe: " + keywords[i]);
            int counter = 0;
            for (int j = 0; j < wordsInFile.length; j++) {
                if (keywords[i].equals(wordsInFile[j].trim())) {
                    counter++;
                }
            }
            System.out.println(" wystąpienia: " + counter);
        }

    }
}
