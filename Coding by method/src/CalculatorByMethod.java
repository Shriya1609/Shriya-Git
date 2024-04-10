import java.util.Scanner;

public class CalculatorByMethod {


    public static void main(String[] args) {
        System.out.println("Welcome to my calculator");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Multiplication");

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first number");
        float a= scanner.nextInt();

        System.out.println("Enter second number");
        float b= scanner.nextInt();
        int input= scanner.nextInt();

        calculator(a,b,input);
    }
    public static float calculator(float a,float b,int input){

        switch(input){

            case 1:
                double result=a+b;
                System.out.println("Addition of given numbers are:"+result);
                break;

            case 2:
                result=a*b;
                System.out.println("Multiplication of given numbers are:"+result);
                break;

            default:
                System.out.println("try again later!!");

        }

        return input;
    }


}
