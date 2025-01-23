package strings;

public class subStringGener {
    public static void main(String[] args) {
        String str = "The Cat";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                System.out.println(substring );
            }
        }
    }
}
