import java.io.*;

//15. program to demonstrate file io using byte and character stream
class byteio {
    void iowrite() {
        try {
            var fout = new FileOutputStream("bfile", true);
            int b = 100;
            System.out.println("Writing in bfile");
            fout.write(b);
            fout.close();
        } catch (FileNotFoundException exc) {
            System.out.print(exc);
        } catch (IOException exc) {
            System.out.print("write error" + exc);
        }
    }

    void ioread() {
        try {
            var fin = new FileInputStream("bfile");
            int b = fin.read();
            System.out.println("Value read from bfile is :"+b);
            fin.close();
        } catch (IOException exc) {
            System.out.print("read error " + exc);
        }
    }

    void Binaryread() {
        int i = 0;
        double d = 0;
        try {
            var fin = new DataInputStream(new FileInputStream("Bifile"));
            i = fin.readInt();
            d = fin.readDouble();
            System.out.println("Values read from Bfile are" + i + " " + d);
            fin.close();
        } catch (IOException exc) {
            System.out.println("ERROR in Write " + exc);
        }
    }

    void Binarywrite() {
        int i = 100;
        double d = 100.00;
        try {
            var fout = new DataOutputStream(new FileOutputStream("Bifile", true));
           System.out.println("writing in Bfile");
            fout.writeInt(i);
            fout.writeDouble(d);
            fout.close();
        } catch (IOException exc) {
            System.out.println("ERROR in Write " + exc);
        }
    }
}

class Chario
{ void charwrite() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i;
    String str;
    System.out.println("Please enter a int and string");
    //i = Integer.parseInt(br.readLine());
    str = br.readLine();
    i= Integer.parseInt(str);
    str = br.readLine();
    System.out.println("writing to charfile "+i+"  "+str);
    try {
        FileWriter fin = new FileWriter("charfile");
        fin.write(Integer.toString(i));
        fin.write("\n"+str);
        System.out.println("Writing in charfile");
        fin.close();
    } catch (IOException exc) {
        System.out.println("Something happened while writing " + exc);}
    }

    void charread()
    {String str;
        int i=0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("charfile"));
           System.out.println("Reading from charfile");
           i= Integer.parseInt(br.readLine());
            System.out.println(i);
            str= br.readLine();
            System.out.println(str);
        }catch (IOException exc){System.out.println("ERROR while reading"+exc);}
    }
}



public class prog15 {
    public static void main(String[] arg)
    {   byteio obj=new byteio();
        obj.iowrite();
        obj.ioread();
        obj.Binarywrite();
        obj.Binaryread();

        Chario cobj=new Chario();
        try{cobj.charwrite();}
        catch (IOException exc){System.out.println("error in write");}
        cobj.charread();
    }


}