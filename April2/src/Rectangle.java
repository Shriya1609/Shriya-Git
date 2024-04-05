import java.util.Scanner;

public class Rectangle {

double width;
double length;

    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        //rectangle.calculateArea();
        double area=rectangle.calculateArea(3,4);
        System.out.println("Area of Rectangle:"+area);

        double perimeter=rectangle.calculatePerimeter(5,4);
        System.out.println("Perimeter of Rectangle:"+ perimeter);

    }

    /*public void calculateArea(){
       double area= width*length;
        System.out.println("Area of rectangle: "+area);
    }*/

    public double calculateArea(double length,double width){
        double area = width*length;
        return area;
    }


    public double calculatePerimeter(double length,double width){

        double perimeter=2*(width+length);

        return perimeter;

    }

}
