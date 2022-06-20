//5.program to demonstrate strings
public class prog5 {
    public static void main(String[] args)
    { String str=new String("this is str");
        String str2="this is str2";
        String str3=str2;
        String str4=args[args.length-1];// reads last string of cmd line arguments
        System.out.println(str4);
        System.out.println("the string are: "+str+"  "+str2+"  "+str3);
        System.out.println("boolean str.equals(str2)"+ str.equals(str2));
        System.out.println("str.length():"+str.length());
        System.out.println("str.charAt(2)"+str.charAt(2));
        System.out.println("str.compareTo(str3)"+str.compareTo(str3));
        System.out.println("str.indexOf(\"is\")"+str.indexOf("is"));
        System.out.println("str.lastindexOf(\"is\")"+str.lastIndexOf("is"));
    }
}
