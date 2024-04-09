import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        System.out.println("Enter Number");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();


        int a=0;
        int b=1;
        int c=0;

        for(int i=0;i<=n;i++){

            System.out.println(c);
            a=b;
            b=c;
            c=a+b;

        }
        scanner.close();
    }

}
