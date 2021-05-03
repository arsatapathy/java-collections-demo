package com.arsatapathy.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> lh = new LinkedHashSet<>();

        lh.add("ashish");
        lh.add("ranjan");
        lh.add("satapathy");
        lh.add("ashish ranjan satapathy");

        Iterator<String> iterator = lh.iterator();

        System.out.println(lh);

        while (iterator.hasNext())
            System.out.println(iterator.next());

        Print print = () -> System.out.println(lh.getClass().getName());

        print.printing();
    }

    public interface Print {
        void printing();
    }
}
