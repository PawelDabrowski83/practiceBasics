package pl.basics6.ppj.w11;

public class Main {
    public static void main(String[] args) {
        stackTest();
    }

    public static void listTest() {
        MyList myList = new MyList();
        myList.add(10);
        myList.add(20);
        myList.insert(1, 15);
        myList.show();
    }

    public static void stackTest() {
        MyStack myStack = new MyStack();
        try {
            myStack.push(10);
            myStack.push(20);
            myStack.push(30);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
