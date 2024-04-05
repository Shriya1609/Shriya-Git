package Assignment.A1;

import java.util.Locale;
import java.util.Scanner;

public class TrafficLightSimulator {

    public static void main(String[] args) {

        System.out.println("Enter color of traffic light(red, yellow or green)");
        Scanner sc=new Scanner(System.in);
        String color=sc.nextLine().toLowerCase();

        switch(color){
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Prepare for stop");
                break;
            case "green":
                System.out.println("Go");
                break;
          default:
                System.out.println("Wrong color entered!! Please try with valid color");
                break;

        }

    }

}
