import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber pn=new PrimeNumber();
        pn.Primenumber(25);

    }

    public int Primenumber(int n){

            if(n%2==0){
                System.out.println("Number is  even:"+n);
            }else
                System.out.println("Number is odd:"+n);


        return n;
    }


}
