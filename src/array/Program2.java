package array;
public class Program2 {
    //Write a Java program to print the second largest number in the array
    public static int getSecondLargest(int[] a, int size){
        int temp;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[size-2];
    }
    public static void main(String [] args){
        int[]a={1,2,9,6,3,2};
        int[]b={21,67,99,77,38,22,55};
        System.out.println("Second Largest: "+getSecondLargest(a,6));
        System.out.println("Second Largest: "+getSecondLargest(b,7));
    }
}


