package NUMBERS;

import java.util.Scanner;

public  class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker");
        System.out.print("Print Any Number: ");
        int num = input.nextInt();
        boolean isPrime = true;
        if (num<=1){
            isPrime = false;
        }else {
            for (int i = 2; i < num ; i++) {
                if (num % i ==0){
                    isPrime = false;
                }

            }
        }
        if (isPrime){
            System.out.println(num+" isPrime");
        }else{
            System.out.println(num+" notPrime");
        }
        System.out.println("Welcome To Odd & Even Number Checker");
        System.out.print("Print A number: ");
        int num1 = input.nextInt();
        if (num1 % 2== 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}