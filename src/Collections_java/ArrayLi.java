package Collections_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLi {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(90);
        li.add(299);
        li.add(01);
        li.add(56);
        li.add(00);
        li.add(43);
        Iterator<Integer> it=li.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        Collections.sort(li);
        System.out.println(li);
        Collections.swap(li,0,3);
        System.out.println(li);
        System.out.println(Collections.max(li));
        Collections.reverse(li);
        System.out.println(li);
        System.out.println(li.getLast());



    }
}
