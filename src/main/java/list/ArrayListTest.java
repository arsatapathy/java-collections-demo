package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String args[]){
        List<Integer> arrayList = new ArrayList<>();

        for (int i=1; i<5; i++)
            arrayList.add(i);

        System.out.println(arrayList);

        System.out.println(arrayList.get(0));

        arrayList.add(5);
        arrayList.add(3, 5);

       System.out.println(arrayList);

       arrayList.remove(0);

       System.out.println(arrayList);

        System.out.println(arrayList.get(0));

    }
}
