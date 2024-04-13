package April13;

import java.util.Scanner;

public class MinMaxArray {

    public static int Max(int[] arr){
        int max=0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int Min(int[] arr){
        int min=arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]<min) {
                min = arr[i];
            }

        }

        return min;
    }

    public static void main(String[] args) {

        int[] arr={10,20,30,40,50};

        System.out.println("Maximum number of the array"+Max(arr));
        System.out.println("Minimum number of the array"+Min(arr));

    }

}
