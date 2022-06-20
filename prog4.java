//program to demonstrate array in java
public class prog4 {
    public static void main(String[] args) { // different ways to initialize

        //1d array
        int[] arr1d = new int[10];
        arr1d = new int[]{1, 2, 3, 4, 12, 34, 3, 2, 2, 3};
        int[] arr1d2 = {1, 2, 2, 2, 1, 1, 1, 3, 3};
        int x, i = 0;
        //traversal via simple for loop
        for (i = 0; i < 10; i++) {
            x = arr1d[i];
            System.out.println("Value of element arr1d[" + i + "]:" + x);
        }
        for (i = 0; i < arr1d2.length; i++) {
            x = arr1d2[i];
            System.out.println("Value of element arr1d2[" + i + "]:" + x);
        }

        // 2d array
        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}}; //a common array
        int[][] arr2dirr = new int[3][];  // irregular 2 d array
        arr2dirr[0] = new int[]{1, 2, 3, 4};
        arr2dirr[1] = new int[]{1, 3, 4};
        arr2dirr[2] = new int[]{1, 4};
        System.out.println("Printing 2 d array \n");
        for (int[] j : arr2d) {
            System.out.println();
            for (int y : j) {
                System.out.print(y + " ");
            }
        }
        System.out.println("\nPrinting another 2 d array \n");
        for (int[] j : arr2dirr){
            System.out.println();
            for (i=0;i< j.length;i++)
            { x=j[i];
                System.out.print(x+" ");
            }
        }
    }

}
