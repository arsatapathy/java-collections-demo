package map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableTest {
    public static void main(String[] args) {
        Map<Integer, String> ht = new Hashtable<>();

        ht.put(1, "ashish");
        ht.put(2, "ranjan");
        ht.put(3, "satapathy");

        System.out.println(ht);

        Iterator<String> iterator = ht.values().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
