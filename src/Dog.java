abstract  class Animal {
    abstract void bark();
void dispplay()
{
    System.out.println("i abstarct class");
}
}


public class Dog  extends Animal{
    @Override
    void bark() {
        System.out.println("hi im barking");
    }

    public static void main(String[] args) {
        Dog d=new Dog(); // by using the extends clSSS
        d.bark();
        d.dispplay();
        System.out.println("\n");
        Animal a=new Dog(); // by using the reference variable
        a.dispplay();
        a.bark();
    }
}
