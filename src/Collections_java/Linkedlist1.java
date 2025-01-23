package Collections_java;

import java.util.LinkedList;

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(2);
        li.add(33);
        li.add(21);
        li.add(1);
        li.add(43);
        li.add(23);
        li.add(12);
        for(Integer li1:li)
        {
            System.out.println(li1);
        }

        System.out.println(li.remove());
        System.out.println(li);
        System.out.println(li.pop());
        System.out.println(li);

    }
}
