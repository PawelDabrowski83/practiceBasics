package pl.basics9.gui.w05.ex04;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<MyItem> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int x, y;
            x = (int) (Math.random() * 99);
            y = (int) (Math.random() * 99);
            MyItem item = new MyItem(x, y);
            list.add(item);
            System.out.println(item);
        }

        System.out.println("==========");
        List<MyItem> listSR = Stream.generate(Math::random)
            .limit(20)
            .map(e -> (int) e.doubleValue() * 99)
            .collect(MyCollectionTask.collector())
        ;

        listSR.stream().forEach(System.out::println);

        System.out.println("==========");
        Stream.generate(Math::random)
                .limit(20)
                .map(e -> (int) e.doubleValue() * 99)
                .collect(
                    Collector.of(
                            () -> new LinkedList<MyItem>(),
                            (ll, valInt) -> {
                                if(ll.isEmpty()) {
                                    MyItem myItem = new MyItem();
                                    myItem.y = valInt;
                                    ll.add(myItem);
                                } else {
                                    MyItem myItem = ll.getLast();
                                    if(myItem.x == null) {
                                        myItem.x = myItem.y;
                                        myItem.y = valInt;
                                    } else {
                                        myItem = new MyItem();
                                        myItem.y = valInt;
                                        ll.add(myItem);
                                    }
                                }
                            },
                            (list1, list2) -> {
                                list1.addAll(list2);
                                return list1;
                            },
                            ll -> ll
                    )
                ).stream().forEach(System.out::println);
                ;

        listSR.stream().forEach(System.out::println);
    }
}

class MyItem{
    Integer x, y;

    public MyItem() {
    }

    public MyItem(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " - " + y + " =";
    }
}
