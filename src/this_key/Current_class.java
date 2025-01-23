package this_key;
class person{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display()
    {
        System.out.println("details o a person");
        System.out.println("name is " + getName());
        System.out.println("age is " +getAge());
        System.out.println("\n");
    }
}

public class Current_class {
    public static void main(String[] args) {
person p= new person();
p.setName("revathi");
p.setAge(22);
p.display();

new person(){
    {
        setName("someswari");
        setAge(28);
        display();
    }
};

    }
}
