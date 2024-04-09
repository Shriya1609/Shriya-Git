public class Rectangle {

    double length;
    double width;


    public double calculateArea(double length, double width){

       double area=width*length;

        System.out.println("Area of rectangle is:"+area);
        return area;

    }

    public double calculatePerimeter(double length, double width){

        double perimeter=2*(length+width);

        System.out.println("Perimeter of rectangle is:"+perimeter);

        return perimeter;
    }


}
