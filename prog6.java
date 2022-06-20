//6.program to demonstrate class
class cars
{   int milage,price;
    String name;
     cars() // constructor
     {milage=0;
     price=0;
     name="NA";
         System.out.println("simple constructor invoked");}

    cars(int i,int j,String str) //parameterized constructor
    {milage=i;
    price=j;
    name=str;
        System.out.println("parametrized constructor invoked");}

    cars(cars a)
    {milage=a.milage;
    price=a.price;
    name=a.name;
        System.out.println("Copy constructor invoked");}

    void display()
    {System.out.println("the details are:");
        System.out.println(name+" "+ milage+" "+ price);
    }

    int range(int i){return milage*i;}

}
public class prog6 {
    public static void main(String[] args) {
        cars a = new cars();
        a.display();
        cars b = new cars(18, 240000, "alto");
        b.display();
        cars c = new cars(b);
        c.display();
        System.out.println("range of c in 5ltr fuel is"+c.range(5));
    }


}
