package AssignmentA2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        System.out.println("Enter r for circle");
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();

        double a=3.14*r*r;
        System.out.println("Area of Circle:"+a);
        sc.close();
    }

}
