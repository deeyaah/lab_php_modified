package adarsh;
import java.util.Arrays;
import java.util.Scanner;

class largestinarr {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of elements");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
         System.out.println("enter the  elements");
         
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }

        Arrays.sort(arr);

        int small = arr[1];

        int large = arr[n - 1];

        int secondl = arr[n - 2];

        System.out.println("The smallest element" + " " + small);

        System.out.println("The largest element" + " " + large);

        System.out.println("The second largest element" + " " + secondl);

    }

}
