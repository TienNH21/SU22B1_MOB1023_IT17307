package buoi7_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);
        
        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
        
        System.out.println("------------------");
//        list.addAll(set);
//        list.add(6);
//        set.addAll(list);
//        System.out.println("HashSet: " + set);

        Collections.shuffle(list);
        System.out.println("ArrayList: " + list);
        
        System.out.println("------------------");
        
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);
            }
        };
        
        Collections.sort(list, c);
        System.out.println("ArrayList: " + list);
        
        
        Collections.reverse(list);
        System.out.println("ArrayList: " + list);
    }
}
