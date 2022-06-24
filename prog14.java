import java.io.IOException;

//14.program to demonstrate read and write on console
public class prog14 {
    public static void main (String[] args) throws IOException
    {byte[] b=new byte[10];
        System.out.println("write something");
        System.in.read(b);
        for (int i=0;i<b.length;i++)
            System.out.print((char)b[i]);
    }
}
