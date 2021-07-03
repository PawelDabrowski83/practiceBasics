package pl.basics9.gui.cw.cw04.task4;

public class Main {
    public static void main(String[] args) {
        CountingList countingList = new CountingList();

        countingList.add("Ala");
        countingList.add("dom");
        countingList.add("Andrzej Duda");

        System.out.println(countingList.get(2));

        System.out.println(countingList.count(1));

        System.out.println(countingList);
    }
}
