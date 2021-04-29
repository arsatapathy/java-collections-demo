package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();

        ts.add("ashish");
        ts.add("ranjan");
        ts.add("satapathy");
        ts.add("ashish ranjan satapathy");

        System.out.println();
    }
}
