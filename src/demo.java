import java.util.*;
public class demo {
        static void showcaseCollectionsUsage() {

            int[] numbersArray = new int[]{1, 2, 3, 4};

            List<Integer> numbersList = new ArrayList<>();
            Map<Integer, String> numbersMap = new HashMap<>();

            numbersList.add(1);
            numbersList.add(2);

            numbersMap.put(1, "alpha");
            numbersMap.put(2, "beta");

            System.out.println("First element of numbersArray: " + numbersArray[0]);

            System.out.println("First element of numbersList: " + numbersList.get(0));

            System.out.println("Value for key 1 in numbersMap: " + numbersMap.get(1));

            System.out.println("\nIterating over numbersArray:");

            for (int num : numbersArray) {
                System.out.println("Element: " + num);
            }
            // Header for iterating over the ArrayList.
            System.out.println("\nIterating over numbersList:");
            // Iterate through the ArrayList and print each element.
            for (Integer num : numbersList) {
                System.out.println("Element: " + num);
            }
            // Header for iterating over the HashMap.
            System.out.println("\nIterating over numbersMap:");
            // Iterate through the HashMap and print each key-value pair.
            for (Map.Entry<Integer, String> entry : numbersMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }

        public static void main(String[] args) {
            showcaseCollectionsUsage();
        }

    }

