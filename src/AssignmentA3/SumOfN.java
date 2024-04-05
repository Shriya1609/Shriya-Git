package AssignmentA3;

import java.util.Scanner;

public class SumOfN {

    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Entered number"+n);
        int sum=0;

        for(int i=0;i<=n;i++){

            sum=sum+i;
        }

        System.out.println("The sum of numbers"+sum);

        sc.close();
    }

}
