package com.arsatapathy.list;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        for(int i = 0; i < 5; i++)
            vector.add(i);

        System.out.println(vector);

        vector.add(0);

        System.out.println(vector);

        vector.remove(5);

        System.out.println(vector);
    }
}
