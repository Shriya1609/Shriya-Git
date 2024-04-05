package AssignmentA2;

import java.util.Scanner;

public class Month {

    public static void main(String[] args) {

        System.out.println("Enter Month (1-12)");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();

        switch(m){

            case 1:
                System.out.println("It's January");
            break;
            case 2:
                System.out.println("It's Feburary ");
            break;
            case 3:
                System.out.println("It's March");
            break;
            case 4:
                System.out.println("It's April");
                break;
            case 5:
                System.out.println("It's May");
                break;
            case 6:
                System.out.println("It's June");
                break;
            case 7:
                System.out.println("It's July");
                break;
            case 8:
                System.out.println("It's August");
                break;
            case 9:
                System.out.println("It's September");
                break;
            case 10:
                System.out.println("It's October");
                break;
            case 11:
                System.out.println("It's November");
                break;
            case 12:
                System.out.println("It's December");
                break;
            default:
                System.out.println("Sorry,Please enter valid number!!");
                break;
        }

        sc.close();
    }

}
