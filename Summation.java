package NUMBERS;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num = input.nextInt();
//        long summation = 0;
//
//        for (int i = 1; i <= num ; i++) {
//            summation += i;
//        }
//        System.out.print("Ans is : "+summation);


        for (int i = 1; i <= 20 ; i++) {
            System.out.println(num * i);
        }
    }
}
