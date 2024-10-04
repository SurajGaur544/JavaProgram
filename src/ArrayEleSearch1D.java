import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*Given an integer array of size n and an integer x. Find if x exist in the array or not using linear search technique.
        Input
        First line contains n and x.
        Next line contains n space separated integers.

        Constraints
        1 ≤ n ≤ 105
        1 ≤ arr[i], x ≤ 105
        Bike No UP42BA5191 */
public class ArrayEleSearch1D {
    public static String findIfXPresent(int arr[], int N, int X){
        for(int i=0; i<N; i++){
            if(arr[i] == X){
                return "Yes" ;
            }
        }
        return "No";

    }
    public static int printEle(int arr[], int N, int X){
        for(int i=0; i<N; i++){
            if(arr[i] == X){
                return arr[i];
            }
        }
        return 0;
    }
    public static int findIndex(int arr[], int N, int X){
        for(int i=0; i<N; i++){
            if(arr[i] == X){
                return arr[i]-1;
            }
        }
        return 0;

    }
    public static int findSize(int arr[], int N, int X){
        int count=0;
        for(int i=0; i<N; i++){
           count++;
        }
        return count;

    }
    public static void findSumAndMean(int arr[], int N){
        int sum =0;
        int mean=0;
        for(int i=0; i<N; i++){
            sum+=arr[i];
        }
        mean = sum/N;
        System.out.println("Sum of array "+sum);
        System.out.println("mean of array "+mean);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        String result = findIfXPresent(arr ,N ,X);
        System.out.println(result);

        int  res = printEle(arr,N,X);
        System.out.println("Number is "+res);

        int index = findIndex(arr, N, X);
        System.out.println("Index Number "+index);

        int size = findSize(arr, N, X);
        System.out.println("Array Length is "+size);

        // find the sum of array and mean ?
       findSumAndMean(arr,N);




    }

}
