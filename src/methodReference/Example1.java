package methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("Tom","John","Sam ","ramu","sandy");
     //   List<String> uNames = names.stream().map(S->S.toUpperCase()).toList();
       List<String> uNames = names.stream().map(String::toUpperCase).toList();
       uNames.forEach(  System.out::println
       );
        System.out.println(uNames);


        List<Student> st=new ArrayList<>();

        st=names.stream().map(Student::new).toList();
//        for(String name:names) {
//            st.add(new Student(name));
//        }
        System.out.println(st);
    }
}

class Student{
    String name;
    int age;
    public Student(String name) {
        this.name = name;

    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}