package Collections_java;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priortyq {
    public static void main(String[] args) {
        PriorityQueue<Integer> n=new PriorityQueue<>();
        n.add(1);
        n.add(-1);
        n.add(3);
        n.add(2);
        n.add(-7);
        n.add(-5);
        n.add(11);
        n.add(6);
        Iterator<Integer> itr=n.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
