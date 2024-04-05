package AssignmentA3;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number to calculate factorial number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of a number is:"+fact);

        sc.close();
    }

    public static class Input {

        public static void main(String[] args) {

            System.out.println("Please enter input");
            String input;

            do {

                Scanner sc = new Scanner(System.in);
                input = sc.nextLine();

                System.out.println("The output is:" + input);

            }while(!input.equalsIgnoreCase("q"));

            System.out.println("Quiting the program");
        }
    }
}
