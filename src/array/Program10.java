package array;

public class Program10 {
    public static int[] doubleArray(int[]arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr = {2, 4, 6};
        int[]result = doubleArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
