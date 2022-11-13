package array;
import java.util.Arrays;

public class Program7 {
    public static void main(String[] args) {
        int[]arr1= {3, 5, 7, 9};
        int[]arr2= {2, 4, 6, 8};
        int[]arr3= {0, 3, 6, 9};
        int[]arr4= new int[arr1.length + arr2.length + arr3.length];

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr4[count] = arr1[i];
            count = count + 1;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr4[count] = arr2[i];
            count = count + 1;
        }
        for (int i = 0; i < arr3.length; i++) {
            arr4[count] = arr3[i];
            count = count + 1;
        }
        System.out.println(Arrays.toString(arr4));
    }
}
