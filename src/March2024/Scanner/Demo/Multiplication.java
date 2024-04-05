package March2024.Scanner.Demo;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x= scanner.nextInt();

        System.out.println("Enter the value of y:");
        int y= scanner.nextInt();

        int mult=x*y;
        System.out.println("The multiplication of x and y is :"+ mult);

    }

}
