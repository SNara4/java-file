//10.program to demonstrate interface
class circle implements area {
    circle(){totalarea(5);}
    public void totalarea(int r)
    {System.out.println("the total area is:"+pi*r*r);}
}
public class prog10{
   public static void main(String [] args)
   {circle c=new circle();
   }
}
