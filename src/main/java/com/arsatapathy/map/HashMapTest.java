package com.arsatapathy.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        Map<Integer,String> studentHash = new HashMap<>();

        studentHash.put(1, "ashish");
        studentHash.put(2, "ranjan");
        studentHash.put(3, "satapathy");
        System.out.println(studentHash);
        System.out.println(studentHash.get(1));
        studentHash.put(1, "snighda");
        System.out.println(studentHash.get(1));

        System.out.println(studentHash);


    }
}
