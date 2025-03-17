package optionalClass;

import java.util.Arrays;
import java.util.List;

public class findingName {
    public static void main(String[] args) {
        List<String> li= Arrays.asList("Tom","John","Sam ","sandy");
        String name=li.stream().filter(s->s.contains("J")).findFirst().orElse("no name found");
        System.out.println(name);
    }
}
