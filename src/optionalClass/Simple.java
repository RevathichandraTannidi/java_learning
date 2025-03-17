package optionalClass;

import java.util.Optional;

public class Simple {
    public static void main(String[] args) {
        String[] word = new String[10];
        Optional<String> checkNull = Optional.ofNullable(word[5]);
        if (checkNull.isPresent()) {
            String lowercaseString = word[5].toLowerCase();
            System.out.print(lowercaseString);
        } else
            System.out.println("string value is not present");
    }
}

