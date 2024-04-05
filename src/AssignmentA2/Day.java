package AssignmentA2;

import java.util.Scanner;

public class Day {

    public static void main(String[] args) {
        System.out.println("Enter Day");

        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

        switch (day){
            case 1:
                   System.out.println("its weekday");
                 break;

            case 2:
                    System.out.println("its weekday");
                break;

                case 3:
                     System.out.println("its weekday");
                break;

            case 4:
                    System.out.println("its weekday");
              break;
            case 5:
                    System.out.println("its weekday");
                break;
            case 6:
                    System.out.println("its weekend");
               break;
            case 7:
                    System.out.println("its weekend");
                break;

            default:
                System.out.println("Sorry, please enter valid day");
                break;



        }
           sc.close();

    }

}
