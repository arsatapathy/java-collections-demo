package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < 5; i++)
            arrayDeque.add(i);


        System.out.println(arrayDeque);

        arrayDeque.addFirst(-1);

        arrayDeque.addLast(-1);

        System.out.println(arrayDeque);
    }
}
