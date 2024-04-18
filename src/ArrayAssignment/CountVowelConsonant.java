package ArrayAssignment;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        int VowelCount=0;
        int ConsonantCount=0;

        System.out.println("Enter String");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine().toLowerCase();

        for (int i = 0; i <str.length() ; i++) {


            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'|| str.charAt(i) =='u'){

                VowelCount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                //Increments the consonant counter
                ConsonantCount++;
            }


        }

        System.out.println("Vowel count:"+VowelCount);
        System.out.println("Consonant count:"+ConsonantCount);


    }
}
