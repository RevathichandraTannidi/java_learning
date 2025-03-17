package optionalClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Tom","John","Sam ","ramu","sandy");
        Optional <List<String>> name= Optional.of(names.stream().filter(s -> s.contains("m")). toList());
        System.out.println(name.orElse(Collections.singletonList("no name found")));
    }
}
