package ArrayAssignment;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {

        System.out.println("Enter string:");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

        reverseWords(str);
    }
    public static void reverseWords(String str){

        String[] words=str.split(" ");
        for (int i = words.length-1; i>=0 ; i--) {
            System.out.print(words[i]+ " ");
        }


    }
}
