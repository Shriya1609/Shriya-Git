package March2024;

public class Swapping {

    public static void main(String[] args){

        int x=10;
        int y=20;

//with third variable

        int z=x;
        x=y;
        y=z;
        System.out.println(x);
        System.out.println(y);

        // without using third variable
        int a=30;
        int b=40;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);




    }

}
