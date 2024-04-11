package March2024;

import java.util.Scanner;

public class Radius {

    public static void main(String[] args) {
        System.out.println("Enter Radius");
        Scanner scanner=new Scanner(System.in);
        double radius= scanner.nextDouble();

        double area=Math.PI*radius*radius;

        System.out.println("Area of a circle is:"+area);
    }

}
