package NUMBERS;

import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Print Your number: ");
        long user_num = input.nextLong();
        long num = 1202508839;
        //12025088395 = Eligibility ID

        if (num == user_num){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
