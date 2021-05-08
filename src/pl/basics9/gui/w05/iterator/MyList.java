package pl.basics9.gui.w05.iterator;

import pl.basics9.gui.w01.persons.Element;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyList<T> implements Iterable<T>{

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            //Element<T> e = head;

            @Override
            public boolean hasNext() {
              //  return e != null;
                return false;
            }

            @Override
            public T next() {
                //T tmp = e.stud;
                // element = e.next
                return null;
            }
        };
    }
}
