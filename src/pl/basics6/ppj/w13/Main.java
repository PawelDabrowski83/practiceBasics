package pl.basics6.ppj.w13;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        task04();
    }

    public static void writeFile() {
        try {
            FileWriter fw = new FileWriter("D:\\PPJ\\Nowy folder\\2.txt");
            fw.write("abcefg123456NEW");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        try {
            FileReader fr = new FileReader("D:\\PPJ\\Nowy folder\\2.txt");
            int data = fr.read();
            while(data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task3() {
        InputStream is = System.in;

        try {
            int data = is.read();
            while (data != -1) {
                System.out.println((char) data + " - " + data);
                data = is.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task04() {
//        try {
//            FileReader fr = new FileReader("D:\\PPJ\\Nowy folder\\2.txt");
//            int data = fr.read();
//            String str = new String();
//            while(data != -1) {
//                str += (char) data;
//                data = fr.read();
//            }
//            System.out.println(str);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        for (int i = 1000; i < 100_000_000; i*= 10) {
            System.out.print(i + "\t");
            long startTime = System.currentTimeMillis();
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < i; j++) {
                sb.append('a');
            }

            System.out.println(System.currentTimeMillis() - startTime);
        }

    }

    public static void task5() {
        A a = new A();
        try {
            FileOutputStream fos = new FileOutputStream("D:\\PPJ\\2.obj");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(a);
            ous.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("D:\\PPJ\\2.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            System.out.println("odczytano:");
            System.out.println(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class A implements Serializable {
        int wrt = 5;
        String str = "";

        @Override
        public String toString() {
            return "A{" +
                    "wrt=" + wrt +
                    ", str='" + str + '\'' +
                    '}';
        }
    }
}
