//3.Program to demonstrate various loop
public class prog3 {
    public static void main(String args[])
    {int i=0;
        for (i=0;i<10;i++)
        System.out.println("Value  inside for loop:"+i);
        System.out.println("\nValue outside for loop:"+i+"\n");
        while (i>5) {
            System.out.println("Value inside while loop:"+i);
        i--;}
        System.out.println("\nValue outside while loop:"+i+"\n");
        do {
            System.out.println("Value inside do while loop:" + i);
            i--;
        }while (i>0);
        System.out.println("\nValue outside do while loop:"+i+"\n");
    }
}
