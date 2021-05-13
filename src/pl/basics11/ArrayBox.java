package pl.basics11;


public class ArrayBox<T extends Comparable<T>> {

    private Object[] values;
    private int counter = 0;
    private int capacity;

    public ArrayBox(int capacity) {
        this.capacity = capacity;
        this.values = new Object[capacity];
    }

    public boolean add(T t) {
        if (!hasElement(t)) {
            if (counter < capacity) {
                values[counter] = t;
                counter++;
                return true;
            } else if (counter == capacity){
                doubleValues();
                values[counter] = t;
                counter++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean delete(T t) {
        int position = findElement(t);
        if (position != -1) {
            // usuwa
            values[position] = null; // [1, 2, null, 4, 5]
                                        // [1, 2, 4, 5]
            Object[] tmp = new Object[values.length -1];

            for (int i = 0; i < values.length; i++) {
                // i 0 1 2 3 4 5 6
                // V 1 2 3 4 5
                // T 1 2 . 4 5
                if (i < position) {
                    tmp[i] = values[i];
                }

                if (i > position) {
                    tmp[i - 1] = values[i];
                }
            }
            values = tmp;
            counter -= 1;

            return true;
        } else {
            return false;
        }
    }

    public boolean swap(int pos1, int pos2) {
        if (pos1 <= counter && pos2 <= counter) {
            Object tmp = values[pos1];
            values[pos1] = values[pos2];
            values[pos2] = tmp;
            return true;
        }
        return false;
    }

    public int search(T t) {
        return findElement(t);
    }

    public T min() {
        T tmp = (T) values[0];

        for (int i = 0; i < counter; i++){ // [0, 1, 2, 3, 4]
            T current = (T) values[i];
                if (current.compareTo(tmp) < 0) {
                    tmp = current;
            }
        }
        return tmp;
    }


    private void doubleValues(){
        Object[] tmp = new Object[values.length * 2];
        for (int i = 0; i < values.length; i++) {
            tmp[i] = values[i];
        }
        values = tmp;
        capacity = values.length;
    }

    private boolean hasElement(T t){
        for (int i = 0; i < counter; i++) {
            if (values[i].equals(t)) {
                return true;
            }
        }

        return false;
    }

    private int findElement(T t){
        for (int i = 0; i < counter; i++) {
            if (values[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }


}
