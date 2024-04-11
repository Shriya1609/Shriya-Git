package AssignmentA4;

import java.util.Scanner;

public class Shape {

    public static double area(double r){
        return Math.PI*r*r;
    }

    public static int area(int a){
        return a*a ;
    }

    public static double area(double w,double l){
        return w*l;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Radius to calculate area of circle:");
        double r= scanner.nextDouble();
        double CircleArea=area(r);
        System.out.println("Area of the circle is:"+ CircleArea);

        System.out.println("Enter sidelength of the square is:");
        int a= scanner.nextInt();
        double SquareArea=area(a);
        System.out.println("Area of th square is:"+ SquareArea);

        System.out.println("Enter width:");
        double w= scanner.nextDouble();
        System.out.println("Enter length:");
        double l= scanner.nextDouble();
        double RectangleArea=area(w,l);
        System.out.println("Area of Rectangle is:"+RectangleArea);


    }
}
