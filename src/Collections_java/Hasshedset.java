package Collections_java;

import java.util.HashSet;
import java.util.Iterator;

public class Hasshedset {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(2);
        hs.add(3);
        hs.add(29);
        hs.add(12);
        hs.add(77);
        Iterator<Integer> itr=hs.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println(hs.contains(29))
        ;

    }
}
