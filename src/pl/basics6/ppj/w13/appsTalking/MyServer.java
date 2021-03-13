package pl.basics6.ppj.w13.appsTalking;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(12345);
            System.out.println("server oczekuje");
            Socket soc = ss.accept();
            System.out.println("server połączył się");
            InputStream is = soc.getInputStream();
            int data = is.read();
            while (data != -1) {
                System.out.println((char) data);
                data = is.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
