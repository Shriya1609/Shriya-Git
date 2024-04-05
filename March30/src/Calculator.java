import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my calculator");


        System.out.println("enter first number:");
        int x = scanner.nextInt();

        System.out.println("enter second  number:");
        int y = scanner.nextInt();

        float result;

        System.out.println("Press 1 for the addition");
        System.out.println("Press 2 for the multiplication");
        System.out.println("Press 3 for the sub");
        System.out.println("Press 4 for the div");
        System.out.println("Press 5 for the modulus");
        System.out.println("Enter the input");
        int input = scanner.nextInt();


        switch (input) {
            case 1:
                result = x + y;

                System.out.println("The addition is:" + result);
                break;
            case 2:

                result = x - y;
                System.out.println("the sub is:" + result);

                break;
            case 3:
                result = x * y;

                System.out.println("the multiplication is:" + result);
                break;

            case 4:
                result = x / y;
                System.out.println("the div is:" + result);
                break;
            case 5:
                result = x % y;
                System.out.println("the mod is:" + result);
                break;

            default:
                System.out.println("Nothing found");

        }
    }
}
