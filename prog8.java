//8.program to demonstrate method overriding and polymorphism
class shape{
    void show(){System.out.println("A normal shape");}
}
class twod extends shape{
    void show(){System.out.println("A 2d shape");}
}
class square extends twod{
    void show(){System.out.println("a square");}
}
public class prog8 {
    public static void main(String[] args){
        shape s=new shape();
        twod s1=new twod();
        square s2=new square();
        s.show();
        s1.show();
        s2.show();
        s=s1;
        s.show();
        s=s2;
        s.show();
    }
}
