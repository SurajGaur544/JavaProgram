import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-: Create a Array :-");
        System.out.println("Enter Array Size and Item: ");
        int n=sc.nextInt();

        int[] arr = new int[n];
        //System.out.println("Enter Item : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
