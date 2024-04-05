package AssignmentA2;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        System.out.println("Enter value of a for area calculation");

        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float area=a*a;

        System.out.println("Area of square is:"+area);
        sc.close();

    }

}
