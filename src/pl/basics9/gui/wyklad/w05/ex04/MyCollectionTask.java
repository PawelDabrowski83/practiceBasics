package pl.basics9.gui.wyklad.w05.ex04;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;

public class MyCollectionTask {

    List<MyItem> list = new LinkedList<>();

    private Integer x, y;

    public void accept(Integer d) {
        x = y;
        y = d;
        if (x != null) {
            list.add(new MyItem(x, y));
            y = null;
        }
    }

    public MyCollectionTask combine(MyCollectionTask other) {
//        throw new UnsupportedOperationException();
        this.list.addAll(other.list);
        return this;
    }

    public List<MyItem> finish() {
        return list;
    }

    public static Collector<Integer, ?, List<MyItem>> collector() {
        return Collector.of(
            MyCollectionTask::new,
            MyCollectionTask::accept,
            MyCollectionTask::combine,
            MyCollectionTask::finish
        );
    }
}
