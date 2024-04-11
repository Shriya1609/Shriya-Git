package AssignmentA4;

import java.util.Scanner;

public class TemperatureConverter {

    public static double Convert(double Celsius){

        return (Celsius*9/5)+32;
    }

    public static double Convert(int Celsius){

        return Celsius+273.15;
    }

    public static void main(String[] args) {

        System.out.println("Enter Celsius");
        Scanner scanner=new Scanner(System.in);
        double Celsius= scanner.nextDouble();

        double kelvin= Convert((int) Celsius);
        System.out.println(Celsius + " Celsius is equal to " + kelvin + " Kelvin");

        double fahrenheit = Convert(Celsius);
        System.out.println(Celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");


      scanner.close();
    }

}
