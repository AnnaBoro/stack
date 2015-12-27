package lesson7.stack;


import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack {


    private LinkedList stackL;

    public Stack() {

        stackL = new LinkedList();
    }

    public void push(Object o) {

        stackL.addLast(o);
    }

    public Object pop() {

        if (stackL.isEmpty()) {
            return new NoSuchElementException();
        }
        Object obj  = stackL.getLast();
        stackL.removeLast();
        return obj;
    }

    public Object peek() {

        if (stackL.isEmpty()) {
            return new NoSuchElementException();
        }
        return stackL.getLast();
    }
}
