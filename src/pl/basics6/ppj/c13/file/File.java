package pl.basics6.ppj.c13.file;

public class File {
    private final String name;
    private final int pages;
    private final String text;

    public File(String name, int pages, String text) {
        this.name = name;
        this.pages = pages;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void show() {
        System.out.println("Do you have clearance?");
    }
}
