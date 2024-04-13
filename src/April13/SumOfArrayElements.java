package April13;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int sum=0;
        int[] arr=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Array elements");

        for (int i = 0; i < arr.length ; i++) {
            arr[i]= scanner.nextInt();

        }

        System.out.println("Printing Array elements");
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Sum of the elements are:"+sum);
    }
}
