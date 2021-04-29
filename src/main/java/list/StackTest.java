package list;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 5; i++)
            stack.push(i);

        System.out.println(stack);

        Iterator<Integer> iterator = stack.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
