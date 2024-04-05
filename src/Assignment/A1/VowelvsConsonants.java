package Assignment.A1;

import java.util.Scanner;

public class VowelvsConsonants {

    public static void main(String[] args) {

        System.out.println("Enter Character");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
            System.out.println("its vowel");
        }else{
            System.out.println("its Consonant");
        }

    }

}
