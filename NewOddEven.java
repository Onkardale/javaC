package NUMBERS;

import java.util.Scanner;

public class NewOddEven {
    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
                System.out.print("Print Any Number: ");
                int num = input.nextInt();

                if((num & 1) == 1){
                    System.out.println("Odd");
                }else{
                    System.out.println("Even");
                }

    }
}
