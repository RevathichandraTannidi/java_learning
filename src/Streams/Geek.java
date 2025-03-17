package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Geek
{
    // Driver code
    public static void main(String[] args) {

        // Creating a List of Strings
        List<List<String>> listof = Arrays.asList(Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg"),
                Arrays.asList("Geeks","book","pen"),Arrays.asList("apple", "banana", "cherry")
        );


        // Using Stream flatMap(Function mapper)
      List<String> li=  listof.stream()
                .flatMap(List::stream)
              .map(str -> str.length() >=2 ? str.substring(0, 2) : str)
              .collect(Collectors.toUnmodifiableList());
        System.out.println(li);
    }

}