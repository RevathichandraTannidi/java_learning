package Collections_java;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue  {
    public static void main(String[] args) {
Queue<String> q=new PriorityQueue<>();
//        q.add(3);
//        q.add(1);
//        q.add(4);
//        q.add(6);
//        q.add(8);
//        q.add(2);
//        q.add(11);
//        q.add(2);
//        q.add(4);
//        q.add(6);
        q.add("Apple");
        q.add("Orange");
        q.add("Mango");
        q.add("Guava");
        q.add("Grapes");
        q.add("Banana");
        q.add("Bingo");

        while(!q.isEmpty())
        {
            System.out.println(q);

        }

    //    q.add("promogrante");
        Iterator<String> itr=q.iterator();
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }
        
    }
}
