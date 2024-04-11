package AssignmentA4;

import java.util.Scanner;

public class Shape {

    public static double area(float r){
       double c=3.14*r*r;
        return c;
    }

    public static double area(int a){
        double s=a*a;
        return s;
    }

    public static double area(int w,int l){

        double a=w*l;
        return a ;
    }

    public static void main(String[] args) {


        System.out.println("Area of a square is:"+area(10));
        System.out.println("Area of a circle is:"+area(12));
        System.out.println("Area of a rectangle is:"+area(10,5));

    }
}
