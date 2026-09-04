package NUMBERS.extra;

import java.util.Scanner;


public class Armstrong {

    public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
        System.out.println("Enter A Number: ");
       double base = input.nextInt();


        double component = 3;

        double result = Math.pow(base,component);

        if (result == base){
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not Armstrong");
        }
    }

}
