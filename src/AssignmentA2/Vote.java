package AssignmentA2;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        int eligibleAge=18;

        for(int i=0;i<=a;i++){

        }
        if(a>=eligibleAge){

            System.out.println("Eligible for vote");
        }
        else
            System.out.println("Not eligible for vote");

        sc.close();

    }
}
