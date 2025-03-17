package optionalClass;

import java.util.Optional;

public class StringToInteger {
    public static void main(String[] args) {
        Optional<String> num= Optional.of("133");
        if(num.isPresent()){
            try{
            Optional<Integer> number= num.map(Integer::parseInt);
            System.out.println(number.get());
        }
        catch (NumberFormatException e){

            System.out.println(Optional.empty());

            }
        }
        else
            System.out.println("no value found");

    }
}
