package NUMBERS.extra;
//
//import java.util.Scanner;
//
//public class ExtraJava {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Print A Marks : ");
//        int marks = input.nextInt();
//
//        if(marks >= 90){
//            System.out.println("Grade A");
//        }else if(marks >= 70){
//            System.out.println("Grade B");
//        }else if(marks >= 50) {
//            System.out.println("Grade C");
//        } else if (marks >= 36) {
//            System.out.println("Grade D");
//        }else{
//            System.out.println("Fail");
//        }
//    }
//}
//
//public class ExtraJava {
//    public static void main(String[] args) {
//        int arr[] = {12,14,16,18,20,22,24,26,28};
//        int target = 14;
//        int result = binarySearch(arr,target);
//
//        if (result == -1){
//            System.out.println("Not found");
//        }else{
//            System.out.println(result);
//        }
//
//    }
//    public static int binarySearch(int[] arr , int target){
//        int right = arr.length-1;
//        int left = 0;
//
//
//        for(;left <= right;){
//            int mid = (left + right) / 2;
//
//            if (arr[mid] == target){
//                return  mid;
//            } else if (arr[mid] < target) {
//                left = mid + 1;
//            }else {
//                right = mid - 1;
//            }
//        }
//        return  -1;
//    }
//}


//
//public class ExtraJava {
//    public static void main(String[] args) {
//    int[] arr = {12,14,16,18,20,22,24,26,28};
//    int target = 27;
//    int result = binarySearch(arr, target);
//
//    if (result == -1){
//        System.out.println("Not Found ");
//    }else{
//        System.out.println("The Element is found at index no. "+ result);
//    }
//
//
//    }
//    public static int binarySearch(int arr[], int target){
//        int right = arr.length - 1;
//        int left = 0;
//
//        while(left <= right){
//
//            int mid = (right + left) / 2;
//
//            if (arr[mid] == target){
//                return  mid;
//            } else if (arr[mid] < target) {
//                left = mid + 1;
//            }else {
//                right = mid - 1;
//            }
//        }
//        return  -1;
//    }
//
//}
/// Is Armstrong Number
//
//public class ExtraJava {
//    public static void main(String[] args) {
//      //  System.out.println(isArm(153));
//
//        int x = 24;
//        if (isArm(x) == true){
//            System.out.println(x+" It Is Armstrong Number");
//        }else{
//            System.out.println(x+" It Is Not Armstrong Number");
//        }
//
//    }
//    public static boolean isArm(int x){
//        int result = 0;
//        int original = x;
//        for (; x != 0; x = x / 10) {
//            int rem = x % 10;
//             result += rem * rem * rem;
//        }
//        if (original == result){
//            return  true;
//        }
//        else{
//            return  false;
//        }
//
//    }
//}
//}
//


//public class ExtraJava {
//    public static void main(String[] args) {
//        System.out.println("""Dale");
//
//
//        int integer = 12;
//        if (integer % 2 ==0){
//            System.out.println("Ev  en");
//        }else {
//            System.out.println("Odd");
//        }
//    }
//}



//public class ExtraJava {
//    public static void main(String[] args) {
//        int z = 5;
//        int a = 0;
//        int b =  1;
//        System.out.print(a + " " + b+" ");
//        for (int i = 2; i < z ; i++) {
//            int c = a + b;
//            System.out.print(c+" ");
//            a = b;
//            b = c;
//
//        }
//
//    }
//}


/// HCF & LCM
/// hcf = gcd
//public class ExtraJava {
//    public static void main(String[] args) {
//
//        int num1 = 12;
//        int num2 = 8;
//        int hcf = 0;
//
//        for (int i = 1; i <= num1 && i <= num2; i++) {
//            if (num1 % i == 0 &&  num2 % i == 0){
//                hcf = i;
//            }
//        }
//        int lcm = (num1 * num2) / hcf;
//
//        System.out.println("LCM is : "+lcm);
//        System.out.println("HCF is : "+hcf);
//    }
//}
//

public class ExtraJava {
    public static void main(String[] args) {
        Integer p = 200;
        Integer q = 200;

        System.out.println(p == q);
    }
}


















