package strings;

public class Insertstr {
    public static void main(String[] args) {
        StringBuffer st=new StringBuffer();
        st.append("Revathi chandra");
        StringBuffer s=new StringBuffer();
        s.append("Tannidi");

        st.insert(7,s);
        System.out.println("string is:"+st);
    }
}
