package pl.basics6.ppj.c13.file;

public class TopSecretFile extends File {

    public TopSecretFile(String name, int pages, String text) {
        super(name, pages, text);
    }

    @Override
    public void show() {
        String[] words = getText().split("\\s+");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                words[i] = substitute(words[i]);
            }
            stringBuffer.append(words[i]);
            stringBuffer.append(" ");
        }
        System.out.println(stringBuffer);
    }

    private String substitute(String word) {
        return word.replaceAll(".", "*");
    }
}
