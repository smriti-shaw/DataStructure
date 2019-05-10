package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(12);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Integer t = (Integer) iterator.next();
            System.out.println(t);
        }
    }
}
