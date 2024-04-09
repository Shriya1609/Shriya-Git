import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {

        System.out.println("Enter Number :");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int sum=0;

        for(int i=0;i<=n;i++){

            if(i%2==0){

                sum=sum+i;


            }

        }
        System.out.println("Sum of even numbers:"+sum);


    }


}
