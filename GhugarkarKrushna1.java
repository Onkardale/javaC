package NUMBERS;

//public abstract class GhugarkarKrushna1 {
//    abstract void Animal();
//
//    public static void main(String[] args) {
//
//        Dog d = new Dog();
//        d.bark();
//        d.Animal();
//
//    }
//}
//
//class Dog extends GhugarkarKrushna{
//    void bark (){
//        System.out.println("Dog is barking..");
//    }
//      void Animal (){
//        System.out.println("animal has four legs");
//    }
//

//}














public class GhugarkarKrushna1{
    public static void main(String[] args) {


        int num = 123;
        int original = num;

        int rev = 0;

        for (; num != 0; num = num / 10){
            int rem = num % 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
        if (original == rev){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
