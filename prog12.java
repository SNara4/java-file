//12.program to demonstrate exception handling in java

public class prog12 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        // a simple exception block
        try {
            System.out.println("inside try block");
            arr[13] = 10;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("exception caught" + exc);
        }


        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        //multicatch try block with final
        try {
            for (int i = 11; i > 0; i--) {
                arr[i] = arr[i] / (i-2);
                System.out.println("at position " + i + "new value " + arr[i]);
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc);
        }
    }
}