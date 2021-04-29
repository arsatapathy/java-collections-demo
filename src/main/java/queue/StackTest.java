package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackTest {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < 5; i++)
            arrayDeque.push(i);


        System.out.println(arrayDeque);

        System.out.println(arrayDeque.pop());

        System.out.println(arrayDeque);
    }
}
