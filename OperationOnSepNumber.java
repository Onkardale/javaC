package NUMBERS;

import java.util.Scanner;

public class OperationOnSepNumber {
    public static void main(String[] args) {
        int digit = 0;
        int rem1 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Print A Number: ");
        int num = input.nextInt();
        ;

//        digit = num % 10;
//        System.out.println(digit);


        if (num <= 0) {
            System.out.println("Syntax Error");
        } else {
            int orignal = num;
            int reversed = 0;
            for (; num != 0; num = num / 10) {
                rem1 = num % 10;
                reversed = reversed * 10 + rem1;
            }
            if (reversed == orignal){
                System.out.println("\nPalindrome Number");
            }else{
                System.out.println("\nNot Palindrome");
            }
        }
    }
}