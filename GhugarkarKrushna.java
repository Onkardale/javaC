package NUMBERS;

 import javax.xml.namespace.QName;

import java.util.Scanner;

public class GhugarkarKrushna {
    public static void main(String[] args) {
        


        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("  * ");

            }
            System.out.println( );

        }








        for (int i = 10; i >= 0 ; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("  * ");
            }
            System.out.println( );
        }












        System.out.println();


        for (int i = 10; i >= 0 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


  ///      System.out.println();
/// just print for new line

        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }












        System.out.println();


        for (int i = 10; i >= 0 ; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }







        System.out.println();


        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {

                if (j == 1 || j == 10 || i == 1 || i == 10){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.print(" * ");
            }
            System.out.println( );
        }







        System.out.println();

        Private p = new Private("Ola",45);

        System.out.println(p.name);
        System.out.println(p.id);
//        for (int i = 1; i < 5 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * "+j+i+i+"   ");
//                System.out.println();
//            }
//            System.out.println();
//        }
//        GhugarkarKrushna ghugarkarKrushna = new GhugarkarKrushna();
//
//        System.out.println( );
        Scanner in = new Scanner(System.in);

        System.out.println("Print a Number: ");
        int x = in.nextInt();


        if (isPrime(x) == 1){
            System.out.println(x + " \n i \ns \na p\nri\nm\ne\n \nN\numb\ner\n");
        }else {
            System.out.println(x +" is Not A  Prime  Number ");
        }

        System.out.println(isPrime(78));





      }
      public static int isPrime(int x){
        if (x <= 1){
            return 5;
        }
          for (int i = 2; i < x ; i++) {
              if (x % i == 0){
                  return 5;
              }
          }
          return 1;
      }
      static class Private{
        private String name;
        private int id;






        private Private(String name, int id){
            this.name = name;
            this.id = id;
        }



        /// getter and setter   get always return a value  set has no return type because he can use void they has no return type
//          public String getName() {
//              return name;
//          }
//
//          public void setName(String name) {
//              this.name = name;
//          }
      }
      class kaka{
          public String name;

      }
}

