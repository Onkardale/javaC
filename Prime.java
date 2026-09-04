package NUMBERS;
////import java.util.Scanner;
////
////public class Prime{
////    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////
////        System.out.print("Enter a number: ");
////        int num = input.nextInt();
////
////        boolean isPrime = true;
////
////        if (num <= 1) {
////            isPrime = false;
////        } else {
////            for (int i = 2; i < num; i++) {
////                if (num % i == 0) {
////                    isPrime = false;
////                    break;
////                }
////            }
////        }
////
////        if (isPrime) {
////            System.out.println(num + " is a prime number.");
////        } else {
////            System.out.println(num + " is not a prime number.");
////        }
////
////
////    }
////}
////
//

import java.util.Scanner;

////import java.util.Scanner;
////
////public  class Prime {
////    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////        System.out.print("Print Any  Number: ");
////        int num = input.nextInt();
////
////        boolean isPrime = true;
////        if (num <= 1){
////            isPrime = false;
////        }else {
////            for (int i = 2; i < num; i++) {
////                if (num % 2== 0){
////                    isPrime = false;
////                }
////
////            }
////        }
////
////        if (isPrime){
////            System.out.println(num + " Is prime number");
////        }else{
////            System.out.println(num + " Not prime number");
////        }
////            }
////        }
//
//import java.util.Scanner;
//
//public  class Prime {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Print Any Number: ");
//        int num = input.nextInt();
//
//
//        boolean isPrime = true;
//
//         if (num <= 1){
//             isPrime = false;
//         }else {
//             for (int i = 2; i < num ; i++) {
//                 if (num % i == 0){
//                     isPrime = false;
//                     break;
//                 }
//
//             }
//         }
//         if (isPrime){
//             System.out.println(num + " Number is prime");
//         } else {
//             System.out.println(num + " Number is Not is Prime");
//
//
//
//         }
//        System.out.println(num  +" It Is Also Even  Number");
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

public  class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print A Number: ");
        int num = input.nextInt();
        boolean isPrime = true;
        if (num <= 1 ){
            isPrime = false;
        }else {
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    isPrime = false;
                }
            }
        }
        if (isPrime){
            System.out.println("This IS Prime Number");
        }else {
            System.out.println("Not Prime");
        }
    }
}

