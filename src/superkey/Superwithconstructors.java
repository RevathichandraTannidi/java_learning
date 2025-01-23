package superkey;
class bus
{
    public bus()
    {
        System.out.println("this is the information the bus");
    }
}
class details extends bus{
    public  details()
    {
      //  super();
        System.out.println(" In the there are different types of busess ");
    }
}
class details1 extends details{
    public  details1()
    {
        //  super();
        System.out.println(" \n express \n travels \n public transport");
    }
}
class Tyres extends details1{
    public Tyres()
    {
        super();
        System.out.println(" it has four or six tyres");
    }

}

public class Superwithconstructors {
    public static void main(String[] args) {
      //  Tyres t=new Tyres();

        //Tyres t1=new Tyres();
        new Tyres();  // anonymous object


    }
}
