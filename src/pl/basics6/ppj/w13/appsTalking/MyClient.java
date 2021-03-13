package pl.basics6.ppj.w13.appsTalking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket soc = new Socket("127.0.0.1", 12345);
            OutputStream os = soc.getOutputStream();

            InputStream is = System.in;
            try {
                int data = is.read();
                while(data != -1) {
                    os.write(data);
                    os.flush();
                    data = is.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
