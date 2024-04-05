package AssignmentA3;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        System.out.println("Enter input");

        String userInput;

        do {
            Scanner sc = new Scanner(System.in);
            userInput=sc.nextLine();

            System.out.println("Entered output:"+userInput);

            sc.close();
        }while(!userInput.equalsIgnoreCase("q"));

        System.out.println("Quiting program");

    }

}
