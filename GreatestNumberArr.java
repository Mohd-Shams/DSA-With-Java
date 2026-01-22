import java.util.Scanner;

public class GreatestNumberArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max =arr[0];
        // Printing array
        for (int i = 1; i < n; i++)
        {
            if(max<arr[i]){
            max=arr[i];
        }
            
            
        }
        System.out.println("Greatest number in the array is :"+max);
    }
}