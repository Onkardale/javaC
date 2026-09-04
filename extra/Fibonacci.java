package NUMBERS.extra;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Print A Fibonacci Number: ");
        int num = input.nextInt();
        System.out.println("Here Is Fibonacci series");

        fibo(num);


    }
public static void fibo(int num){
        int a =0,b=1;
    System.out.println(a+" ");
    for (int i = 1; i <num ; i++) {
        int next = a + b;
        System.out.println(next + " ");
        a = b;       // shift forward
        b = next;
    }
}



    }

