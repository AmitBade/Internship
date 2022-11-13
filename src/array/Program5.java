package array;

public class Program5 {
    /* Write a java program to which prints “There are consecutive numbers”
        if there are any 3 consecutive numbers else it prints “There are no consecutive numbers”.
    if the array has {19,10,21,22,23,9,6,11,12}
    Then since there are 3 consecutive numbers 21,22,23 hence it will print true.
     */
    public static void main(String[] args) {
        int arr[]={19,10,21,22,23,24,9,6,11,12};
        int i,j,k;
        for(i=2; i<(arr.length-2); i++){
            j = arr[i] - arr[i-1];
            k = arr[i-1] - arr[i-2];
            if(j==1 && k==1){
                System.out.println("3 consecutive numbers found =>> "+arr[i-2] +", "+ arr[i-1]+", "+arr[i]);
            }
        }
    }
}