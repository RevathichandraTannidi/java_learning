package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class PositiveOrNgativeChecker {
    public static void main(String[] args) {
        // Using Optional to filter positive integers
        List<Integer> numbers = Arrays.asList(-3, -3, -5,0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> positiveNumbers = numbers.stream()
                .filter(n -> Optional.of(n).filter(x -> x > 0).isPresent())
                .collect(Collectors.toList());

        // Using Optional to filter negative integers
        List<Integer> negativeNumbers = numbers.stream()
                .filter(n -> Optional.of(n).filter(x -> x < 0).isPresent())
                .collect(Collectors.toList());

        // Using Optional to filter zero (if any)
        List<Integer> zeroNumbers = numbers.stream()
                .filter(n -> Optional.of(n).filter(x -> x == 0).isPresent())
                .collect(Collectors.toList());

        System.out.println("Positive Numbers: " + positiveNumbers);
        System.out.println("Negative Numbers: " + negativeNumbers);
        System.out.println("Zero Numbers: " + zeroNumbers);
    }
}