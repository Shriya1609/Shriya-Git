package ArrayAssignment;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        System.out.println("Enter String:");
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        System.out.println("String is:"+s);
        if(PalindromeString(s))
        {
            System.out.println("String is Palindrome");
        }
        else System.out.println("String is not Palindrome");

    }
    public static boolean PalindromeString(String str){

        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!= str.charAt(end)){
                return false;
            }
            start ++;
            end --;

        }
        return true;
    }
}
