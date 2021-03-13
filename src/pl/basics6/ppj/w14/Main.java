package pl.basics6.ppj.w14;

public class Main {
    public static void main(String[] args) {
        String str = "23.01.2021";

        int sep = 0;
        for (int i=0; i < str.length(); i++) {
            if (str.charAt(i) == '/' || str.charAt(i) == '.') {
                System.out.println(
                        str.substring(sep, i)
                );
                sep = i + 1;
            }
        }
        System.out.println("********");
        for (String s : str.split("\\.")) {
            System.out.println(s);
        }

        System.out.println(str);
    }
}
