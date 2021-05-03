package com.arsatapathy.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("ashish");
        hashSet.add("ashish");
        hashSet.add("ashishx");
        hashSet.add("ranjan");
        hashSet.add("satapathy");
        hashSet.add("ashish ranjan satapathy");

        System.out.println(hashSet);

        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
