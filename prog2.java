//1.program to demonstrate various operators in java
public class prog2 {
    public static void main(String args[])
    {int a,b,c;
        a=19;b=4;
        System.out.println("Arithmetic operator:");
        System.out.println("The basic java program");
        c=a+b;
        System.out.println("the sum of "+a+" and "+b +" is:"+c);
        c=a-b;
        System.out.println("the diff of "+a+" and "+b +" is:"+c);
        c=a*b;
        System.out.println("the product of "+a+" and "+b +" is:"+c);
        c=a/b;
        System.out.println("the division of "+a+" and "+b +" is:"+c);
        c=a%b;
        System.out.println("the mod of "+a+" and "+b +" is:"+c);

        int i, j;
        boolean b1, b2;
        i = 10;j = 11;
        System.out.println("\nRelational operator:");
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("this won't execute");
        if(i >= j) System.out.println("this won't execute");
        if(i > j) System.out.println("this won't execute");
        b1 = true;b2 = false;

        System.out.println("\nLogical operator:");
        if(b1 & b2) System.out.println("this won't execute");
        if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if(b1 | b2) System.out.println("b1 | b2 is true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true");
        if(i != 0 && (i % j) == 0) //short circuit and
            System.out.println(j + " is a factor of " + i);
        System.out.println("\nBitwise operator:");
        byte val1,val2;
        val1=101; val2=100;
        System.out.println("Bitwise and "+val1+" &"+val2+" :"+(val1&val2));
        System.out.println("Bitwise or "+val1+" |"+val2+" :"+ (val1|val2));
        System.out.println("Bitwise xor "+val1+" ^"+val2+" :"+ (val1^val2));
        System.out.println("Bitwise not "+val1+" :"+ (~val1));
        System.out.println("Bitwise right shift "+val1+" :"+ (val1>>1));
        System.out.println("Bitwise left shift "+val1+" :"+ (val1<<1));

    }
}
