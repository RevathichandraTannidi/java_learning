package Collections_java;

import java.util.TreeSet;

public class Treesett {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("book");
        ts.add("apple");
        ts.add("run");
        ts.add("Apple");
        ts.add("nAuk");
        ts.add("SAT");
        ts.add("ball");
        ts.add("Zebra");
        ts.add("cat");

        ts.forEach((e)->{
            System.out.println(e);
        });
        System.out.println("\n");
        System.out.println(ts);
    ts.first();
        System.out.println(ts.first());
        System.out.println(ts.ceiling("jhi"));
        System.out.println(ts.floor("jhi"));
        System.out.println(ts.descendingSet());
        System.out.println(ts);
        System.out.println( ts.headSet("SAT",true));
        System.out.println(ts.tailSet("ball",false));
        System.out.println(ts.subSet("Apple","cat"));


    }
}
