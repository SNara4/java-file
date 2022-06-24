//7.program to demonstrate inheritance
class cars
{       int milage,price;
        String name;
        cars() // constructor
        {milage=0;
        price=0;
        name="NA";
        System.out.println("cars simple constructor invoked");}

        cars(int i,int j,String str) //parameterized constructor
        {milage=i;
        price=j;
        name=str;
        System.out.println("cars parametrized constructor invoked");}

        cars(cars a)
        {milage=a.milage;
        price=a.price;
        name=a.name;
        System.out.println("cars Copy constructor invoked");}

        void display()
        {System.out.println("the details are:");
        System.out.println(name+" "+ milage+" "+ price);
        }

        int range(int i){return milage*i;}
}
class disel extends cars
{       int power;
        static int tax;
        disel()
        {super(18,500000,"nexon");
        power=100;
        tax=5;
        System.out.println("Constructor of disel class invoked");
        }
        void display(){
         System.out.println("The details of disel cars milage"+milage+" price:"+ (price*(100+tax)/100));
         System.out.println(" name :"+name+" power:"+power);
        }


}
public class prog7 {
        static public void main(String [] args)
        { disel d1=new disel();
        d1.display();
        disel.tax=20;
        d1.display();}
}
