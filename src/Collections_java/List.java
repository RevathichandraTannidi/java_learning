package Collections_java;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(7);
        a.add(6);
        a.add(3);
        Iterator<Integer> itr=a.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println( a.removeLast());
        System.out.println(a);


    }
}
