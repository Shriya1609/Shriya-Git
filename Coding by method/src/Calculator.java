import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome  to my calculator!!");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        char c;

        do{
            Scanner scanner=new Scanner(System.in);
            int input= scanner.nextInt();

            System.out.println("Enter first number:");
            int a= scanner.nextInt();

            System.out.println("Enter second number:");
            int b= scanner.nextInt();


            switch(input){

                case 1:
                    int sum=a+b;
                    System.out.println("Addition of the given numbers are:"+sum);
                    break;

                case 2:
                    int sub=a-b;
                    System.out.println("Subtraction of the given numbers are:"+sub);
                    break;

                default:
                    System.out.println("Please try again later");

            }
            System.out.println("If you want to continue Please press y for yes or n for no");
            c=scanner.next().charAt(0);
        }while(c=='Y'|| c=='y');


    }
}
