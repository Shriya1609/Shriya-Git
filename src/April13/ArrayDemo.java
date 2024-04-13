package April13;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Array elements");

        for (int i = 0; i < arr.length ; i++) {
            arr[i]= scanner.nextInt();

        }

        System.out.println("Printing Array elements");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }


}
