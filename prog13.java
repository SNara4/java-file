import java.io.IOException;

//13.program to demonstrate exception throw \throws and user defined exception
class myexc extends Exception
{

    public String toString()
    {return " error its an odd no";}
}
public class prog13 {
    static void mynum() throws myexc, java.io.IOException
    {int i=System.in.read();
        if (i%3!=0)
            throw new myexc();
    }
    public static void main(String[] args)
    {
        int i,j;
        i=2; j=3;
        // a normal throw
        try
        {if (i%3==0|j%3==0)
            throw new myexc();}
        catch (myexc exc)
        {System.out.println(exc);}

        //catching exception thrown by function
        try{mynum();}
        catch(Exception exc)
        {System.out.println(exc);}

    }



}
