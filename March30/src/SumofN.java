import java.util.Scanner;

public class SumofN {

    public static void main(String[] args) {
        int sum=0;

        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("The sum is:"+sum);

    }


}
