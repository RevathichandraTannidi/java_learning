package Collections_java;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue
{
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.add(5);
        q.add(1);
        q.add(3);
        q.add(8);
        q.add(2);
        q.add(4);
        Iterator<Integer> itr=q.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
