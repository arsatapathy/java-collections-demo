package com.arsatapathy.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String args[]){
        List<Integer> linkedList = new LinkedList<>();

        for(int i=0; i < 5; i++)
            linkedList.add(i);

        System.out.println(linkedList);

        linkedList.remove(1);

        System.out.println(linkedList);

        linkedList.remove(2);

        System.out.println(linkedList);

        linkedList.add(2, 3);

        System.out.println(linkedList);

        linkedList.add(0);

        System.out.println(linkedList);

        System.out.println(linkedList.get(4));
    }
}
