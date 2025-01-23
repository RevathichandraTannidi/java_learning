package strings;

public class duplicates {
    public static void main(String[] args) {
        String s = "the cool guy is the eammu and the rammu is also cool";
        occurences(s);
    }


    public static void occurences(String s) {
        String[] words = s.toLowerCase().split("\\s");

        int count1=0;

        for (int i = 0; i < words.length; i++)
        {
            count1++;
        }
        System.out.println("count is :"+count1);


            for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = null;
                }
            }
            if (count > 1) {
                System.out.println(words[i] + ": " + count);
            }
        }
    }
    }

