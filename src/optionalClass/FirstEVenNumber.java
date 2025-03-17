package optionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEVenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> firsteven=numbers.stream().filter(n->n%2==0).findFirst();
        System.out.println(firsteven.orElse(-1));

    }
}
