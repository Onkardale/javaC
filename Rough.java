package NUMBERS;
//import java.util.Enumeration;
//import java.util.Scanner;
//
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int greatest= Integer.MIN_VALUE;
//        System.out.println("Enter A 5 Number: ");
//
//        for (int i = 1; i <= 5; i++) {
//            int num = input.nextInt();;
//            if (num > greatest){
//                greatest = num;
//
//            }
//
//        }
//
//
//
//
////        greatest = Math.min(num3, Math.min(num1,num2));
////        System.out.println(greatest + " Is That Minimum Number");
//        System.out.println("Greatest number is: " +greatest);
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        int rem = 0;
//        int num = 987;
//        while (num != 0){
//            rem = num % 4;
//            num = num /10;
//        }
//        System.out.println(rem);
// }
// }

//public class Rough {
//    public static void main(String[] args) {
//        int a = 4;
//       int result = ++a + --a * a;
//        System.out.println(a +"  "+  result);
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//        int c = a * b++ + --a;
//        System.out.println(a+"  "+b+"  "+"  "+c);
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;

////        b+= a-- - --b - --b - --a * 2;
//        int c= a-- - --b - --b - --a * 2;
//        System.out.println(a + "  " + c+ "  "+b);
//        System.out.println(b);
 //   }
// }
//public class Rough {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Two Numbers: ");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        greet(a ,b);
//        call();
//
//
//    }
//    public static void greet(int a,int b){
//        int c = a + b;
//        System.out.println("Addition of two numbers is: "+c);
//    }
//    public static  String call() {
//        String s1 = "Good Morning";
//        String s2 = "Good Afternoon";
//        System.out.println(s2);
//        return s2;
//
//    }
//
//}

//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number: ");
//        int num = input.nextInt();
//        for (int i = 1; i <=10; i++) {
//            System.out.println(num * i);
//
//        }
//
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A NUmber: ");
//        int num = input.nextInt();
//        long fact = 1;
//        for (int i = 1; i <= num ; i++) {
//            fact *= i;
//
//        }
//        System.out.println("Factorial of  " +num+"  is "+ fact);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        double x = 0.0;
//        int y = 10;
//        System.out.println();
//
//    }
//}
 //       2D- ARRAY       //

//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int rows = input.nextInt();
//        int col = input.nextInt();
//
//        int[][] arr = new int[3][4];
//
//        //rows
//        for (int i = 0; i < rows; i++) {
//// coloumn
//            for (int j = 0; j < col; j++) {
//                arr [i][j] = input.nextInt();
//            }
//
//        }
//for (int i = 0; i< rows; i++){
//    for (int j = 0; j < col; j++) {
//        System.out.println(arr[i][j]+"  ");

//}
//    System.out.println( );
//}
//
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        int[][] arr = {
//                {2,3,4,5},
//                {4,6,3,1}
//        };
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println( );
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//int[][] arr = {
//        {24, 65, 44, 21,6,5},
//        {43, 21, 22, 45,5,6},
//        {3,  5,  7, 8, 0, 9},
//        {11, 12, 13, 15,67,0}
//};
//
//        for (int i = 0; i <4 ; i++) { ///row
//            for (int j = 0; j <6; j++) {/// column
//                System.out.print(arr[i][j]+"  ");
//            }
//            System.out.println();
//        }
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A NUmber: ");
//        int num = input.nextInt();
//        int rem = 0;
//
//        for (; num != 0 ;num = num / 10) {
//            rem= num % 10;
//            System.out.print(rem);
//
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("  * * * * * Welcome To Number Printer * * * * * ");
//        int greatest = Integer.MAX_VALUE;
//        for (int i = 1; i <= 3; i++) {
//            System.out.print("Print " + i + " Number: ");
//            int num = input.nextInt();
//
//
 /// Apan 2,3 number if else ne pn karu sakto pn numbers 50,60 kiti pn asu he trick vapraychi
//        if (num > greatest) {
//            greatest = num;
//        }
//    }
//        System.out.println(greatest);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("How Many Numbers you find to Average:  ");
//        double Avgnum = input.nextInt();
//
//        double add = 0;
//        for (int i = 1; i <=Avgnum ; i++) {
//            System.out.println("Print "+ i +" Number: ");
//           double num = input.nextInt();
//           add += num;
//        }
//        System.out.println("Additon Of Numbers : "+ add);
//        System.out.println("Average Of These Numbers : "+add/Avgnum);
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        System.out.print("Print A Number: ");
////       double num = input.nextInt();
//    arm();
//
//
// }
//
//    public static double arm() {
//        System.out.print("Print A  Number: ");
//
//        double pow = 0;
//        int  myValue = 0;
//        int component = 3;
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int orignalnumber =num;
//
//       // System.out.println(num);
//        double rem = 0;
//        for (; num != 0; num = num / 10) {
//            rem = num % 10;
//            //System.out.println(rem + "  ");
//
//            pow=Math.pow(rem,component);
//            //System.out.println(pow);
//
//            //System.out.println("      "+Math.round(pow));
//
//
//             myValue += pow;
//        }
//        // System.out.println(orignalnumber);
//        if (orignalnumber == myValue){
//            System.out.println("Number Is Armstrong");
//        }else {
//            System.out.println("Not Armstrong");
//        }
////        System.out.println(myValue);
////        System.out.println(num);
//
//
//
//            return myValue;
//
//
//
//    }
//}


////     Palindrome Number   //
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("\nPrint A Number To Check Number Is Palindrome or Not: ");
//        int num = input.nextInt();
//
//        int orignalNumber = num;
//        int reverseNumber = 0;
//
//
//        int rem = 0;
//
//        for (; num != 0; num = num / 10) {
//            rem = num % 10;
//            reverseNumber = reverseNumber * 10 + rem;
//        }
//
//
//        if (orignalNumber == reverseNumber){
//            System.out.println("Palindrome Number");
//        }else{
//            System.out.println("Not Palindrome");
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("\nPrint A Numbers: ");
//        int num = input.nextInt();
//        int rem = 0;
//        int sum = 0;
//
//        for (;num != 0; num = num/10){
//            rem = num % 10;
//            sum += rem;
//        }
//        System.out.print("\nSum Of Given Numbers Is : "+sum);
//    }
//}
    // Count of Digit //
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number: ");
//        int num = input.nextInt();
//
//
//        int orignal = num;
//        int count = 0;
//
//        if (num == 0){
//            System.out.println(count = 1);
//        }else{
//            for (; num != 0; num = num/ 10){
//                count++;
//            }
//            System.out.println("There Are "+count+"  Digits");
//        }
//
//    }
//}

//public  class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number: ");
//        int num = input.nextInt();
//
//        boolean isPrime = true;
//
//        if (num <= 1){
//            isPrime = false;
//        }else {
//            for (int i = 2; i < num ; i++) {
//               if (num % i == 0){
//                   isPrime = false;
//               }
//            }
//        }
//        if (isPrime){
//            System.out.println("Prime Number");
//        }else{
//            System.out.println("Not Prime");
//        }
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number To Check Number Perfect Or Not: ");
//        int num = input.nextInt();
//        int sum = 0;
//        int addition = 0;
//        int count = 0;
//        boolean isPerfect = true;
//
//        if (num <= 0){
//            isPerfect = false;
//        }else{
//            for (int i = 1; i < num; i++) {
//                sum = num % i;
//
//                if (num % i == 0){
//                    addition += i;
//                    //count++;
//                }
//
//               //  System.out.println(sum);
//
//            }
//
//        }
//        System.out.println(count);
//        System.out.println(addition);
//        System.out.println(num);
//
//        if (num == addition){
//            System.out.println("It Is Perfect number");
//        }else{
//            System.out.println("It Is Not Perfect Number");
//        }
//
//        }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print How many numbers you have: ");
//        double  num = input.nextInt();
//        double random = num;
//        double store = 0;
//
////        for (int i = 0; i < num; i++) {
////            store = num * num ;
////             random  += store -20;
////            System.out.println(random);
////        }
//
//
//        for (int i = 0; i <= num; i++) {
//            random  = Math.random();
//            System.out.println(random);
//        }
//
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number To Number is Armstrong Or Not: ");
//        int  num = input.nextInt();
//        int  count = 0;
//        double pow = 0;
//        int  rem = 0;
//        int orignal = num;
//        int component = 3;
//
//        for (; num != 0; num  = num / 10){
//            rem = num % 10;
//            pow = Math.pow(rem,component);
//           count += pow;
//        }
//
//      if(count == orignal ){
//          System.out.println("Number Is Armstrong");
//      }else{
//          System.out.println("Number Is Not Armstrong");
//      }
//
//
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number: ");
//        int num = input.nextInt();
//        System.out.println(0);
//
//
//        int first = 0, second = 1;
//        for (int i = 1; i <= num ; i++) {
//            int third = first + second;
//            System.out.println(third+" ");
//           first = second;
//           second = third;
//
//        }
//        System.out.println("1,2,3,4");
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int num = 5;
//        int fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact *= i;
//        }
//        System.out.println(fact);
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int gr = 0;
//        int num = 0;
//        int gratest = 0;
//        int[] arr = new int[5];
//        arr[0] = 24;
//        arr[1] = 34;
//        arr[2] = 84;
//        arr[3] = 64;
//        arr[4] = 4;
//        for (int i = 0; i < 5; i++) {
//            System.out.println(arr[i]);
//            if ( arr[i] > gratest) {
//               gratest = arr[i];
//
//
//
//            }
//
//        }
//        System.out.println("   "+gratest);
//            //gr = num + arr[i];
////            System.out.println("   "+arr[]);
//
//
//        //System.out.println(gratest);
//
//    }
//
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = 25;
//        int b = 45;
//        System.out.println("Value Before Swapping: "+a);
//        System.out.println("Value Before Swapping: "+b);
//
//        int c = a;
//        a = b;
//        b = c;
//
//        System.out.println("Value after swap: "+ a);
//        System.out.println(" Value after swap: " +b);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = 67,b=43;
//
//        System.out.println("Value before swapping a = "+a+ " b: "+b);
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//
//        System.out.println(a);
//        System.out.println(b);
//
//    }
//}
//import java.util.Scanner;
//public class Rough {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Num: ");
//        int num = input.nextInt();
//        int count = 0;
//
//        for (int i = 1; i <= num ; i++) {
//            if (num  % i == 0) ;
//                count++;
//
//
//
//        }
//        System.out.println(count);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number");
//        int num = input.nextInt();
//        int orignal = num;
//        int rem = 0;
//        double count= 0;
//        int component = 3;
//
//        for (; num != 0; num = num / 10) {
//            rem = num % 10;
//            count += Math.pow(rem, component);
//
//        }
//        if (orignal == count){
//            System.out.println("Armstrong Number");
//        }else{
//            System.out.println("Not Armstrong");
//        }
//
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A NUmber: ");
//        int num = input.nextInt();
//
//        int a = 0, b =1 ;
//        for (int i =1; i <= num; i++) {
//            int next = a + b;
//            System.out.println(next+" ");
//            a = b; //a = 1 // a=2
//            b = next; // b = 1 //
//
//
//        }
//    }
//}
// GCD
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int[] arr = new int[5];
//        int count = 0;
//        arr[0] = 12;
//        arr[1] = 16;
//        arr[2] = 13;
//        arr[3] = 56;
//        arr[4] = 70;
//        for (int i = 0; i <=4 ; i++) {
//            System.out.print(+arr[i]+" ");
//        }
//        System.out.println("\nprint a index: 0 to 4 ");
//        int num = input.nextInt();
//        for (int i = 0; i <= num; i++) ;
//            System.out.println("the element in this index "+num+" is:  "+arr[num]);
//
//
//
//        }
//
//        }
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        System.out.println("Print a row: ");
////        int num = input .nextInt();
//        int num = 5;
//
//        for (int i = 1; i <= num ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//
//            }
//            System.out.println( );
//
//        }
//
////       System.out.println(); // just print
////        for (int i = 0; i <=num ; i++) {
////            for (int j = 1; j <= num - i ; j++) {
////                System.out.print(" * ");
////            }
////            System.out.println();
////        }
//
//        }
//
//    }

//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int store = 0;
//        int reverse = arr.length;
//        int rem = 0;
//        int re = 0;

//        for (int i = arr.length-1; i >=0 ; i--) {
//            System.out.print("\n"+arr[i]);
         //   store = arr[i];

//            for (int j = 0; j < 8 -1; j++) {
//                System.out.println("Sorted array"+arr[i]);
//            }
//        }
//
//
//
//
//
//
////            int start = 0;
////            int end = arr.length - 1;
////
////            if (start < end) {
////
////                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
////
////                start++;
////                end--;
////                System.out.println("It is reverse Array: "+temp);
//////
//////            }
////            // System.out.println(rem+" nfjn");
////            // System.out.println(reverse);
////            // System.out.println(store);
////
////    }
//////}
//
//public class Rough {
//        public static void main(String[] args) {
//                int count = 0, add = 0;
//                int[] arr = {1,2,3,4,5};
//                for (int num : arr){
//                        if (num % 2 == 0){
//                                count++;
//                                //System.out.println("even Numbers: "+num);
//                        }if(num % 2 == 1){
//                                add++;
//                               // System.out.println("Odd Number: "+num);
//                        }
//
//                }
//                System.out.println(count);
//                System.out.println(add);
//        }
//}

//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Name: ");
//        String name = input.next();
//        String rem = "";
//       // System.out.println(name);
//
//        for (int i = name.length() - 1; i >= 0; i--) {
//            rem += name.charAt(i);
//        }
////        System.out.println(rem);
////        System.out.println(name);
//
//       if (name.equals(rem)){
//           System.out.println("String Is Palindrome ");
//       }else{
//           System.out.println("String Is Not Palindrome");
//       }
//    }
//}



//
//
//
//        //        System.out.println(name);
////        System.out.println(name.toLowerCase());
////        System.out.println(name.toUpperCase());
//
//    }
//}
// public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
//        int rem = 0;
//        for (int i =arr.length-1; i >=0 ; i--) {
//            rem += arr[i];
//            System.out.println("  "+rem);
//        }
//    }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A String: ");
//String string = input.next();
//String s11= "";
//String s1 = string;
//
//        for (int i = string.length() - 1; i >= 0 ; i--) {
//            //s11 += [i]
//
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int arr[] = {1, 4, 3, 9, 2, 7, 6, 4};
//        int rem = arr[0];  // assume first element is largest
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > rem) {
//                rem = arr[i];  // update largest
//            }
//        }
//
//        System.out.println("Largest Number in the array: " + rem);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        double[] arr ={3,4,5,7,2};
//        double count = 0;
//        for (int i = 0; i <= 4; i++) {
//            System.out.print(arr[i]+" ");
//            count +=arr[i];
//        }
//        System.out.println("\nAddition of all array elements: "+count);
//
//        System.out.println("Average of of all array elements: "+count/arr.length);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//
//        for (int i = 0; i <= n ; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print( i );
//
//            }
//            System.out.println();
//
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        for(int i=1; i<=5; i++){
//            if(i==3) continue;
//            System.out.println(i);
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int count = 0;
//        int[] arr ={12,32,45,65,7,33};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+"  ");
//            count +=arr[i];
//        }
//        System.out.println("\nAddition of Elements: "+count);
//        System.out.println("Average of Elements: "+count/ arr.length);
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("🕒 Digital Clock");
//        frame.setSize(200, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().setBackground(Color.BLACK);
//        frame.setLayout(new FlowLayout());
//
//        JLabel timeLabel = new JLabel();
//        timeLabel.setFont(new Font("Helvetica", Font.BOLD, 35));
//        timeLabel.setForeground(Color.CYAN);
//        frame.add(timeLabel);
//
//        Timer timer = new Timer(1000, e -> {
//            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
//            timeLabel.setText(time);
//        });
//
//        timer.start();
//        frame.setVisible(true);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr = new int[10];
//        int count = 0;
//        arr[0] = 21;
//        arr[1] = 19;
//        arr[2] = 24;
//        arr[3] = 45;
//        arr[4] = 32;
//        arr[5] = 29;
//        System.out.println("Array before insertion");
//        for (int i = 0; i < 6  ; i++) {
//            System.out.print(arr[i]+"  ");
//
//        }
//        System.out.println("\nEnter The element to you want to insert: ");
//        int num = input.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0){
//                arr[i] = num;
//                System.out.println(arr[i]);
//                break;
//            }
//        }
//
//
//        System.out.print("\nArray After Insertion: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+"New ");
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr = new int[8];
//        int count = 0;
//        arr[0] = 21;
//        arr[1] = 19;
//        arr[2] = 24;
//        arr[3] = 45;
//        arr[4] = 32;
//        arr[5] = 29;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//
//        System.out.println("Print the element you want add: ");
//        int num = input.nextInt();
//        System.out.println("Insert A Index Number between 0 to "+arr.length+" : " );
//        int index = input.nextInt();
//        if (index >= 9){
//            System.out.println("Error");
//
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[index] = num;
//                break;
//
//        }
//
//        System.out.println("New Array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//       }
////        // Element value Traversal
//        int traversal = 0;
//        System.out.println("print A Index Number between 0 to "+" 7"+" : " );
//        int tr = input.nextInt();
//
//        for (int i = 0; i < arr.length; i++) {
//            traversal = arr[tr];
//          }
//
//        System.out.println("Value can be store in this index  "+ tr+" is : " + traversal);
//
//        }
//    }

     //// Value traversal
//        System.out.println("Print the element to find element are store in array yes or No: ");
//        int ele = input.nextInt();
//        boolean isFound = false;
//        int el = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (ele == arr[i]){
//                isFound = true;
//            }
//
//            }
//        if (isFound){
//            System.out.println("The Element is found in array");
//        }else{
//            System.out.println("The elements Is Not Found In Array");
//        }
//
//
//        }
//
//    }

//                                            //// Delete element in Array ////
//               public class Rough {
//            public static void main(String[] args) {
//                Scanner input = new Scanner(System.in);
//                int minus = 0;
//                int[] arr = {23,45,22,31,36,78,55};
//
//
//
//                System.out.println("Print The Index Number You Want to delete between 0 to 6 :");
//                int delete = input.nextInt();
//
//                for (int i = 0; i < arr.length; i++) {
//
//                }
//               // System.out.println(minus);
//
//
//                }

  //          }

//        public class Rough {
//            public static void main(String[] args) {
//                int[] arr = {23,44,56,67,45,43};
//
//                for (int i = 0; i <arr.length ; i++) {
//                    System.out.print(arr[i]+"  ");
//                }
//
//                for (int i = arr.length -1; i >= 0 ; i--) {
//                    System.out.println(arr[i]+" ");
//                }
//
//            }
//        }

//public class Rough{
//         public static void main(String[] args) {
//             int arr[] ={1,2,3,4,5,3,2,4,};
//             int count = 0;
//
//             for (int i = 0; i < arr.length; i++) {
//                 for (int j = i + 1; j < arr.length; j++) {
//                     if (arr[i] == arr[j]){
//                         System.out.println(arr[i]+" ");
//                         count ++;
//
//                     }
//
//                   //  System.out.println(arr[i]);
//                 }
//
//
//             }
//             System.out.println("Repeated Element: "+count);
//         }
////
//}
//public class Rough {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 3, 2, 4,};
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == arr[i] + count){
//                count = arr[i];
//            }
//        }
//        System.out.println(count);;
//    }
//}
////// Permutation Program
//public class Rough {
//    public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int count = 0;
//        System.out.print("Print A Number: ");
//        int num = input.nextInt();
//        for (int i = num; i <= num ; i++) {
//            if (num != num){
//                System.out.println(num);
//            }
//
//
//        }
//
//
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {22,15,23,12,13};
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > count) {
//                count = arr[i];
//            }
//        }
//        System.out.println("Gratest Value Is: "+count);
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number: ");
//        int num = input.nextInt();
//        int orignal = num;
//        int reversed = 0;
//        int rem = 0;
//
//        for (; num!=0;num = num / 10){
//            rem = num % 10;
//          reversed = reversed * 10 + rem;
//        }
//        System.out.println(reversed);
//        if (orignal == reversed){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not Palindrome");
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number To Check Armstrong Or Not: ");
//        int num = input.nextInt();
//        int orignal = num;
//        double count = 0;
//        int rem = 0;
//        int com = 3;
//
//
//        for (;num !=0;num=num /10){
//            rem = num % 10;
//            count += Math.pow(rem,com);
//
//        }
//
// if (orignal == count){
//     System.out.println("Armstrong");
// }else {
//     System.out.println("Not Armstrong");
// }
//    }
//}
//// fibo
//public  class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number To print you want: ");
//        int num = input.nextInt();;
//
//        int a = 0, b = 1;
//        System.out.println(a+" ");
//        for (int i = 0; i < num; i++) {
//            int next = a + b;
//            System.out.println(next+" ");
//            a = b;
//            b = next;
//
//
//
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print The index You Want to print A Array: ");
//        int num = input.nextInt();
//        int count = 0;
//
//        int[] arr = new  int[num];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Print A " + i + " Value: ");
//            int num1 = input.nextInt();
//             arr[i] = num1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//
//        }

//
//        }
//
//        }
//// Insert  element in array
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr ={12,32,43,23,12,45};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+"  ");
//        }
//
//
//
//        System.out.println("print the value you want to insert: ");
//        int num = input.nextInt();
//        System.out.println(num +" is element you insert in which index: 0"+" to "+ arr.length);
//        int num1 = input.nextInt();
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[num1] = num;
//            System.out.println(arr[i]+" ");
//
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print  A Number: ");
//        int num = input.nextInt();
//        boolean isPrime = true;
//
//        if (num <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//
//                }
//            }
//
//        }
//        if (isPrime){
//            System.out.println("Prime Number");
//        }else{
//            System.out.println("Not Prime");
//        }
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A NUmber: ");
//        int num = input.nextInt();
//        int fact = 1;
//
//        for (int i = 1; i <= num ; i++) {
//            fact *= i;
//
//        }
//        System.out.println(fact);
//    }
//}
//public class Rough {
//    public static int factorial(int n){
//        if(n == 0|| n ==1){
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
//
//    public static void main(String[] args) {
//        int num = 5;
//        System.out.println(factorial(num));
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {35,12,22,14,53,21,34};
//        int count = 0;
//        int second = 0;
//        int sample = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > count){
//                count = arr[i];
//            }
//
//        }
//        System.out.println("Gratest Number Is: " + count);
//        for (int i = 0; i < arr.length; i++) {
//            count = second;
//            if (arr[i] > sample || arr[i] == 53) {
//                sample = arr[i];
//                break;
//
//            }
//            }
//        System.out.println("Second Largest Number: "+sample);
//        }
//
//}
//public class Rough {
//    public static void main(String[] args) {
//        String s1 = "Hello  World";
//        String count = "";
//        String a = "a";
//        String e = "a";
//        String i = "a";
//        String o = "a";
//        String u = "a";
//        for (int j = 0; j < s1.length(); j++) {
//            char[] arr = s1.toCharArray();
//            if (s1.equals(a) && s1.equals(e) && s1.equals(i) && s1.equals(o) && s1.equals(u)){
//                System.out.println(s1);
//            }
//        }
//        System.out.println("Number of vowels: "+count);
//    }
////}
//public class Rough {
//    public static void main(String[] args) {
//        String s1 = "Hello World";
//        int count = 0; // count of vowels
//        int cou =  0; //count of  consonants
//
//        for (int j = 0; j < s1.length(); j++) {
//            char ch = Character.toLowerCase(s1.charAt(j)); // convert to lowercase
//
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                count++;
//            }else{
//                cou++;
//
//
//            }
//        }
//
//        System.out.println("Number of vowels: " + count);
//        System.out.println("Number of Consonants: "+cou);
//    }
//}

//public  class Rough {
//    public static void main(String[] args) {
//        int count = 0;
//        int co = 0;
//        String ss = "Welcome";
//        for (int i = 0; i < ss.length(); i++) {
//            char c = Character.toLowerCase(ss.charAt(i));
//            if (c == 'e'){
//                count++;
//            }else{
//               co++;
//            }
//        }
//        System.out.println(co);
//        System.out.println(count);
//
//    }
////}
//public  class Rough {
//    public static void main(String[] args) {
//       // Scanner input = new Scanner(System.in);
//        char s1 = 'a' + 13;
//        int s2 =  'a' + 13;
//
//        System.out.println(s1);
//        System.out.println(s2);
//
//
//    }
//}

//
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A NUmber:");
//        int num1 = input.nextInt();
//        System.out.println("Print A NUmber:");
//        int num2 = input.nextInt();
//        System.out.println(num2+num1);
//
//
//}

//public class Rough {
//    public static void main(String[] args) {
//        int rem = 'A' + 9 +'a';
//        System.out.println(rem);
//    }
//}



////// Bubble sort

//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {3,1,5,4,2};
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "   ");
//        }
//
//            for (int i = 0; i < arr.length; i++) {
//      if(arr[0] > arr[1]) {
//          arr[0] = arr[1];
//          arr[1] = 3;
//      }}
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[1] > arr[2]) {
//                arr[1] = arr[2];
//
//            }
//        }
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[2] > arr[3]){
//                    arr[2] = arr[3];
//                    arr[3] = 5;
//                }
//            }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[3] > arr[4]){
//                arr[3] = arr[4];
//                arr[4] = 5;
//
//            }
//
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("\n Sorted Array "+arr[i]);
//        }
//
//        }
//
//    }

////new  Bubble Sort
//public class Rough {
//    public static void main(String[] args) {
//       int[]  arr ={3,1,5,4,2};
//int temp = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i; j++) {
//                if (arr[i] > arr[j]) {
//
//                   arr[i] = arr[j];
//
//                }
//
//            }
//            System.out.println(arr[i]+" ");
//        }
//    }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr ={21,32,43,21,34,15};
//
//        System.out.println("Original Array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("Please Insert The element You Want to Add:  ");
//        int num = input.nextInt();
//        System.out.println("Please Insert The index Number You Want to Add new element: 0 to "+ 5);
//        int num1 = input.nextInt();
//
//        System.out.println("New Array:");
//        for (int i = 0; i <arr.length; i++) {
//          arr[num1] = num;
//            System.out.println(arr[i]);
//        }
//
//    }
//}


//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr = {21, 32, 43, 21, 34, 15};
//
//        System.out.println("Original Array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        System.out.print("Please insert the element you want to add: ");
//        int num = input.nextInt();
//
//        System.out.print("Please insert the index (0 to " + arr.length + "): ");
//        int index = input.nextInt();
//
//        // Create new array of size +1
//        int[] newArr = new int[arr.length + 1];
//
//        // Copy elements before the index
//        for (int i = 0; i < index; i++) {
//            newArr[i] = arr[i];
//        }
//
//        // Insert new element
//        newArr[index] = num;
//
//        // Copy remaining elements
//        for (int i = index; i < arr.length; i++) {
//            newArr[i + 1] = arr[i];
//        }
//
//        System.out.println("New Array:");
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i] + " ");
//        }
//    }
//}

//
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr = {12,32,19,66,76,34};
//
//        System.out.println("Normal Array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
////
////        System.out.println("Print a Number You Want To Insert: ");
////        int num = input.nextInt();
//
//        for (int i = 0; i < arr.length + 1; i++) {
////            if (arr[i] == 0){
////                arr[i] = num;
//           }
//        System.out.println(arr.length);
//
////        }
////        System.out.println("Array After Insertion: ");
////        for (int i = 0; i < arr.length; i++) {
//           System.out.println(arr[i]+"  ");
////
////        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr = {12, 64, 74, 52, 43, 22};
//        System.out.println("Original Array");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
//        int[] newArr = new int[arr.length + 1];
//
//        System.out.println("Enter the Element You Want Add: ");
//        int num = input.nextInt();
//        System.out.println("Enter the index number between 0 to : "+ newArr.length);
//        int num1 = input.nextInt();
//
//
//
//
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//        for (int i = 0; i < newArr.length; i++) {
//           // if (newArr[i] == 0) {
//                newArr[num1] = num;
////                break;
////            }
//        }
//
//
//
//        System.out.println("Array After Insertion: ");
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.println(newArr[i]);
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        long com = 20;
//        long base = 3;
//        double rem = 0;
//
//        rem =Math.pow(base,com);
//        System.out.println(rem);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int num = 99;
//        int count = 0;
//
//        boolean isPrime = false;
//        if (num <= 1){
//            isPrime = false;
//        }else {
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0){
//                    isPrime = true;
//                   count++;
//                }
//
//            }
//
//            System.out.println(count);
//        }
//    }
//}
//public class Rough {
//        public static void main(String[] args) {
//                int[] s = new int[10];
//                int[] q = new int[10];
//                int[] st1 = {23,45,34,29};
//                int[] st2 = {33,45,23,14};
//                for (int i = 0; i < st1.length; i++) {
//
//                }
//                for (int i = 0; i < q.length; i++) {
//                   q[i] = st2[i] + st1[i];
//                }
//
//                for (int i = 0; i < q.length; i++) {
//                        System.out.println(q[i]);
//
//                }
//
//
//                for (int i = 0; i < s.length; i++) {
//                        s[i] = q[i];
//                        System.out.println(s[i]);
//
//                }
//       }}

//public class Rough {
//        public static void main(String[] args) {
//                Scanner input = new Scanner(System.in);
//                System.out.println("Print A Row: ");
//                int rows = input.nextInt();
//
//                for (int i = 1; i <= rows  ; i++) {
//                        for (int j = 1; j <= rows ; j++) {
//                                System.out.print(" * ");
//                        }
//                        System.out.println( );
//                }
//                System.out.println(); // only print space
//
//                for (int i = 1; i <= rows ; i++) {
//                        for (int j = 1; j <= i; j++) {
//                                System.out.print(" * ");
//
//                        }
//                        System.out.println( );
//                }
//
//                System.out.println(); // only print space
//
//                for (int i = 1; i <= rows ; i++) {
//                        for (int j = 1; j <= rows - i ; j++) {
//                                System.out.print(j+"  ");
//                        }
//                        System.out.println( );
//                }
//
//
//                System.out.println( );
//                int num = 5;
//                for (int i = 1; i <= num ; i++) {
//                        for (int j = 1; j <= i ; j++) {
//                                System.out.print(j+" ") ;
//
//                        }
//                         System.out.println();
//                }
//                System.out.println();
//
//
//
//                for (int i = 1; i <= rows; i++) {
//                        for (int j = 1; j <= i ; j++) {
//                                System.out.print(" * ");
//                        }
//                        System.out.println();
//                }
//                for (int i = 1; i < rows; i++) {
//                        for (int j = 1; j <= rows- i ; j++) {
//                                System.out.print(" * ");
//                        }
//                        System.out.println();
//                }
//
//
//
//        }
//
//}

//
//public class Rough {
//    public static void main(String[] args) {
//        array();
//    }
//
//    public static void array() {
//        int[] array = {1,2,3,4,5,6,7,8,9,10};
//
//        // Step 1: Find prime numbers and store them
//        int[] primes = new int[array.length];
//        int count = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (isPrime(array[i])) {
//                primes[count] = array[i];
//                count++;
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(primes[i]);
//
//        }
//
//
//        // Step 2: Print prime numbers in reverse
//        System.out.println("Prime numbers in reverse order:");
//        for (int i = count - 1; i >= 0; i--) {
//            System.out.print(primes[i] + " ");
//        }
//    }
//
//    public static boolean isPrime(int n) {
//        if (n <= 1) return false;
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int num = 6;
//
//        for (int i = 0; i <= num; i++) {
//
//            for (int j = 0; j < num ; j++) {
//                System.out.print(" * ");
//                for (int k = 0; k < num - i; k++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//
//            }
//            System.out.println();
//        }
//
//    }
////}
//public class Rough {
//    public static void main(String[] args) {
//         int n = 7; // rows
//        int m = 7; // columns
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n ; j++) {               // rows
//                if (i == 1 || j == 1 || i == 7 || j == 7 || i == 4 || j == 4) {
//                    System.out.print(" * ");
//                }else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println( );
//
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 0; i <= n ; i++) {
//            for (int j = 0; j <= n - i ; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 5; i >= 1 ; i--) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n - i ; j++) { // aplya n chi value ahe 5 - i  i = 1 one space print honar mg next line la 2 space print honar mg next line 3 space print honar
//                System.out.print("  ");
//
//            }
//            for (int j = 0; j <= i  ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//
//            }
//            System.out.println();
//        }
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i =5; i >= 1 ; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//
//            }
//            System.out.println();
//        }
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//        int num = 1;
//        for (int i =1; i <= 5 ; i++) {
//            for (int j = 1; j <= i; j= j+1) {
//                System.out.print(num +" ");
//                num++;
//
//            }
//            System.out.println();
//        }
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//
//        for (int i = 1; i < 5 ; i++) {
//            for (int j = 1; j <= i; j++) {
//                int sum = i + j;
//                if (sum % 2 == 0){
//                    System.out.print(" 1 ");
//                }else {
//                    System.out.print(" 0 ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int n = 6;
//
//        //upper half
//        for (int i = 1; i <= n ; i++) {
//            //1st half
//            for (int j = 1; j <= n ; j++) {
//                System.out.print(" * ");
//            }
//            //spaces
//            int spaces = 2 * (n - 1);
//            for (int j = 0; j <= spaces ; j++) {
//                System.out.print(" ");
//            }
//            //2nd part
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" ");
//
//            }
//            System.out.println( );
//    }
//
//}
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number : ");
//        int num = input.nextInt();
//        int sum = 0;
//        int original = num;
//
//        for (int i = 1; i <  num; i++) {
//            if (num % i == 0){
//                sum += i;
//            }
//
//        }
//        //System.out.println(sum);
//        if (sum == num){
//            System.out.println("Perfect Number");
//        }else{
//            System.out.println("Not Perfect");
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        String s = "Hello";
//        int id = System.identityHashCode(s);
//        System.out.println("Pseudo address of s: 0x" + Integer.toHexString(id));
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");  // single space dila tar pyramid print hoto  double space dila half traingle print hot
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 5; i >= 1 ; i--) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//
//            }
//            System.out.println();
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int n = 6;
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                if (i == 6 || j == i || j == 0) {
//                    System.out.print("* ");
//               } else {
//                    System.out.print("  ");
//                }
//
//
//            }

//            System.out.println();
//        }
//    }
//
//}
//public class Rough {
//    public static void main(String[] args) {
//        String str = "madam";  // Example input
//        StringBuilder sb = new StringBuilder(str);
//        String reversed = sb.reverse().toString();
//
//        if (str.equals(reversed)) {
//            System.out.println("String is palindrome");
//        } else {
//            System.out.println("Not palindrome");
//        }
//    }
//}
//public class Rough {
//    public static  int factorial(int n){
//        if (n == 0|| n == 1){
//            return 1;
//        }else {
//            return n * factorial(n - 1);
//        }
//
//
//    }
//    public static void main(String[] args) {
//        int num = 5;
//
//        System.out.println(factorial(num));
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {12,11,21,15,14};
//        int count = 0;
//        int count1 = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//                     if (arr[i] > count){
//                         count = arr[i];
//
//                     }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (count1 > arr[i] ){
//                count1 = arr[i];
//
//            }
//        }
//
//
//
//        System.out.println("Gratest Value in the array: "+count);
//        System.out.println("largest value in the array: "+count1);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        // StringBuilder  sb = new  StringBuilder("Welcome");
//        String name = "Welcome i am the java developer";
//        int vowels = 0;
//        int consononts = 0;
//
//        //char ch = name.toLowerCase().charAt(name.length());
//        for (int i = 0; i < name.length(); i++) {
//            char ch = name.toLowerCase().charAt(i);
//            if (ch == 'a'||ch == 'e'|| ch == 'i'|| ch == 'o'||ch =='u'){
//                  vowels++;
//              }else{
//                  consononts++;
//              }
//        }
//        System.out.println(vowels);
//        System.out.println(consononts);
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr ={12,34,22,21,34,12};
//        int dup = arr[0];
//        int[] newArr = {};
//
//        newArr = arr;
//
////        for (int i = 0; i < arr.length; i++) {
//           System.out.println(newArr[i]);
////        }
//
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == newArr[i]){
//                dup = arr[i];
//            }
//            System.out.println(dup);
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr ={1,2,3,5,6,7};
//        for (int i = arr.length- 1; i >=0 ; i--) {
//            System.out.println(arr[i]);
//
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        String s1 = "onkar";
//        String rev = "";
//        for (int i = s1.length()-1; i >=0 ; i--) {
//           rev = rev+ s1.charAt(i);
//        }
//        System.out.println(rev);
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//
//        System.out.println(
//                "" + (char)0b01001000 + (char)0b01100101 + (char)0b01101100 +
//                        (char)0b01101100 + (char)0b01101111 + " " +
//                        (char)0b01010111 + (char)0b01101111 + (char)0b01110010 +
//                        (char)0b01101100 + (char)0b01100100
//        );
//    }

//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {21,22,33,22,33};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                    break;
//                }
//
//            }
//
//        }
//
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {12, 31, 56, 22, 5};
//        int num1 = 0;
//        int num2 = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > num1) {
//                num1 = arr[i];
//            }
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (num2 > arr[i] && arr[i] != num1){
//                num2 = arr[i];
//
//
//            }
//        }
//
//
//        System.out.println("1st Largest Number: " + num1);
//            System.out.println("Second largest number is: " + num2);
//
//
//    }
//
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print Your name: ");
//        String name = input.next();
//        System.out.println("How many times you want Print: ");
//        int num = input.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            System.out.println(name);
//        }

//    }
//}
//public
//class Rough {
//    public static void main(String[] args) {
//        int n  = 3;
//        int c=0;
//        for (int i = 0; i < n; i++) {
//   c =    i*i*i*i+2;
//        }
//        System.out.println(c);
//    }
//}
//public class Rough {
//    public static  int add(int a, int b){
//        return  a+ b;
//    }
//    public static double add(double a , double b, double c){
//        return a+ b+c;
//    }
//    public static int mul(int a, int b){
//        return a * b;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int num1 = input.nextInt();
//        for (int i = 0; i < 10 ; i++) {
//            int num = input.nextInt();
//            int num1 = input.nextInt();
//            System.out.println(add(num, num1));
//            break;
//        }
//        System.out.println(add(5,6));
//        System.out.println(add(15,3,7));
//        System.out.println(mul(5,5));
//    }
//}
//class example {
//    String name;
//    int age;
//
//
//    example(String a, int b) {
//        name = a;
//        age = b;
//    }
//    void display(){
//        System.out.println("Name: "+name);
//        System.out.println("age: "+age);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        example ex = new example("Onkar", 23);
//        ex.display();
//    }
//}
//class parent{
//    int a = 10;
//    void show(){
//        System.out.println("Parent");
//    }
//    class child extends parent{
//    int b = 20;
//    void show() {
//        System.out.println("child");
//    }
//    }
//
//    public static void main(String[] args) {
//        parent p1 = new parent();
//        p1.show();
//        System.out.println(p1.a);
//    }
//
//}
//public class Rough {
//    public static void main(String[] args) {
//        int a = 5,b=3;
//        int c = a/b * b;  // expression ambiguity
//        int d = (a/b)*b;
//        System.out.println(c);
//        System.out.println(d);
//    }
//}
//    class Test{
//    void show(int a ,  int b){}
//    void show(double a ,int b){}
//}
//public class Rough {
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.show(5,10);
//    }
//
//}

//public class Rough {
//    public static void main(String[] args) {
//        int count = 0;
//        int[] arr = {12,34,21,12,23,34};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length ; j++) { // j = 0 pasun chalu zala tar tar to first element la pn compare karin tychymul to i + 1  karaycha mg to 12 sobat sagle pudche number compare karto
//                if (arr[i] == arr[j]){
//                    count = arr[i];
//
//
//                }
//
//            }
//            System.out.println(count);
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {12, 34, 25, 11, 23};
//        int first = 0;
//        int second = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > first) {
//                second = first;  // update second largest
//                first = arr[i];  // update largest
//            } else if (arr[i] > second && arr[i] != first) {
//                second = arr[i]; // update second largest only
//            }
//        }
//        System.out.println(first);
//        System.out.println(second);
//    }
//}
//
//        System.out.println("Largest number: " + first);
//        System.out.println("Second largest number: " + second);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        String s1 = "madam";
//        String rev = "";
//        for (int i = s1.length()- 1; i >= 0 ;  i--) {
//            char ch  = s1.charAt(i);
//            rev = rev + ch;
//        }
//        System.out.println(rev);
//
//        if (s1.equals(rev)){
//            System.out.println("String Is Palindrome");
//        }else {
//            System.out.println("Not Palindrome");
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int num = 123;
//        int com = 3;
//        int sum = 0;
//        int rem = 0;
//        double rev = 0;
//        for (; num != 0; num = num / 10){
//            rem  = num % 10;
//            rev = Math.pow(rem,com);
//            sum += rev;
//        }
//        System.out.println(sum);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 0; i <= n ; i++) {
//            for (int j = 0; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//         if (num  == 0){
//             System.out.println("It's Zero");
//         } else if (num < 0) {
//             System.out.println("Negative Number");
//
//         }else {
//             System.out.println("Positive Number");
//         }
//    }
//
//}

//public class Rough {
//    public static void main(String[] args) {
//        int[] arr ={21,32,12,34,22,13};
//        int[] even = new int[arr.length];
//        int[] odd = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0){
//                System.out.println("Even Number: "+ arr[i]);
//            }else{
//                System.out.println("Odd Number: " + arr[i]);
//            }
//
//        }
//        for (int i = 0; i < odd.length; i++) {
//            System.out.println(odd[i]);
//
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {21, 32, 12, 34, 22, 13};
//
//        for (int num : arr) {                     // enhanced for-loop
//            System.out.println((num % 2 == 0 ? "Even" : "Odd") + " Number: " + num);
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] newArr = new int[10];
//        int[] newArr1 = new int[10];
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < arr.length; i++) {
//          if (isPrime(arr[i])){
//              newArr[i] = arr[i];
//          }else {
//              newArr[i] = 0;
//          }
//        }
//        for (int i = 0; i < newArr.length; i++) {
//            if (newArr[i] == 0){
//                System.out.println( );
//            }
//            else {
//                 System.out.print(newArr[i]+" ");
//
//            }
//
//        }
//
//
//
//        }
//        public static boolean isPrime(int n){
//        if (n <= 1){
//            return  false;
//        }else {
//            for (int i = 2; i < n ; i++) {
//                if (n % i == 0) {
//                    return  false;
//                }
//
//            }
//        }
//        return true;
//        }
//    }
//// Write a Java program to find and print all Armstrong numbers between 1 and 1000.
//public class Rough {
//    public static void main(String[] args) {
//        int num = 1000;
//        for (int i = 1; i <= num ; i++) {
//          if (isArmstrong(i)) {
//              System.out.println(i);
//          }
//
//        }
//
//
//    }
//    public static boolean isArmstrong(int n){
//        int com = 3;
//        double count = 0;
//        int rem = 0;
//        int sum = 0;
//
//       int original = n;
//       if (n <= 1){
//           return false;
//       }else{
//       for (;n != 0; n = n / 10) {
//           rem = n % 10;
//           count = Math.pow(rem, com);
//           sum += count;
//       }
//       if (sum == original){
//           return  true;
//       }else {
//           return false;
//       }
//       }
//
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Print A Number: ");
//        int num = in.nextInt();
//        int original = num;
//
//        int rem = 0;
//        double count = 0;
//        int sum = 0;
//        int com = 3;
//
//        for (;num != 0; num = num / 10){
//            rem = num % 10;
//            count = Math.pow(rem,com);
//            sum += count;
//
//        }
//
//        if (original == sum){
//            System.out.println("Armstrong Number");
//        }else{
//            System.out.println("Not Armstrong15");
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Print A Number: ");
//        int num = in.nextInt();
//        int rev = 0;
//        int rem = 0;
//int original = num;
//        for (; num != 0; num = num / 10){
//             rem = num % 10;
//            rev = rev * 10 + rem;
//        }
//        if (rev == original){
//            System.out.println("Palindrome ");
//        }else{
//            System.out.println("Not Palindrome");
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr ={ 2,4,5,3,2,1,7,5};
//        int lar = 0;
//        int small = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//      if (arr[i] > lar){
//           lar = arr[i];
// }
//        }
//        System.out.println("Largest Element In the array is: "+ lar);
//        for (int i = 0; i < arr.length; i++) {
//            if (small > arr[i]){
//                small = arr[i];
//            }
//
//        }
//        System.out.println("Smallest Number In the Array : "+small);
//    }
//
//}

//public  class Rough {
//    public static void main(String[] args) {
//        String in = "Hello 123";
//        int vow =0;
//        int consonants = 0;
//        for (int i = 0; i < in.length(); i++) {
//            char c =Character .toLowerCase(in.charAt(i));
//if (Character.isLetter(c)) {
//    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//        vow++;
//    } else {
//        consonants++;
//    }
//}
//        }
//        System.out.println(vow);
//        System.out.println(consonants);
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        int[] arr ={1,2,3,4,5,6,7,8,9,10};
//        int sumOfEven = 0;
//        int sumOfOdd = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0){
//                sumOfEven += arr[i];
//            }else{
//                sumOfOdd +=arr[i];
//            }
//
//        }
//               System.out.println("Sum of Even Numbers In the Array: "+sumOfEven);
//               System.out.println("Sum of Odd Numbers In The Array: "+sumOfOdd);
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7,3,2,1};
//        int sumOfEven = 0;
//        int sumOfOdd = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j <arr.length ; j++) {
//   if (arr[i] == arr[j]){
//       System.out.println(arr[i]);
//   }
//            }
//
//        }
//    }
//        }
/// / Bubble Sort
/////// as kahitari karaych jo array madhla saglyat motha element ahe to last la gela pahije
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {7, 8, 3, 1, 2};
//        for (int i = 0; i < arr.length - 1 ; i++) { // outer loop
//            for (int j = 0; j < arr.length - i - 1; j++) { // inner loop
//                if (arr [j] > arr[j +1]){
//                    // swap
//                    int swap = arr[j];
//                     arr[j] = arr[j + 1];
//                      arr[j +1 ] = swap;
//                } } }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }
//
//
//    }
//}
/// /  Selection Sort
/// / selection sort jo element saglyat motha ahe to arr[0] index la ghyacha

//public class Rough {
//    public static void main(String[] args) {
//        int[] arr ={7,8,3,1,2};
//        for (int i = 0; i < arr.length - 1; i++) {
//            int smallest = i;
//            for (int j = i + 1; j <arr.length ; j++) {
//            if (arr[smallest] > arr[j]){
//                smallest = j;
//            }
//            }
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i]  = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }
//    }
//}
//public class Rough {
//     public static void main(String[] args) {
//        int n = 5;
//        for (int i = 0; i <= 5 ; i++) {
//            for (int j = 0; j < n - i ; j++) {
//                System.out.print("  ");
//
//              }
//              for (int j = 0; j <= i ; j++) {
//                  System.out.print("* ");
//
//              }
//              System.out.println();
//
//          }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int count = 0;
//
//        System.out.println("Palindrome Number Founder Between 1 To 1000");
//        for (int i = 1; i <= 500 ; i++) {
//          if (isPalindrome(i)){
//              System.out.println(i);
//              count++;
//          }
//
//        }
//        System.out.println("Total Numbers of palindrome between 1 To 1000: "+count);
//
//    }
//
//
//
//
//
//
//
//
//    public static boolean isPalindrome(int n){
//         int org = n;
//        int rev = 0;
//        for(;n != 0; n = n/ 10){
//            int rem = n % 10;
//            rev = rev * 10 + rem;
//        }
//        if (rev == org){
//            return  true;
//
//        }else{
//            return  false;
//        }
//
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        int[] arr ={12,21,23,12,11};
//        int first = 0;
//        int second = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > first) {
//                second = first;   // move old first to second
//                first = arr[i];   // update first
//            } else if (arr[i] > second && arr[i] != first) {
//                second = arr[i];  // update second largest
//            }
//        }
//
//        System.out.println("First Largest Number In the array: "+first);
//        System.out.println("Second Largest Number In the array: "+second);
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        int[] arr = {7,8,3,1,2};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j <arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]){
//                    int swap = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = swap;
//                }
//
//            }
//
//            }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print a name: ");
//        String s = input.next();
//        char ch =s.charAt(0);
//       // String s1 =  "onkar";
//        for (int i = s.length() - 1; i >= 0 ; i--) {
//  ch = s.charAt(i);
//            System.out.print(ch);
//        }
//        System.out.println(ch);
//
//
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {3,7,8,9,5};
//        Scanner input = new Scanner(System.in);
//        int first = 0;
//        int second = 0;
//        System.out.println("What Is your target: ");
//        int target = input.nextInt();
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[i] + arr[j] == target){
//                   first= arr[j];
//                 second  = arr[i];
//
//                }
//
//
//        }
//
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i] == first){
//                System.out.println(i);
//            }
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i] == second) {
//                System.out.println(i);
//            }
//        }
//     }
//}
//import java.util.Scanner;
//class Solution {
//    public static void main(String[] args){
//        boolean isPalindrome = true;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number: ");
//        int num = input.nextInt();
//        int rev = 0;
//        int rem = 0;
//        int org = num;
//
//
//        for(; num != 0; num = num / 10){
//            rem = num % 10;
//            rev = rev * 10 + rem;
//
//        }
//        System.out.println(rev);
//        if(org == rev){
//            System.out.println(isPalindrome = true);
//        }else{
//            System.out.println(isPalindrome = false);
//        }
//    }
//}
////import java.util.Scanner;
//public class Rough{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print a Number: ");
//        int num = input.nextInt();
//        if (isPalindrome(num)) {
//            System.out.println(num + " Num is Palindrome");
//        } else {
//            System.out.println(num +" is Not Palindrome ");
//        }
//    }
//
//    public static boolean isPalindrome(int x) {
//                    int rem = 0;
//                    int rev = 0;
//                    int org = x;
//                    for (; x != 0; x = x / 10) {
//                        rem = x % 10;
//                        rev = rev * 10 + rem;
//                    }
//                return rev == org;
//                    }
//                    }
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print your age : ");
//        long num = input.nextInt();
//    num += 5;
//        System.out.println("Your age => "+ num);
//    }
//}





//
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i + 1; j<nums.length; j++){
//                if(nums[i] == nums[j]){
//                    System.out.println(nums[i]+" ");
//                }
//            }
// public class Rough {
//    public static void main(String[] args) {
//        int[] nums = {1,1,2};
//        Solution obj = new Solution();
//        obj.removeDuplicates(nums);
//    }
//}
//
//
//class Solution {
//     public int removeDuplicates(int[] nums) {
//
//         for (int i = 0; i < nums.length; i++) {
//                    for (int j = i + 1; j < nums.length; j++) {
//                        if (nums[i] == nums[j]) {
//                            System.out.println("Duplicate "+ nums[i]);
//                        }else{
//                            System.out.println("org "+ nums[1]);
//                        }
//                    }
//                }
//
//                return 0;
//            }
//
//        }
//public class Rough {
//    public static void main(String[] args) {
//        double x = 8;
//        int sum = (int) Math.sqrt(x);
//        System.out.println(Math.round(sum));
//
//    }
//class Solution {
//    public int mySqrt(int x) {
//        x = (int) Math.sqrt(x);
//        x = Math.round(x);
//
//    return x;
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 1000; i++) {
//            if (i % 2 ==0){
//                System.out.print(i+" ");
//            } else if (i % 3 == 0) {
//                System.out.println(i);
//            }else {
//                System.out.println("Another NUmber"+ i);
//            }
//
//        }
//    }
//}
///  2D Array
//public class Rough {
//    public static void main(String[] args) {
//
//        int[][] arr = {{1,2,3},{6,8,9}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//int num = 1000;
//int count = 0;
//int[] arr = new int[1000];
//        for (int i = 1; i <= num ; i++) {
//            if (i % 5 == 0){
//                count++;
//            }else {
//                arr[i] = i;
//            }
//
//        }
//        System.out.print("Is Number: "+count);
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0){
//                System.out.print(" ");
//            }else{
//                System.out.print(arr[i]+" ");
//            }
//            ;
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            her();
//        }
//        hello();
//        he();
//
//    }
//
//    public static void hello() {
//        System.out.println("Hello World");
//    }
//
//    static int he() {
//        System.out.println("Hello");
//        return 0;
//    }
//
//    static int her() {
//        System.out.println("Sidhu");
//        return 0;
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        char ch = 'A';
//        int num  = 1;
//        int add = ch + num;
//        System.out.println(add);
//    }
//}

//
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a Number: ");
//        int num = input.nextInt();
//        int original = num;
//        int rem = 0;
//        int count = 0;
//
//
//
//
//
//        for(;num != 0; num = num / 10){
//             rem = num % 10;
//             count += rem * rem * rem;
//
//        }
//        System.out.println(count);
//        if (original == count ){
//            System.out.println("Armstrong Number");
//        }else{
//            System.out.println("Not Armstrong");
//        }
//
//
//    }
//
//
//}
//public class Rough {
//    public static void main(String[] args) {
//        int num = 67;
//        int original = num;
//        int rev = 0;
//        for (; num != 0; num = num / 10){
//            int rem = num % 10;
//            rev = rev * 10 + rem;
//
//        }
//        System.out.println(rev);
//        if (original == rev){
//            System.out.println("Number Is Palindrome "+original);
//        }else{
//            System.out.println("Number Is Not Palindrome "+original);
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        String s1 = "madam";
//        String s2 = "";
//
//        for (int i = s1.length() - 1; i >= 0; i--) {
//            s2 =s2 + s1.charAt(i);
//
//        }
//        System.out.println(s2);
//        if (s1.equals(s2)){
//            System.out.println("String is Palindrome");
//        }else{
//            System.out.println("String Is Not Palindrome");
//        }
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        String s1 = " hello  i am a java developer";
//        int vowels = 0;
//        int consonants = 0;
//        s1 =s1.toLowerCase();
//        for (int i = 0; i < s1.length(); i++) {
//            char ch = s1.charAt(i);
//            if (ch >= 'a' && ch <= 'z') {
//                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                    vowels++;
//                } else {
//                    consonants++;
//                }
//
//            }
//        }
//        System.out.println(vowels);
//        System.out.println(consonants);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int count = 0;
//        for (int i = 1; i <= 5 ; i++) {
//            System.out.println("print a "+ i +" number: ");
//            int num = input.nextInt();
//            count += num;
//
//        }
//        System.out.println("Addition of 5 numbers: "+count);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        try {
//
//
//            System.out.println("Print a 1st number to find a lcm: ");
//            int num = input.nextInt();
//            System.out.println("Print a 2nd  number to find a lcm: ");
//            int num2 = input.nextInt();
//            double addAll = num * 3.14 ;
//            System.out.println(addAll);
//            int sum = 0;
////        int num = 39;
////        int num2 = 45;
//            for (int i = 1; i <= 100; i++) {
//                sum = i * num;
//                if (sum % num2 == 0) {
//                    break;
//                }
//            }
//            System.out.println("is LCM of " + num + " and " + num2 + " is : " + sum);
//        } catch (Exception e) {
//            System.out.println("System error");
//        }
//    }
//
//}



//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number to find all prime numbers : ");
//        int num = input.nextInt();
//        int count = 0;
//        for (int i = 2; i < num ; i++) {
//            if (isPrime1(i)){
//                System.out.println(i);
//                count++;
//            }
//        }
//        System.out.println(count +" numbers  is prime between  0 to "+ num);
//    }
//    public static boolean isPrime1(int num) {
//        boolean isPrime = true;
//
//        if (num <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                }
//            }
//        }
//
////        if (isPrime) {
////            System.out.println("Prime Number ");
////        } else {
////            System.out.println("Not Prime");
////        }
//
//return isPrime;
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        try {
//            int num = 10;
//            int count = 0;
//
//            for (int i = 1; i <= num; i++) {
//                if (isOdd(i)) {
//                    System.out.println(i);
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }catch (Exception e){
//            System.out.println("error comes");
//        }
//
//
//    }
//    public static boolean isOdd (int n){
//        if (n % 2 == 1){
//        return true;
//        }else{
//            return false;
//        }
//
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        int num  = 10;
//        for (int i = 2; i <= num ; i=i+2) {
//            System.out.println(i);
//
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 9;
//        System.out.println(twoSum(a,b));
//
//    }
//    public static int twoSum(int a ,int b){
//         int c = a + b;
//        return c;
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//       String s1 = "katar";
//       String s2 = "";
//        for (int i = s1.length() - 1; i >= 0 ; i--) {
//         s2 = s2+s1.charAt(i);
//        }
//        System.out.println(s2);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int InvestmentAmount = 200;
//        int totalValue = 0;
//        int monthValue = 0;
//        int parcent = 5;
//        for (int i = 1; i <= 31 ; i++) {
//            totalValue = (200/100) * parcent;
//            monthValue = totalValue + InvestmentAmount;
//            InvestmentAmount = monthValue;
//
//
//        }
//        System.out.println(InvestmentAmount);
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        List<Integer>  list = new ArrayList<>();
//        list.add(55);
//        list.add(23);
//        list.add(39);
//        list.add(41);
//        System.out.println(list.stream().sorted());
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {12,32,45,11,22};
//        for (int i = 0; i < arr.length-1; i++) {
//
//
//        }
//    }
//}
    /// / It Is Merge Sort
    /// where is rough word is rough = MergeSort  we can used
//public class Rough {
//
//    // Function to merge two halves
//    void merge(int arr[], int left, int mid, int right) {
//        int n1 = mid - left + 1;
//        int n2 = right - mid;
//
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//
//        // Copy data to temp arrays
//        for (int i = 0; i < n1; ++i)
//            L[i] = arr[left + i];
//        for (int j = 0; j < n2; ++j)
//            R[j] = arr[mid + 1 + j];
//
//        // Merge the temp arrays
//        int i = 0, j = 0;
//        int k = left;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i];
//                i++;
//            } else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Copy remaining elements
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//
//    // Main function that sorts arr[left...right]
//    void sort(int arr[], int left, int right) {
//        if (left < right) {
//            int mid = (left + right) / 2;
//
//            sort(arr, left, mid);
//            sort(arr, mid + 1, right);
//
//            merge(arr, left, mid, right);
//        }
//    }
//
//    // Print array
//    static void printArray(int arr[]) {
//        for (int i : arr)
//            System.out.print(i + " ");
//        System.out.println();
//    }
//
//    // Driver code
//    public static void main(String args[]) {
//        int arr[] = {38, 27, 43, 3, 9, 82, 10};
//        System.out.println("Original Array:");
//        printArray(arr);
//
//        Rough ob = new Rough();
//        ob.sort(arr, 0, arr.length - 1);
//
//        System.out.println("\nSorted Array:");
//        printArray(arr);
//    }
//}
//public class Rough {
//        public static void main(String[] args) {
//            int vowels = 0;
//            int overallWords = 0;
//            int consonants = 0;
//            String s1 = "hello World my Name Onkar Rajenda Dale I am a full stack java developer";
//            for (int i = 1; i <s1.length() ; i++) {
//                 char ch = s1.charAt(i);
//                 if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
//                     vowels++;
//                     overallWords++;
//                 }else{
//                     consonants++;
//                     overallWords++;
//                 }
//
//            }
//            System.out.println(vowels);
//            System.out.println(consonants);
//            System.out.println("Overall letters = "+ overallWords);
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            try{
//            int[] arr ={21,31,29,75,11,23};
//            for (int i = arr.length - 1; i >=0; i--) {
//                System.out.println(arr[i]);
//            }
//            } catch (Exception e) {
//                System.out.println("error al rav");
//            }finally {
//                System.out.println("I ll be always executed");
//            }
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            String s1 = new String("Hello World");
//            s1= new String(" am Original");
//            s1= new String("World");
//            System.out.println(s1);
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            for(;;){
//                System.out.println(5);
//            }
//        }
//}


//public class Rough {
//        public static void main(String[] args) {
//            int arr[] = {12,34,55,12,48,34};
//            int j = 0;
//            for (int i = 0; i < arr.length -1; i++) {
//                if (arr[i] != j){
//                    j++;
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//                for ( j = 0; j < i; j++) {
//                    System.out.println(arr[j]+" duplicate numbers");
//                }
//            }
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            int arr[] = {12,34,55,12,48,34};
//            for (int i = 0; i < arr.length -1; i++) {
//                for (int j = i + 1 ; j <arr.length-1; j++) {
//                if (arr[i] == arr[j+1]) {
//                    System.out.println(arr[i] + " duplicate element");
//                }
//                }
//
//            }
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            array();
//        }
//
//        public static void array() {
//            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//            // Step 1: Find prime numbers and store them
//            int[] primes = new int[array.length];
//            int count = 0;
//
//            for (int i = 0; i < array.length; i++) {
//                if (isPrime(array[i])) {
//                    primes[count] = array[i];
//                    count++;
//                }
//            }
//
//            for (int i = 0; i < array.length; i++) {
//                System.out.println(primes[i]);
//
//            }
//
//
//            // Step 2: Print prime numbers in reverse
//            System.out.println("Prime numbers in reverse order:");
//            for (int i = count - 1; i >= 0; i--) {
//                System.out.print(primes[i] + " ");
//            }
//        }
//    }
//public class Rough {
//        public static void main(String[] args) {
//            int arr[] = {2,32,18,17,5};
//            int newArr[] = new int[arr.length];
//            for (int i = 0; i < arr.length; i++) {
//                if (isPrime(arr[i])){
//                    newArr[i] = arr[i];
//                    System.out.println(arr[i]+" Prime Numbers");
//
//                }else{
//                    System.out.println(arr[i]+" Not prime Numbers ");
//                }
//            }
//            for (int i = 0; i < newArr.length; i++) {
//                System.out.println(newArr[i]);
//            }
//
//
//        }
//        public static boolean isPrime(int x){
//            if (x <= 1){
//                 return false;
//            }else {
//                for (int i = 2; i < x ; i++) {
//                    if (x % i == 0){
//                        return false;
//                    }
//
//                }
//            }
//            return true;
//        }
//
//}
//public class Rough {
//        public static void main(String[] args) {
//            int num = 20;
//            int add = 0;
//            for (int i = 1; i <= 15; i--) {
//                add += i;
//
//            }
//            System.out.println(add);
//            float all = add/num;
//            System.out.println(all);
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            for (int i = 'A' - '@'; i <'e' ; i++) {
//                System.out.println(i);
//
//                }
//            System.out.println();
//            for (int j = 1; j <=100 ; j++) {
//                System.out.println(j);
//
//            }
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            int arr[] = {25,10,15,30,20};
//            int arr1[] = new int[arr.length];
//            int arr2[] = new int[arr.length];
//            int pivot = arr.length-1;
//            int SortedArray[] = new int[arr.length];
//            int count = 0;
//            //System.out.println(arr[n]);
//
//            for (int i = 0; i < arr.length -1; i++) {
//                if (arr[i] >= arr[pivot]){
//                    arr1[i] =arr[i];
//                }else{
//                    arr2[i] = arr[i];
//                    count++;
//                }
//            }
//            SortedArray[count] = arr[pivot];
//
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr1[i]+" first array");
//
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr2[i] +" second array");
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                SortedArray[i] = arr1[i];
//
//            }
//            for (int i = 0; i < arr.length; i++) {
//                SortedArray[i] = arr2[i];
//
//
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(SortedArray[i]);
//            }
//
//            }
//        }
//public  class Rough {
//        public static void main(String[] args) {
//            int num = 121;
//
//            if (isArmstrong(num)){
//                System.out.println("yes,  It is ArmStrong");
//            }else{
//                System.out.println("Not, It is Not ArmsStrong");
//            }
//        }
//        public static boolean isArmstrong(int x){
//            int sum = 0;
//            int original = x;
//            for (; x != 0; x = x/10){
//                int rem = x % 10;
//                sum += rem * rem * rem;
//            }
//            if (sum == original) {
//                return true;
//            }
//            return false;
//        }
//
//}
//public class Rough {
//        public static void main(String[] args) {
//            String s1 = "madam";
//            if (isPali(s1)){
//                System.out.println("yes");
//            }else{
//                System.out.println("Not");
//            }
//
//        }
//        public static boolean isPali(String s1){
//            String s2 = "";
//            for (int i = s1.length()-1; i >= 0 ; i--) {
//                char ch = s1.charAt(i);
//                s2 = s2+ch;
//            }
//            if (s2.equals(s1)){
//                return true;
//            }
//            return false;
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            int arr[] = {25 ,10 ,35 ,24 ,11};
//            int gratest = 0;
//            int secondGratest = 0;
//            for (int i = 0; i < arr.length; i++) {
//         if (arr[i] > gratest) {
//             gratest = arr[i];
//         }
//            }
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] > secondGratest && arr[i] != gratest){
//                    secondGratest = arr[i];
//                }
//
//            }
//            System.out.println(gratest);
//            System.out.println(secondGratest);
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            String s1 = "Hello World";
//            int voewls = 0;
//            int consononts = 0;
//
//            for (int i = 0; i <s1.length(); i++) {
//                char ch =s1.charAt(i);
//                if (ch == 'a'|| ch == 'e' || ch == 'i'|| ch == 'o' ||ch =='u'){
//                    voewls++;
//                }else{
//                    consononts++;
//
//                }
//
//            }
//            System.out.println(voewls);
//            System.out.println(consononts);
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            int num = 28;
//            if (isPerfect(num)){
//                System.out.println("yes");
//            }else{
//                System.out.println("No");
//            }
//        }
//        public static  boolean isPerfect(int x){
//            int total = 0;
//            for (int i = 1; i < x; i++) {
//                if (x % i == 0){
//                    total += i;
//
//                }
//
//            }
//            return x == total;
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            int fact = 1;
//            int num = 5;
//            for (int i = 1; i <= num; i++) {
//                fact *= i;
//            }
//            System.out.println(fact);
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            int num = 22;
//            int original = num;
//            int rev = 0;
//            for(; num != 0; num = num / 10){
//                int rem = num % 10;
//                rev = rev*10+rem;
//
//
//            }
//            if (rev == original){
//                System.out.println("Num is Palindrome");
//            }else{
//                System.out.println(" Num is Not Palindrome ");
//            }
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            int num = 58329;
//            int original = num;
//            int largest = 0;
//            int smallest = 0;
//            for(; num != 0; num = num / 10) {
//                int rem = num % 10;
//                if (rem > largest) {
//                    largest = rem;
//                }
//                smallest= original;
//                System.out.println(rem);
//                if (rem < smallest){
//                    smallest = rem;
//                }
//            }
//
//            System.out.println(original);
//            System.out.println("Largest: "+largest);
//            System.out.println("smallest: "+smallest);
//
//
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            int num = 578475793;
//            System.out.println(isGratest(num));
//            System.out.println(isSmallest(num));
//
//        }
//        public static int isGratest(int x){
//            int gratest = 0;
//            for (;x != 0; x = x/10){
//                int rem = x % 10;
//                if (rem > gratest){
//                    gratest = rem;
//                }
//            }
//            return gratest;
//        }
//        public static  int isSmallest(int x){
//            int smallest = x;
//            for(; x != 0; x= x/ 10){
//                int rem = x % 10;
//                if (rem < smallest){
//                    smallest = rem;
//                }
//            }
//            return smallest;
//        }
//
//}

//public class Rough {
//        public static void main(String[] args) {
//            int num = 57634;
//            System.out.println(isEven(num));
//            System.out.println(isOdd(num));
//
//        }public static int isEven(int x){
//            int isEvennum = 0;
//
//            for (; x != 0; x =x/10){
//                int rem =  x % 10;
//                if (rem % 2 == 0){
//                    isEvennum++;
//                }
//
//                }
//            return isEvennum;
//        }
//        public static int isOdd(int x){
//            int isOddnum = 0;
//
//            for (; x != 0; x =x/10){
//                int rem =  x % 10;
//                if (rem % 2 == 1){
//                    isOddnum++;
//                }
//
//            }
//            return isOddnum;
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//            int num = 56745;
//            System.out.println(isCount(num));
//
//        }public static int  isCount(int x) {
//               int count = 0;
//            for (; x != 0; x = x / 10) {
//                int rem = x % 10;
//                count++;
//
//            }
//            return count;
//        }
//}


//public class Rough {
//        public static void main(String[] args) {
//            int num = 144;
//            // System.out.println(isStrongNum(num)+" strong number");
//
//            if (isStrongNum(num) == true){
//                System.out.println("Krishnamurthy number");
//            }else {
//                System.out.println("Not Krishnamurthy number");
//            }
//
//        }public static  boolean isStrongNum(int x) {
//            int original = x;
//            int total = 0;
//            for (; x != 0;x = x/10 ) {
//                int rem = x % 10;
//                total +=factorial(rem);
//            }
//
//                if (total == original){
//                 return true;
//                 }else {
//                    return false;
//                }
//                  }
//        public static int factorial(int x){
//            int fact = 1;
//            for (int i = 1; i <= x; i++) {
//                fact *= i;
//            }
//            return fact;
//        }
//}
//public class Rough {
//        public static void main(String[] args) {
//           int num  = 1124;
//            System.out.println(spy(num));
//
//        }
//
//        public static boolean spy(int x) {
//            if (isAdd(x) == isMul(x)){
//                return true;
//            }else {
//                return false;
//            }
//        }
//
//        public static int isAdd(int x) {
//            int total = 0;
//            for (; x != 0; x = x / 10) {
//                int rem = x % 10;
//                total += rem;
//
//            }
//            return total;
//        }
//
//        public static int isMul(int x) {
//            int total = 1;
//            for (; x != 0; x = x / 10) {
//                int rem = x % 10;
//                total *= rem;
//
//            }
//            return total;
//        }
//    }
///// Neon
//public class Rough {
//    public static void main(String[] args) {
//        System.out.println(Neon(9));
//
//    }
//    public static boolean Neon(int x){
//        int original = x;
//        x= x *x;
//
//        int total = 0;
//        for (; x != 0; x = x/10){
//            int rem = x % 10;
//            total +=rem;
//
//        }
//
//  if (original==total){
//      return true;
//  }else {
//      return false;
//  }
//    }
//
//
//
//}
    /// my own Automorphic Number;
//public class Rough {
//    public static void main(String[] args) {
//
//        int num = 76;
//        if (isAutomorphic(num) == num){
//            System.out.println(num+" it is Automorphic");
//        }else {
//            System.out.println(num+" number is not Automorphic");
//        }
//
//    }
//
//    public static  int isAutomorphic(int x) {
//int original = x;
//int empty = 0;
//int rem = 0;
//        empty = x * x;
//        System.out.println(empty);
//        if (empty < 100){
//            rem  = x % 10;
//        }else if (empty < 1000){
//            rem = x % 10;
//        }else if (empty < 10000){
//            rem = x % 1000;
//        }else if (empty < 100000) {
//            rem = x % 10000;
//        }else if (empty < 1000000) {
//            rem = x % 100000;
//        }
//
//        return rem;
//    }
//
//}
/// Chat Gpt Automorphic
//public class Rough {
//    public static void main(String[] args) {
//        int num = 76;
//        if (isAutomorphic(num)) {
//            System.out.println(num + " is an Automorphic number");
//        } else {
//            System.out.println(num + " is not an Automorphic number");
//        }
//    }
//
//    public static boolean isAutomorphic(int x) {
//        int square = x * x;
//
//        // find power of 10 based on number of digits
//        int digits = 0;
//        int temp = x;
//        while (temp > 0) {
//            digits++;
//            temp /= 10;
//        }
//
//        int lastDigits = square % (int)Math.pow(10, digits);
//
//        return (lastDigits == x);
//    }
//}
///  Harshad Number (Niven)
//public class Rough {
//    public static void main(String[] args) {
//        System.out.println(isNivan(18));
//
//    }
//    public static boolean isNivan(int x){
//        int original = x;
//        int count = 0;
//        for (; x != 0; x = x/10){
//            int rem = x % 10;
//            count += rem;
//
//        }
//        if (original % count == 0){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//}
//public class Rough {
//    public static void main(String[] args) {
//        int num = 2025;
//        System.out.println(digit(num));
//        String str = String.valueOf(num);
//        System.out.println(str.length());
//        for (int i = 1; i <str.length()/2 ; i++) {
//            System.out.println(str);
//
//        }
//
//
//    }
//    public static int digit(int x){
//        int count = 0;
//        for (; x != 0; x = x/10){
//            int rem = x % 10;
//            count++;
//        }
//        if (count % 2 == 0){
//            System.out.println();
//        }
//        return count;
//    }
//}
///  TECH NUMBER
//public class Rough {
//    public static void main(String[] args) {
//        int num = 2025;
//        if (isTech(num)) {
//            System.out.println(num + " is a Tech Number");
//        } else {
//            System.out.println(num + " is NOT a Tech Number");
//        }
//    }
//
//    public static boolean isTech(int x) {
//        // Count number of digits
//        int count = 0, temp = x;
//        while (temp != 0) {
//            count++;
//            temp /= 10;
//        }
//
//        // Must have even number of digits
//        if (count % 2 != 0) {
//            return false;
//        }
//
//        // Find divider (like 10^(count/2))
//        int div = 1;
//        for (int i = 1; i <= count / 2; i++) {
//            div *= 10;
//        }
//
//        // Split number into two halves
//        int firstHalf = x / div;
//        int secondHalf = x % div;
//
//        // Check the condition (sum of halves)^2 = original
//        int sum = firstHalf + secondHalf;
//        return (sum * sum) == x;
//    }
//}
























//public class Rough {
//        public static void main(String[] args) {
////            int x = 5;
////            double y = 2.5;
////            double c = x + y;
////            System.out.println(c);
//            int x = 10/0;
//            System.out.println(x);
//        }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.show(5,6);
//
//    }
//    public static class Test{
//        void show (int a ,int b){}
//        void show (double a, double b){}
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        System.out.println(add(3,4));
//
//    }
//    public static int add(int a, int b){
//        return a + b;
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int num =16;
//        int num2 = 66;
//        int lcm = 0;
//        for (int i = 1; ; i++) {
//            if (i % num == 0 && i % num2 == 0){
//                System.out.println(i);
//                lcm = i;
//                break;
//            }
//
//        }
//        System.out.println(lcm);
//
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int num1 = 17;
//        int num2 = 19;
//        int c = 12%18;
//        System.out.println(c);
//
//        int gcd = findGCD(num1, num2);
//        System.out.println(gcd);
//        int lcm = (num1 * num2) / gcd;
//
//        System.out.println("LCM = " + lcm);
//    }
//
//    // Function to find GCD
//    public static int findGCD(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//       // System.out.println(Disarium(125));
//        int num = 135;
//        if (Disarium(num) == true){
//            System.out.println(num+" Is  Disarium Number");
//        }else{
//            System.out.println(num+" Is Not  Disarium Number");
//        }
//
//    }
//    public static boolean Disarium(int x){
//        int num = x;
//        int rev = 0;
//        int original = 0;
//        double math = 0;
//        int component = 1;
//
//        for (; x != 0; x = x/10){
//            int rem = x % 10;
//            rev = rev * 10 + rem;
//        }
//       // System.out.println(rev);
//
//        for (; rev != 0; rev = rev/10){
//         int rem = rev % 10;
//         math = Math.pow(rem,component);
//         original += math;
//         component++;
//
//        }
//    if (num == original){
//        return true;
//    }else {
//        return false;
//    }
//
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        System.out.println(a);
//        for (int i = 1; i <= 10 ; i=i+2) {
//            int next = a + b;
//            System.out.println(next);
//            a = b;
//            b = next;
//
//
//
//        }
//    }
//}
 /// Write a Java Program to check whether a number is Happy Number Or NOT
//public class Rough {
//     public static void main(String[] args) {
//         int ok = isHappy(97);
//         //System.out.println(isHappy(20));
//         if (ok == 1){
//             System.out.println("Happy Number ");
//         }else{
//             System.out.println("Not Happy Number");
//         }
//
//     }
//
//     //int x = 19
//     public static int isHappy(int x) {
//         int square = 0;
//         int temp = 0;
//         int sum = 0;
//
//
//         for (int i = 1 ; i <=10 ;i++) {
//         //  System.out.println(x+" hh");
//             for (; x != 0; x = x / 10) {
//                 //System.out.println(x);
//                 int rem = x % 10;
//                 square = rem * rem;
//                 sum += square;
//                 temp = sum;
//                 ;
//                 //System.out.println(sum);
//             }
//             sum = 0;
//
//
//             //System.out.println("yy "+sum);
//             if (temp == 1) {
//                 return temp;
//             }else{
//                // System.out.println("It is sum value go to up "+sum);
//             x = temp;
//                // System.out.println("ata sum kiti "+sum);
//                 //System.out.println("it is x value got to upper: "+x);
//             }
//
//
//
//     }
////         x = sum;
////         System.out.println(x);
//         return sum;
//     }
//
// }
///  Nivan Number;
//public class Rough {
//    public static void main(String[] args) {
//        int num = 22;
//
//        System.out.println(Nivan(num));
//
//    }
//    public static  boolean Nivan(int x){
//        int sum = 0;
//        int original = x;
//        for (; x != 0; x=x/10){
//            int rem = x % 10;
//            sum += rem;
//        }
//        if (original % sum == 0){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//}
/// Duck Number
//public class Rough {
//    public static void main(String[] args) {
//       int num = 0123;
//        if (isDuck(num) == true){
//            System.out.println("Duck Number");
//        }else{
//            System.out.println("Not Duck Number");
//        }
//    }
//    public static boolean isDuck(int x){
//        int rev = 0;
//        for (;x !=0; x= x/10){
//            int rem = x % 10;
//            if (rem == 0){
//                return true;
//            }
//           // rev = rev * 10 + rem;
//        }
//        return false;
//    }
//
//}
/// Kaprekar Number
///
//public class Rough {
//    public static void main(String[] args) {
//        if (isKaprekar(2025)){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
//
//    }
//    public static boolean isKaprekar(int x){
//        int count = 0,temp = x;
//        while (temp != 0){
//            count++;
//            temp /= 10;
//
//            if (count != 0){
//                return false;
//            }
//
//            int div = 1;
//            for (int i = 1; i <= count/2; i++) {
//                div *= 10;
//            }
//            int firstHalf = x/div;
//            int secondHalf = x % div;
//
//
//            int sum = firstHalf + secondHalf;
//            return (sum * sum) == x;
//        }
////        return true;
////    }
////}
//public class Rough {
//    public static void main(String[] args) {
//        int num = 2025;
//        if (isKaprekar(num)) {
//            System.out.println(num + " is Kaprekar Number");
//        } else {
//            System.out.println(num + " is NOT Kaprekar Number");
//        }
//    }
//
//    public static boolean isKaprekar(int x) {
//        if (x == 1) return true;    // 1 is Kaprekar
//
//        int sq = x * x;
//        int div = 1;
//
//        while (div <= sq) {
//            int left = sq / div;
//            int right = sq % div;
//
//            // both parts must be > 0
//            if (right > 0 && (left + right) == x) {
//                return true;
//            }
//
//            div *= 10;
//        }
//
//        return false;
//    }
//}
///  Leet code problem Leet Code Problem
//class Solution {
//    public int searchInsert(int[] nums, int target) {
//        int org = target;
//        for (int i = 0; i <= nums.length - 1; i++) {
//            if (nums[i] > target) {
//                nums[i] = target;
//                  break;
//            }else{
//                nums[nums.length] = target;
//            }
//        }
//        for (int i = 1; i <nums.length ; i++) {
//            if (nums[i] == target){
//                target = i;
//            }
//        }
//
//        return target;
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Solution s1 = new Solution();
//        int nums[] = new int[5];
//        nums[0] = 1;
//        nums[1] = 3;
//        nums[2] = 5;
//        nums[3] = 6;
//        //int nums[] = {1,3,5,6};
//        s1.searchInsert(nums,2);
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//
//        }
//        System.out.println(s1.searchInsert(nums,5));
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        System.out.println(isAsolute(-45)+" Its Absolute");
//
//    }
//    public static int isAsolute(int x){
//        return x = Math.abs(x);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        try {
//            int[] arr = {12, 34, 56, 45, 33, 21};
//            for (int i = arr.length ; i >= 0; i--) {
//                System.out.println(arr[i]);
//
//            }
//        } catch (Exception e) {
//            System.out.println("Error ala");
//        }
//    }
//}
/// ********** Smith Number  ***********

//public class Rough {
//    public static void main(String[] args) {
//      int num = 27;
//        System.out.println("Prime Numbers "+isPrime(16));
//
//        if (isSmith(num) == true){
//            System.out.println("Smith Number");
//        }else {
//            System.out.println("Not Smith Number");
//        }
//
//    }
//
/// number saglayt adhi kiti ne divide hoto te kadl
//    public static  boolean  isSmith(int x){
//        int num = x;
//        int main = x;
//        for (int i = 2; i < x; i++) {
//            if (x % i == 0){
//                x = i;
//                break;
//            }
//
//
//
//        }
//// number chy digit chi berij keli
//        int numberCount = 0;
//        for (;main != 0; main = main/10){
//            int rem = main % 10;
//            numberCount += rem;
//        }
//
//
//// tyache prime factor kadle
//        int primeFactor = num/x;
//       // System.out.println(primeFactor+" primeFactor");
//       // System.out.println(x+" x");
//
//
//        //sum of digit
//        int count = 0;
//for (; x !=0; x = x/10){
//    int rem = x % 10;
//    count += rem;
//}
//
////sum of another digit
//int count1 = 0;
//      for(; primeFactor  != 0 ; primeFactor = primeFactor/10){
//          int rem = primeFactor %10;
//          count1 += rem;
//      }
//         int sum = count + count1;
//        //System.out.println(sum+" sum");
//        //System.out.println(numberCount+" numbercount");
//
//
//// check the number is Smith or not
//
//        if (sum == numberCount)
//            return true;
//        else {
//            return false;
//        }
//
//
//    }
//    public static boolean isPrime(int x){
//        if (x <= 1){
//            return false;
//        }else {
//        for (int i = 2; i < x; i++) {
//            if (x % i == 0)
//                return false;
//        }
//        }
//        return true;
//    }
//}
//
//
//public class Rough {
//    public static void main(String[] args) {
//        String s = "Hello World  I am  a Java Developer";
//
//        String[] sentence = s.split("");
// s.toLowerCase();
//        //sort the words
//        java.util.Arrays.sort(sentence);
//
//        for (int i = 0; i < sentence.length; i++) {
//            System.out.print(sentence[i] + " ");
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//
//        String sentence = "hello World I am A Java Developer";
//
//
//        // Convert sentence into words
//        String[] words = sentence.toLowerCase().split(" ");
//
//        // Sort the words
//        java.util.Arrays.sort(words);
//
//        // Print sorted words using normal loop
//        for (int i = 0; i < words.length; i++) {
//            System.out.print(words[i]+" ");
//        }
//    }
//}
//public class ReverseSentence {
//    public static void main(String[] args) {
//
//        String sentence = "Java is a powerful language";
//
//        // Split into words
//        String[] words = sentence.split(" ");
//
//        System.out.println("Reversed sentence:");
//
//        // Print in reverse order
//        for (int i = words.length - 1; i >= 0; i--) {
//            System.out.print(words[i] + " ");
//        }
//    }
//}
///  my personal program to print a se
//public class Rough {
//    public static void main(String[] args) {
//        String s1 = "welcome hello world  i am a java developer";
//        String s2 = "";
//        for (int i = s1.length()-1; i >= 0 ; i--) {
//           char ch =  s1.charAt(i);
//           s2 += ch;
//        }
//        System.out.println(s2);
//    }
// }
//public class Rough {
//    public static void main(String[] args) {
//        String str = "tushar";
//        System.out.println(str.length());
//    }
//}

//public class Rough {
//
//    public static void main(String[] args) {
//        int c = 23;
//        int d = 67;
//int a = c + d;
//        System.out.println(a);
//
//    }
//}





//public class Rough {
//    public static void main(String[] args) {
//
//        try {
//
//
//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter A Amount: ");
//            int num = in.nextInt();
//
//
//            if (num <= 0) {
//                System.out.println("Invalid Amount");
//            } else if (num >= 1000) {
//                System.out.println("Amount is Grater Than 1000 is Not Valid " +
//                        " Payment Failed.....");
//            } else {
//                double pulse = 12.5;
//                double overall = pulse * num;
//
//                System.out.println("******** TOTAL AMOUNT " + num + " Rs *********");
//                System.out.println("******** YOU RECEIVED WATER  " + Math.round(overall) + " LITER *********");
//
//            }
//
//        } catch (Exception e) {
//            System.out.println("Please Re-Process");
//        } finally {
//            System.out.println(" ***** Thank You *****");
//        }
//
//
//    }
//}
//
///  Prime prime Number.
//public class Rough {
//    public static void main(String[] args) {
//        int x = 6;
//        if (isPrime(x) == true){
//            System.out.println("Prime Number");
//        }else{
//            System.out.println("Not Prime ");
//        }
//
//    }
//    public static boolean isPrime(int x){
//        if (x <= 1){
//            return  false;
//        }else {
//            for (int i = 2; i < x ; i++) {
//                if (x % i == 0){
//                    return false;
//                }
//
//            }
//        }
//        return true;
//    }
//
//}
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {12,32,43,13,9,55};
//
//
//
//        for (int i = 0; i <arr.length  ; i++) {
//            for (int j = i + 1; j < arr.length  ; j++) {
//                if (arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println(arr[j]);
//        }
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        int num = 121;
//        int original = num;
//        int rev = 0;
//
//        for (; num != 0; num = num / 10){
//            int rem = num % 10;
//            rev = rev * 10 + rem;
//        }
//        if (original == rev){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not Palindrome");
//        }
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>(25);
//        arrayList.add(23);arrayList.add(2);arrayList.add(55);arrayList.add(34);arrayList.add(11);arrayList.add(12);
//        System.out.println(arrayList);
//        System.out.println(arrayList.reversed());
//        System.out.println(arrayList.sort(););
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        System.out.println(isAdd(3,4));
//        isAdd1 isA = new isAdd1();
//
//    }
//    public static int isAdd(int a ,int b){
//        return a + b;
//    }
//    public static class isAdd1{
//        int a;
//        int b;
//        int c = a * b;
//    }
//
//}
//public class Rough {
//    public static void main(String[] args) {
//        try {
//            Scanner i = new Scanner(System.in);
//            System.out.println("Enter A Number: ");
//            int num = i.nextInt();
//            if (num <= 0) {
//                System.out.println("Please Enter Correct Number");
//            } else if (num % 2 == 0) {
//                System.out.println("Even Number");
//            } else {
//                System.out.println("odd Number");
//            }
//        } catch (Exception e) {
//            System.out.println("It is Exception");
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        System.out.println(args[0]);  // prints first argument
//    }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        int num1 = 15;
//        int num2 = 15;
//
//        if (num1 == num2){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }
//
//Integer num3 = 15;
//        Integer nu4 = 15;
//        if (num3.equals(nu4)){
//            System.out.println("true");
//        }else {
//            System.out.println("False");
//        }
//    }
//}
///  University Program JAVA (inExam 2025 - Tushar Chnadrkant Joshi)
//public  class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("please enter a array size: ");
//        int num = input.nextInt();
//
//        int arr[] = new int[num];
//
//        for (int i = 0; i < num; i++) {
//            System.out.println("enter a "+ i+" value");
//            int value = input.nextInt();
//            arr[i] = value;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        String s1 = "world";
//
//        int vowels = 0;
//        int cons = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            char ch = s1.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                vowels++;
//            }else {
//                cons++;
//            }
//        }
//        System.out.println(vowels);
//        System.out.println(cons);
//    }
//
//public class Rough {
//    public static void main(String[] args) {
//        int  ch = '$' + 1;
//        System.out.println(ch);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        for(int i = 1; i <= 3; i++) {
//            for(int j = 1; j <= 2; j++) {
//                System.out.print("*");
//            }
//        }
//    }
//}
/// is the program to find odd even numbers as multiple type
/// 1) using dividedrtion
/// 2) using module
/// 3) using bit manipulation
//public class Rough {
//    public static void main(String[] args) {
//        Scanner i = new Scanner(System.in);
//        System.out.println("Please Enter a number: ");
//        int n = i.nextInt();
//
//        if ((n / 2) * 2 == n) {
//            System.out.println("Even Number");
//        }else{
//            System.out.println("Odd Number");
//        }
//
//        if (n % 2 == 0){
//            System.out.println("Even Number");
//        }else{
//            System.out.println("Odd Number");
//        }
//        if ((n & 1) == 0){
//            System.out.println("Even Number");
//        }else {
//            System.out.println("Odd Number");
//        }
//
//
//    }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,6,7,8,9,10};
//        int[] arr1 = new int[2];
//        int count = 0;
//        int temp = 0;
//        /// System.out.println(isPrime(2));
//
//        for (int i = 0; i < arr.length; i++) {
//            if (isPrime(arr[i]) == true){
//               // System.out.println(arr[i]);
//                //count++;
//                temp = arr[i];
//
//            }
//
//           // System.out.println(temp);
//            for (int j = 0; j < arr1.length; j++) {
//                arr1[j] = temp;
//                System.out.println(arr1[j]);
//            }
//
//
//        }
////        for (int i = 0; i < arr1.length; i++) {
////            System.out.println(arr1[i]);
////        }
//
//
//
//    }
//    public static boolean isPrime(int x){
//
//        if (x <= 1){
//            return false;
//        }else {
//            for (int i = 2; i < x ; i++) {
//                if (x % i == 0){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}

///  50 program practice to build logic
///  1) Reverse number
//public class Rough {
//    public static void main(String[] args) {
//        int num = 793;
//        int rev = 0;
//        for (; num != 0; num = num/ 10){
//            int rem = num % 10;
//            rev = rev * 10 + rem;
//        }
//        System.out.println(rev);
//    }
//}
/// 2) check Palindrome Number
//public class Rough {
//    public static void main(String[] args) {
//        int num = 121;
//        int original = num;
//        int rev = 0;
//        for (; num != 0; num = num/ 10){
//            int rem = num % 10;
//            rev = rev * 10 + rem;
//        }
//        System.out.println(rev);
//        if (original == rev){
//            System.out.println("Palindrome Number");
//        }else{
//            System.out.println("Not Palindrome");
//        }
//    }
//}
/// 3)Prime Number
//public class Rough {
//    public static void main(String[] args) {
//        int num = 6;
//
//        if (isPrime(num) == true){
//            System.out.println("Prime Number");
//        }else{
//            System.out.println("Not Prime");
//        }
//    }
//
//    public static boolean isPrime(int x) {
//        if (x <= 0) {
//            return false;
//        } else {
//            for (int i = 2; i < x; i++) {
//                if (x % i == 0) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//}
/// 4) Prime Number find between 1 to 100
//public class Rough {
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 1; i <= 100 ; i++) {
//            if (isPrime(i) == true){
//                count++;
//                System.out.println(i);
//            }
//        }
//        System.out.println(count+" Overall Prime Numbers");
//    }
//    public static boolean isPrime(int x) {
//        if (x <= 1) {
//            return false;
//        } else {
//            for (int i = 2; i < x; i++) {
//                if (x % i == 0) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}
///  5) Check Armstrong Number
//public class Rough {
//    public static void main(String[] args) {
//        if (isArm(153) == true){
//            System.out.println("Armstrong Number");
//        }else{
//            System.out.println("Not Armstrong");
//        }
//
//    }
//    public static boolean isArm(int x){
//        int square = 0;
//        int original = x;
//        for (; x != 0; x = x/10){
//            int rem = x % 10;
//            square += rem * rem * rem;
//        }
//        if (square == original){
//            return true;
//        }else {
//            return false;
//        }
//    }
//}
/// 6)Print Armstrong numbers between 1 and 500
//
//public  class Rough {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 500 ; i++) {
//            if (isArm(i) == true){
//                System.out.println(i+" Armstrong Number");
//            }
//
//        }
//    }
//    public static boolean isArm(int x){
//        int square = 0;
//        int original = x;
//        for (; x != 0; x = x/10){
//            int rem = x % 10;
//            square += rem * rem * rem;
//        }
//        if (square == original){
//            return true;
//        }else {
//            return false;
//        }
//    }
//}
///  7)find a factorial of a number
//public class Rough {
//    public static void main(String[] args) {
//        int temp = 1;
//        int num = 5;
//        for (int i = 1; i <= num; i++) {
//            temp *= i;
//        }
//        System.out.println(temp);
//    }
//}
///   8. Fibonacci series using loop
//public class Rough {
//    public static void main(String[] args) {
//        int num = 10;
//        int a = 0;
//        int b = 1;
//        for (int i = 1; i <= num; i++) {
//            int temp = a + b;
//            System.out.println(a);
//            a = b;
//            b = temp;
//
//
//        }
//    }
//}
/// 10. Find sum of digits of a number = done
/// 11. Count number of digits in a number = done
//public class Rough {
//    public static void main(String[] args) {
//        int number = 1234;
//        int count = 0;
//        int numCount = 0;
//        for (; number != 0; number = number / 10){
//            int rem = number % 10;
//            numCount++;
//            count += rem;
//        }
//        System.out.println(count);
//        System.out.println(numCount);
//    }
//}
/// Find largest of three numbers
//public class Rough {
//    public static void main(String[] args) {
//int num1 = 5;
//int num2 = 6;
//int num3 = 7;
//if (num1 > num2 && num1 > num3){
//    System.out.println(num1);
//} else if (num2 > num3 && num2 > num1) {
//    System.out.println(num2);
//}else {
//    System.out.println(num3);
//}
//
//int max = Math.max(num1,Math.max(num2,num3));
//        System.out.println(max);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("How Many number you will compare : ");
//        int num = input.nextInt();
//        int temp = 0;
//        for (int i = 1; i <= num ; i++) {
//            System.out.println("Print "+ i + " Number");
//            int numbers = input.nextInt();
//             if (temp < numbers){
//              temp  =   numbers;
//             }
//
//        }
//        System.out.println("Gratest Number "+ temp);
//    }
//}
///13. Swap two numbers without using third variable = all ok oll good all done
/// 14. Check even or odd number
//public class Rough {
//    public static void main(String[] args) {
//        int n1 = 12;
//        int n2 = 25;
//        n1 = n1 + n2;
//        n2 = n1 -n2;
//        n1 = n1 - n2;
//        System.out.println(n1);
//        System.out.println(n2);
//
//        int num = 21;
//        if (num % 2 == 0){
//            System.out.println("Even Number");
//        }else {
//            System.out.println("Odd Number");
//        }
//    }
//}
/// 16 Leap Year
//public class Rough {
//    public static void main(String[] args) {
//        int year = 2020;
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//            System.out.println("Leap Year");
//        }else {
//            System.out.println("Not Leap Year");
//        }
//    }
//}
///  17) print the string reverse also palindrome
//public class Rough {
//    public static void main(String[] args) {
//        String s1 = "madam";
//        String s2 ="";
//s1= s1.toLowerCase()
//;        for (int i = s1.length() -1 ; i >= 0 ; i--) {
//            char ch = s1.charAt(i);
//            s2 = s2 + ch;
//
//        }
//        System.out.println(s2);
//if (s1.equals(s2)){
//    System.out.println("Palindrome");
//}else{
//    System.out.println("Not Palindrome");
//}
//    }
//}
///  50 linked list
//public class Rough {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(10);
//
//
//        list.add(19);
//        list.add(145);
//        list.add(5);
//        list.add(1);
//        list.add(22);
//        list.add(33);
//        list.add(22);
//        list.add(85);
//        list.add(112);
//        System.out.println(list.reversed());
//        System.out.println(list.lastIndexOf(list));
//
//
//    }
//}
/// element is found in the array is yes or not
//public class Rough {
//    public static void main(String[] args) {
//        int arr[] ={12,34,53,22,15,56};
//        int target = 2;
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i] == target){
//                System.out.println(target+" found in array at index "+i);
//            }
//        }
//    }
//}
/// count even and odd element in the array sum of array in the elemnt
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr ={12,33,21,45,33,2,9};
//        int even = 0;
//        int odd =0;
//        int sum = 0;
//
//        for (int i = 0; i <arr.length ; i++) {
//            sum += arr[i];
//            if (arr[i] % 2 == 0){
//                even++;
//            }else {
//                odd++;
//            }
//        }
//        System.out.println("Even elemnts in the array "+even);
//        System.out.println("Odd Elements in the array "+odd);
//        System.out.println("Sum of Array Element: "+sum);
//    }
//}
/// 26. Find largest element in an array
/// 27. Find smallest element in an array
/// 28. Sort an array (without inbuilt sort)
/// 29. Find second largest element in an array
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {12,84,21,97,45,9,17};
//        int largest = 0;
//        int smallest = arr[0];
//        int secondLargest = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            if (largest < arr[i]){
//                largest = arr[i];
//            }
//        }
//        System.out.println("Largest Number in the array "+largest);
//        for (int i = 0; i < arr.length; i++) {
//            if (secondLargest < arr[i]  && arr[i] != largest){
//                secondLargest=arr[i];
//            }}
//        System.out.println("Second Largest Element In the array: "+secondLargest);
//        for (int i = 1; i < arr.length; i++) {
//            if (smallest > arr[i]){
//                smallest = arr[i];
//            }
//            System.out.println("Smallest element in the array :"+ smallest);
//
//        }
//    }
//}
/// pyramid
//public class Rough {
//    public static void main(String[] args) {
//
//        int rows = 6;
//
//        for (int i = 1; i < rows ; i++) {
//            for (int j = 1; j < rows - i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j < i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//    }
//}
/// reverse Sentences Or Sentences word
//public class Rough {
//    public static void main(String[] args) {
//
//        String s1 = "Hello World good Morning";
//        String[] s2 = s1.split(" ");
//        for (int i = s2.length - 1; i >= 0 ; i--) {
//            System.out.print(s2[i]+" ");
//        }
//
//        String s3 = "";
//        for (int i = s1.length() - 1; i >= 0; i--) {
//            s3 = s3 + s1.charAt(i);
//
//        }
//        System.out.println(s3);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//
//        int[] arr = {12,0,11,34,0,55};
//        int s = arr.length - 1;

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}


/// angram String means the name are meaning are different but length are same and letters are same
/// ex - listen & silent  both are different name with different meaning but still letters are same or length or same so
/// it angram ...



//public class Rough {
//    public static void main(String[] args) {
//        int num1 = 24;
//        int num2 = 36;
//        int hcf = 0;
//
//        int lcm = 0;
//
//        for (int i = 1; ; i++) {
//          if (i % num1 == 0 && i % num2 == 0){
//              lcm = i;
//              break;
//          }
//        }
//        System.out.println(lcm);
//
//
//
//    }
////}
///  gcd == hcf
//public class Rough {
//    public static void main(String[] args) {
//
//        int num1 = 60;
//        int num2 = 90;
//
//        int hcf = 1;
//
//        for (int i = 1; i <= num1 && i <= num2; i++) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                hcf = i;
//
//            }
//        }
//
//        int lcm = (num1 * num2) / hcf;
//
//        System.out.println("HCF = " + hcf);
//        System.out.println("LCM = " + lcm);
//    }
//}


//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int num = 7;
//        if ((num / 2) * 2 == num) {
//            System.out.println("Even, The given number is Even");
//        } else {
//            System.out.println("Odd, The given number is Odd");
//        }
//
//        if ((num & 1) == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//    }
//}
//
//        if ((num & 1) == 0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }
//
//    }
//}
/// MultiThreading Program 2 thread (Creating 2 class execute differ between 10 sec)
//
//    class GoodMorning extends Thread{
//    @Override
//    public void run() {
//        System.out.println("Good Morning");
//    }
//}
//
//class GoodNight extends Thread{
//    @Override
//    public void run() {
//        System.out.println("Good Night");
//    }
//}
//
//
//public class Rough {
//    public static void main(String[] args) throws InterruptedException {
//        GoodMorning goodMorning = new GoodMorning();
//        goodMorning.run();
//        Thread.sleep(2000);
//GoodNight goodNight = new GoodNight();
//goodNight.run();
//
//int num1 = 12;
//int num2 = 15;
//
//// Ternary Operator
// int greatestNumber = num1 > num2 ? num1 : num2;
//        System.out.println(greatestNumber);
//
//
//    }
//}
/// /
////public class Rough {
////    public static void main(String[] args) {
//        int num = 12333219;
//        int original = num;
//int reversed = 0;
//        for (;num != 0; num = num /10) {
//            int rem = num % 10;
//            reversed = reversed * 10   +  rem;
//        }
//        System.out.println(reversed);
//        if (original == reversed){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Not Palindrome");
//
//        }
//        int[] arr = {1,2,3,4,5};
//        for (int i = arr.length -1; i >= 0 ; i--) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//        int star = 5;
//        for (int i = 1; i <= star ; i++) {
//            for (int j = 1; j <= star ; j++) {
//                if (i == 1 || i == 5 || j == 1 || j == 5){
//                    System.out.print(" * ");
//                }else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println( );
//        }
//
//
//        System.out.println();
//        for (int i = 1; i <= star ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println( );
//        }
//        System.out.println();
//        for (int i = 1; i <= star; i++) {
//            for (int j = 1; j <= star - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//        System.out.println();
//        for (int i = star; i >= 1 ; i--) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 1; i <= star ; i++) {
//            for (int j = 1; j <= star - i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//
//        }
//        System.out.println();
//
//        String s1 = "good";
//        String s2 = "";
//
//
//        String line = "good morning all of you";
//
//// split sentence into words
//        String[] words = line.split(" ");
//
//// print words in reverse order
//        for (int i = words.length - 1; i >= 0; i--) {
//            System.out.print(words[i] + " ");
//        }
//
//        for (int i = s1.length()-1; i >= 0; i--) {
//            s2 = s2+ s1.charAt(i);
//        }
//        System.out.println();
//        System.out.println(s2);
//
//        System.out.println();
//                String f1 = "";
//        for (int i = line.length()-1; i >=0; i--){
//         f1 = f1+line.charAt(i);
//        }
//        System.out.println(f1);
//        System.out.println();
//
//
//        int[] arr1 = {12,54,67,9,45};
//        int large = 0;
//        int small = arr1[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (large < arr1[i]){
//                large = arr1[i];
//            }
//        }
//        System.out.println(large+" Large");
//        for (int i = 0; i < arr1.length; i++) {
//            if (small > arr1[i]){
//                small = arr1[i];
//            }
//        }
//        System.out.println("small "+small);
//        System.out.println();
//        int n=1;
//        String s5 ="welcome";
//        String m1 ="welcome";
//        int m=1;
//        if (n == m){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }
//        System.out.println();
//        System.out.println();
//        if (s5.equals(m1)){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }
//    }
//
//}
//public class Rough {
//    public static void main(String[] args) {
//
//        int hcf = 0;
//       int myNumber= 0;// just for TimePass
//
//
//        int num1 = 12;
//        int num2 = 18;
//
//        for (int i = 1; i < num1 && i < num2 ; i++) {
//            if (num1 % i == 0 && num2 % i == 0){
//                hcf= i;
//            }
//
//        }
//        System.out.println(hcf);
//
//        int lcm = (num1 * num2)/hcf;
//        System.out.println(lcm);





        ///  ArmStrong Number
//        int num = 153;
//        int sum = 0;
//        int original = num;
//        //for(; num != 0; num = num/10){
//        while (num != 0){
//            int rem = num % 10;
//            sum += rem * rem * rem;
//            num = num/10;
//        }
//        if (sum == original){
//            System.out.println("Armstrong Number");
//        }else{
//            System.out.println("Not Armstrong");
//        }
//
//        String s1 ="woOUIOOld";
//
//        int vowels = 0;
//        int consonants = 0;
//
//        for (int i = 0; i <s1.length() ; i++) {
//            char ch = s1.toLowerCase().charAt(i);
//            if (ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
// //               System.out.println("ty");
//                vowels++;
//            } else {
////                System.out.println("jfn");
//                consonants++;
//            }
//
//        }
//        System.out.println(vowels);
//        System.out.println(consonants);
////
//


//
//
//
//int s = 0;
//
//        for (int i = 0; i < 5; i++) {
//            s += i;
//        }
//
//
//        System.out.println();
//        System.out.println();
//        int arra[] = new int[10];
//        arra[9] = 69;
//        int array[] = {12,23,4,95,66,75};
//
//
//        int smallest = array[0];
//        int largest = 0;
//
//
//        for (int i = 0; i < array.length; i++) {
//            if (largest < array[i]){
//                largest = array[i];
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (smallest > array[i]){
//                smallest = array[i];
//            }
//        }
//        System.out.println(largest);
//        System.out.println(smallest);
//     ///
//        ///
//           ///
//        System.out.println();
//        System.out.println();
//
//        for (int i = array.length-1; i >= 0 ; i--) {
//            System.out.println(array[i]);
//        }
//
//
//        System.out.println();
//
//
//
//
//
//
//        String string[] = {"Hello" , "Good" , "kaka" , "sum"};
//        for (int i = 0; i < string.length; i++) {
//            System.out.print(string[i]+" ");
//        }
//        /// fact String print kel tar tyacha ip address print hoto
//
//
//
//
//
//
//
//
//
//        System.out.println();
//        System.out.println();
//
//
//
//                String s3 = "Hello World I am java developer";
//                String[] words = s3.split(" ");
//                String s5 = "";
//                String s6 = " ";
//
//                for (int i = s3.length() -1 ; i >= 0  ; i--) {
//            s6 = s6+s3.charAt(i);
//        }
//        System.out.println(s6);
//
//        for (int i = words.length - 1; i >= 0; i--) {
//                    s5 = s5 + words[i] +" ";
//                }
//
//                System.out.println(s5);


//
//        String s3 = "Hello World I am  java developer";
//        String words[] = s3.split(" ");
//        String s5 =" ";
//
//        for (int i = s3.length()-1; i >=0 ; i--) {
//            s5 = s5+s5.charAt(i);
//        }
//        System.out.println(s5);

















//
//String s1 = "madamkmk";
//String s2 = "";
//
//        for (int i = s1.length()-1; i >= 0 ; i--){
//            s2 = s2+s1.charAt(i);
//
//        }
//        System.out.println(s2);
//        if (s1.equals(s2)){
//            System.out.println("palindrome String ");
//        }else {
//            System.out.println("Not palindrome ");
//        }
//
//





//final class tr{
//
//
//}



//        for (int i = 1; i <=4; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println( );
//       }



//        int[][] arr ={{2,3},{4,5}};
//        System.out.println(arr); // not print array it print array refrence
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

//int star = 5;
//        for (int i = 1; i <= star ; i++) {
//            for (int j = 1; j <= star -i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int i = star; i >= 1 ; i--) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println( );
//        }


//        System.out.println("***** OutPut Start *****");
//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(0, "Java");
//        map.put(2, "Python");
//        map.put(3,"C++");
//        map.put(1, "Spring Boot"); // overrides
//
//        System.out.println(map);
//
//        System.out.println( );
//
//        Set<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(20);
//        set.add(10); // ignored
//        System.out.println(set); // random order
//
//        System.out.println();
//
//
//
//        int num1 = 18;
//        int num2 = 27;
//
//
//        int hcf = 1;
//
//        for (int i = 1; i <= num1 && i <= num2; i++) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                hcf = i;
//
//            }
//
//        }
//        System.out.println(hcf);
//        int lcm = (num1 * num2) / hcf;
//        System.out.println(lcm);
//
//
//int tem = 0;
//        for (int i = 1;   ; i++) {
//            if (i % num1 == 0 && i % num2 == 0) {
//                tem = i;
//                break;
//            }
//        }
//
//        System.out.println(tem);
//
//
//        System.out.println( );
//
//
///// HCF
//        /// HCF
//
//
//        /// HCF using My method
//        int tem1 = 0;
//        int add = num1 + num2;
//        for (int i = 2;  i <= add; i++) {
//            if (num1 % i == 0 && num2 % i == 0){
//                tem1 = i;
//
//            }
//        }
//
//        System.out.println(tem1);
//
//        char myLetter = 'B';
//        System.out.println(myLetter);
//
//        long fact = 1;
//int myNum = 5;
//        for (int i = 1; i <= myNum ; i++) {
//            fact *= i;
//        }
//
//        System.out.println(fact);
//
//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= 5 - i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*   ");
//
//            }
//            System.out.println();
//        }

//
//
//        int num = 121;
//        int original = num;
//        int rev = 0;
//
//        for (; num != 0; num = num/10){
//            int rem = num % 10;
//             rev = rev * 10 + rem;
//        }
//        System.out.println(rev+" Reverse");
//if (rev == original){
//    System.out.println("Palindrome");
//}else{
//    System.out.println("Not palindrome");
//}
//    }
//}





//public class Rough {
//    public static void main(String[] args) {
//        Scanner i = new Scanner(System.in);
//
//
//        for (int j = 1; j <= 0 ; j++) {
//
//
//        System.out.println("Print First Num : ");
//        int num = i.nextInt();
//
//
//        System.out.println("Print Second Num : ");
//        int num1 = i.nextInt();
//
//
//        System.out.println("Print a Operator (+ , - , * , / , %)");
//        char op = i.next().charAt(0);
//
//try {
//    int result = 0;
//    switch (op) {
//        case '+':
//            result = num + num1;
//            break;
//        case '-':
//            result = num - num1;
//            break;
//        case '*':
//            result = num * num1;
//            break;
//        case '/':
//            result = num / num1;
//            break;
//        case '%':
//            result = num % num1;
//            break;
//    }
//
//    System.out.println(result);
//
//} catch (Exception e) {
//    System.out.println("Wrong Syntax");
//
//
//}}
//
//    User user = new User();
//        user.setName("Onkar");
//        user.setId(12);
//        System.out.println(user.getId());
//        System.out.println(user.getName());
//
//
//    }}
//
//
//class User{
//    private String name;
//    private int id;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}


//public class Rough {
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//int target = 5;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i +1 ; j < arr.length - 1; j++) {
// if (arr[i]  + arr[j] == target){
//     System.out.println(arr[i] +" "+ arr[j]);
//
// }
//
//            }
//
//        }
//    }
//}




//public class Rough {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 2,7,8,5,89,0};
//        int temp = 0;
//        for (int i = 0; i < arr.length -1; i++) {
//            for (int j = i + 1; j < arr.length ; j++) {
//                if (arr[i] == arr[j]){
//                    temp = arr[j];
//                }
//            }
//
//        }
//        System.out.println(temp);
//    }
//}



///  Simple Interest
//public class Main {
//    //public static void main(String[] args) {
//
//        System.out.println("Simple Interest  calculator");
//
//        int amount = 8000;
//        float per = 7.5F;
//        int years = 2;
//        System.out.println(" simple Interest is : "+(amount * per * years)/100);
//    }
////}














//
//public class Rough {
//    public static void main(String[] args) {
//        String s1 = "hello world i am a java developer";
//        String[] s2 = s1.split("");
//
//        for (int i = s2.length-1; i >= 0; i--) {
//            System.out.print(s2[i]+"");
//
//        }
//    }
//}






//public class Rough {
//     public static void main(String[] args) {
//         int num1 = 25,num2 = 55;
//         System.out.println("Numbers Before Swapping "+num1 +" and "+num2);
//
////         int num3 = num1;
////         num1 = num2;
////         num2 = num3;
//         num1 = num1 + num2;
//         num2 = num1 - num2;
//         num1 = num2 - num1;
//         System.out.println("Numbers after Swapping "+num1 +" and "+num2);
//
//     }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        int vowels  = 0;
//        int consonants = 0;
//        String s1 = "HelloStudentsGoodMorningFromMySide";
//
//        for (int i = 0; i <s1.length() ; i++) {
//            char ch = s1.charAt(i);
//            if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch  == 'u'){
//                vowels++;
//            }else{
//                consonants++;
//            }
//        }
//        System.out.println("Vowels "+vowels);
//        System.out.println("Consonants "+consonants);
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        int  c = 5;
//        if (c == c){
//            System.out.println(c);
//        }
//    }
//}

//public  class Rough {
//    public static void main(String[] args) {
//        int count = 0;
//        int[] arr ={12,34,21,33,21,45,88};
//        for (int i = 0; i < arr.length; i++) {
//            count += arr[i];
//        }
//        System.out.println("Sum Of All Integers IN the Array: "+count);
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.id = 12;
//        s.name = "onkar";
//        s.address = "pune";
//        System.out.println(s);
//
//
//    }
//    public  static class Student{
//        private String name;
//        private int id;
//        private String address;
//
//        public String getAddress() {
//            return address;
//        }
//
//        public void setAddress(String address) {
//            this.address = address;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//Scanner input = new Scanner(System.in);
//        int[] login = new int[100];
//        login[1] = 24;
//        login[4] = 24;
//        login[7] = 24;
//        login[6] = 24;
//        login[9] = 24;
//        login[14] = 24;
//        login[10] = 24;
//
//        System.out.println("Press 1 for LogIn & Press 2 For SignUp");
//        int num = input.nextInt();
//      if ( num > 2 || num  < 1){
//          System.out.println("Sorry Wrong Number");
//      }else if (num == 1){
//          System.out.println("Login");
//          System.out.println("Please enter a number: ");
//          int n = input.nextInt();
//          for (int i = 0; i < login.length; i++) {
//              login[i] = n;
//          }
//
//      }else {
//          System.out.println("Signup");
//          System.out.println("Please enter a number: ");
//          int n1 = input.nextInt();
//          for (int i = 0; i <login.length; i++) {
//              if (login[i] == n1){
//                  System.out.println("Number is already define please enter another number");
//                  break;
//              }else {
//                  login[45] = n1;
//              }
//          }
//      }
//
//
//
//    }
//}

//
//public class Rough{
//    public static void main(String[] args) {
//        int num1 = 24;
//        int num2 = 55;
//
//        swap(num1,num2);
//
//    }
//    public static int swap(int x, int y){
//        int c = x;
//        x = y;
//        y = c;
//        System.out.println(x);
//        System.out.println(y);
//       return 0;
//
//    }
//}
//public  final class Rough {
//    public static void main(String[] args) {
//
//        /// print the array numbers are prime or not
//        int[] arr = {12,45,32,19,66,57,11};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(isPrime(arr[i]));
//        }
//
//
//    }
//    public static boolean isPrime
//            ( int
//                      x){
//        if (x < 2){
//            return true;
//        }else
//        {
//            for (int i = 2; i < x ; i++) {
//                if (x % i == 0){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}

///
//public  class Rough {
//    public static void main(String[] args) {
//        double d = 6.6;
//        float f = 5.5f;
//        System.out.println(d);
//        System.out.println(f);
//        char c = 'h';
//        byte marks = 6;
//        int num = 0b101;
//        System.out.println("Num " +num);
//    }
//}

///

//public class Rough {
//    public static void main(String[] args) {
//        String s1 = "hello World I am a Java developer";
//        String s2 = "";
//
//        String s3 ="";
//        String[] word = s1.split(" ");
//        for (int i = word.length-1; i >= 0 ; i--) {
//            s2= s2 + word[i] + " ";
//        }
//        System.out.println(s2);
//
//        System.out.println();
//        for (int i = s1.length()-1; i >= 0 ; i--) {
//            s3= s3 + s1.charAt(i);
//        }
//        System.out.println(s3);
//        System.out.println();
//        int vowels = 0;
//int consonants  = 0;
//        for (int i = 0; i <s1.length() ; i++) {
//            char ch = s1.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' ||ch == 'u'){
//                vowels++;
//            }else {
//                consonants++;
//            }
//        }
//        System.out.println(vowels);
//        System.out.println(consonants);
//    }
//}
//

///  bubble sort
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {5,2,3,1,4};
//
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n- 1 ; j++) {
//                if (arr[j] > arr[j+1] ){
//                    int tem = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tem;
//                }
//
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}


/// Armstrong,Palindrome,reverse
//public class Rough {
//    public static void main(String[] args) {
//        int num = 151;
//        int original = num;
//        int count = 0;
//int rev = 0;
//
//        for (; num !=0; num = num/10){
//            int rem = num % 10;
//            rev = rev * 10 + rem;
//            count += rem * rem * rem;
//        }
//        if (count == original){
//            System.out.println("Armstrong");
//        }else{
//            System.out.println("Not");
//
//        }
//        System.out.println(rev);
//        if (rev == original){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not Palindrome");
//        }
//    }
//}
/// Ternary Operator
//public class Rough {
//    public static void main(String[] args) {
//        int num1 = 10_000_0_0_000;

////        double num = 1;
////        System.out.println(num);
////        double x = (int) 4;
//         int num = 8;
//         int result = 0;
//         ///  Ternary Operator
//      result = 4 % 2 == 0 ? 4 : 50;
///  jar 4 % 2 == 0 if the condition is true then print 4 otherwise print 50(The rule of ternary operator)
//        System.out.println(result);
//
//
//
//
//
//
//
//    }
//}
/// Calculator using switch case
//
//public class Rough {
//    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//         int result = 0;
//
//        System.out.println("Enter num1: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter num2: ");
//        int num2 = in.nextInt();
//
//        System.out.println("Enter a operand (+ , - , * , /)");
//        char ch = in.next().charAt(0);
//
//
//switch (ch){
//    case '+':
//        result = num2 + num1;
//        break;
//    case '-':
//        result = num1 - num2;
//        break;
//    case '*':
//        result = num1 * num2;
//        break;
//    case'/':
//        if (num2 != 0)
//           result = num1/num2;
//        else
//            System.out.println("Cannot divide by zero");
//        break;
//}
//
//
//        System.out.println(result);
//
//
//    }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        Car car = new Car();
//        isCar()
//
//
//    }
//    public static boolean isCar(){
//        return true;
//    }
//
//}
//class Car{
//    private int carno;
//}
//class car{
//    private int carNo;
//    private String carName;
//    enum CarType {
//        DIESEL, PETROL, HYBRID
//    }
//
//    public String getCarName() {
//        return carName;
//    }
//
//    public void setCarName(String carName) {
//        this.carName = carName;
//    }
//
//    public int getCarNo(int i) {
//        return carNo;
//    }
//
//    public void setCarNo(int carNo) {
//        this.carNo = carNo;
//    }
//}
//public class Rough
//{
//    public static void main(String[] args) {
//
//        car c = new car();
//        c.setCarName("Nexon");
//        c.getCarNo(12);
//        System.out.println(c.getCarName());
//        System.out.println(c.getCarNo(12));
//    }
//}

/// Calculator Using IF-ELSE

//public class Rough {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter A First Number: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter A Second Number: ");
//        int num2 = in.nextInt();
//int result= 0;
//        System.out.println("Enter a Operands: (+ , - , * , /)");
//        char ch = in.next().charAt(0);
//
//        if (ch == '+'){
//            result = num1 + num2;
//        } else if (ch =='-') {
//            result = num1 - num2;
//        } else if (ch == '*') {
//            result = num1 * num2;
//        } else if (ch == '/') {
//            if (num2 == 0) {
//                System.out.println("Number of divide by 0 no");
//            }else {
//                result=num1/num2;
//            }
//        }else {
//            System.out.println("You Print Wrong Operand");
//        }
//        System.out.println(result);
//    }
//}


/// program TO Object creation

//
//public class Rough {
//    public static void main(String[] args) {
//        Addition addition = new Addition();
//        addition.animal();
//    }
//}
//class Addition{
//
//    void animal(){
//        System.out.println("Krushna Is Intelligent Guy");
//    }
//}


///  without creating an object use static
//public  class Rough {
//    public static void main(String[] args) {
//      int store =  isadd(56,78);
//        System.out.println(store);
//    }
//    public static int isadd(int x, int y){
//        int result = x + y;
//        return result;
//    }
//
//}

/// Additon while creating an object
//public class Rough {
//    public static void main(String[] args) {
//        Addition addition = new Addition();
//        System.out.println(addition.isAdd(23,56));
//    }
//}
//class Addition{
//    public int isAdd(int x, int y){
//        int result = x + y;
//       return result;
//    }
/// 2D Array
//public
// class Rough {
//    public static void main(String[] args) {
//
      /// 3 columns and 8 will be rows
//        int array[][] = new int[3][8];
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
///}




/// add Value to A Class
/// Important topics as OOPS Point  of view
//public class Rough {
//    public static void main(String[] args) {
//carDetails car = new carDetails();
//
//// Set values
//        car.setCarId(101);
//        car.setCarName("Swift");
//        car.setOwnerName("Onkar");
//        car.setVehicleType("Petrol");
//        car.setCarAmount(780000);
//
//        // Print values using getters
//        System.out.println("Car ID: " + car.getCarId());
//        System.out.println("Car Name: " + car.getCarName());
//        System.out.println("Owner Name: " + car.getOwnerName());
//        System.out.println("Vehicle Type: " + car.getVehicleType());
//        System.out.println("Car Amount: " + car.getCarAmount());
//
//    }
//}
//class carDetails{
//    private int carId;
//    private String carName;
//    private String ownerName;
//    private String vehicleType;
//    private long carAmount;
//
//    public long getCarAmount() {
//        return carAmount;
//    }
//
//    public void setCarAmount(long carAmount) {
//        this.carAmount = carAmount;
//    }
//
//    public int getCarId() {
//        return carId;
//    }
//
//    public void setCarId(int carId) {
//        this.carId = carId;
//    }
//
//    public String getCarName() {
//        return carName;
//    }
//
//    public void setCarName(String carName) {
//        this.carName = carName;
//    }
//
//    public String getOwnerName() {
//        return ownerName;
//    }
//
//    public void setOwnerName(String ownerName) {
//        this.ownerName = ownerName;
//    }
//
//    public String getVehicleType() {
//        return vehicleType;
//    }
//
//    public void setVehicleType(String vehicleType) {
//        this.vehicleType = vehicleType;
//    }
//}
/// Same Program but in this we don't create getter and setter we can create Constructor
//public class Rough {
//    public static void main(String[] args) {
//
//        carDetails car = new carDetails(101, "Swift", "Onkar", "Petrol", 780000);
//
//        car.display();
//    }
//}
//
//class carDetails {
//    private int carId;
//    private String carName;
//    private String ownerName;
//    private String vehicleType;
//    private long carAmount;
//
//    // Constructor
//    public carDetails(int carId, String carName, String ownerName, String vehicleType, long carAmount) {
//        this.carId = carId;
//        this.carName = carName;
//        this.ownerName = ownerName;
//        this.vehicleType = vehicleType;
//        this.carAmount = carAmount;
//    }
//
//    // Display method
//    public void display() {
//        System.out.println("Car ID: " + carId);
//        System.out.println("Car Name: " + carName);
//        System.out.println("Owner Name: " + ownerName);
//        System.out.println("Vehicle Type: " + vehicleType);
//        System.out.println("Car Amount: " + carAmount);
//    }
//}


///just print array by different datatype.
//public
//class Rough {
//    public static void main(String[] args) {
////        int[] arr ={12,25};
////        for (int num : arr){
////            System.out.println(num);
////        }
//
////        int[][] arr = {
////                {1, 2},
////                {3, 4, 5},
////                {6}
////        };
////        for (int[] num : arr){
////            System.out.println(num);
////        }
//    }
//}

/// STRING PROGRAM
//public class Rough {
//    public static void main(String[] args) {
//        String s =new String("Onkar");
//        System.out.println(s.indexOf(1,2));
//        System.out.println(12+" : "+s);
//    }
//}

/// String Buffer


//public class Rough {
//    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.capacity());
//        Demo demo = new Demo();
//        demo.id=12;
//        demo.name="Onkar   ";
//        System.out.println(demo.name);
//
//    }
//}
//class Demo{
//    public int id;
//    public String name;
//    Rough rough = new Rough();
//
//}
//

//
//public class Rough {
//    public static void main(String[] args) {
//        System.out.println();
//        System.out.print(" * ");
//        System.out.print(" ");
//        System.out.print(" * ");
//
//    }
//}

/// Inheritance


//
//
//class cal{
//    public int add(int x,int y){
//        return x + y;
//    }
//    public int mul(int x  , int y){
//        return x * y;
//    }
//}
//class advanceCal extends  cal{
//    public int divide(int x , int y){
//        return x / y;
//    }
//}
//public  class Rough {
//    public static void main(String[] args) {
//        advanceCal advanceCal = new advanceCal();
//        int r1 = advanceCal.add(0,0);
//        float r2=advanceCal.divide(4,5);
//        int r3=advanceCal.mul(6,7);
//
//        System.out.println(r1);
//        System.out.println(r2);
//        System.out.println(r3);
//
//
//        // cal c = new cal();
//
//
//
//
//    }
//}



 ///  just simple ArrayList
//public class Rough{
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
//        list.add(12);
//        list.add(34);
//        System.out.println(list);
//
//    }
//}


/// final = variable , class ,  Method

//public class Rough {
//    public static void main(String[] args) {
//        final  int f1 = 15;
//        double f = 34.908;
//        // f = 20;
//        System.out.println(f);
//
//    }
//}



/// you can create a final class their will be not extend and they are final not change

//    final  class display{
//        public void go(){
//            System.out.println("Ok");
//        }
//}
//class  useMe extends  display{
//
//}
//
//            public class Rough {
//            public static void main(String[] args) {
//            int[] arr ={20,34,23,57,66};
//            int arrayAddition = 0;
//
//             for (int i = 0; i < arr.length; i++) {
//             arrayAddition += arr[i];
//             }
//             int value = arr[0];
//            value  =  value * 100;
//
//            System.out.println(value);
//            System.out.println(arrayAddition);
//            }
//            }
//
//
//
//
//
//



/// firstLarget  Number  and  secondLargest Number */\*/\*/\*/\*
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {34,12,55,67,45,89,19};
//        int firstLargest = 0;
//        int secondLargest = 0;
//
//        for (int i = 0; i < arr.length-1; i++) {
//            if (firstLargest < arr[i]){
//                firstLargest = arr[i];
//            }
//        }
//        System.out.println("FirstLargest: "+firstLargest);
//        for (int i = 0; i < arr.length; i++) {
//            if (secondLargest < arr[i] & arr[i] != firstLargest){
//                secondLargest = arr[i];
//            }
//
//        }
//        System.out.println("SecondLargest: "+secondLargest);
//    }
//}



    /// smallest and secondSmallest in the array -

//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {34,12,55,67,45,89,19};
//        int smallest = arr[0];
//        int secondSmallest = arr[0];
//
//
//        for (int i = 0; i <arr.length -1  ; i++) {
//            if (smallest > arr[i]){
//                smallest = arr[i];
//            }
//        }
//        System.out.println("Smallest: "+smallest);
//        for (int i = 0; i < arr.length; i++) {
//            if (secondSmallest > arr[i] & arr[i] != smallest){
//                secondSmallest = arr[i];
//            }
//        }
//        System.out.println("secondSmallest: "+secondSmallest);
//    }
//}


/// Using Method Also Possible

//public class Rough {
//        public static void main(String[] args) {
//
//
//        }
//        public static int isSmallest(int[] arr){
//                int l = 0;
//               for(int i = 0; i < arr.length -1 ; i++){
//              if (l < arr[i]){
//                 l = arr[i];
//                     }
//               }
//            return l;
//        }
//}
//
//
//

/// class - class -> Extends
/// class - interface -> Implements
/// interface - interface -> Extend

//public class Rough {
//    public static void main(String[] args) {
//       String s1 = "madam";
//       String s2 = "";
//
//       /// Palindrome
//        for (int i = s1.length()-1; i >= 0 ; i--) {
//            s2=s2+s1.charAt(i);
//        }
//        System.out.println(s2);
//        if (s1.equals(s2)){
//            System.out.print("Palindrome");
//        }else {
//            System.out.println("Not Palindrome");
//        }
//        System.out.println();
//        /// Reverse
//        String s4 = "java is a good programming language";
//        String s5 = " ";
//        String[] word = s4.split(" ");
//        for (int i = word.length-1; i >= 0 ; i--) {
//            System.out.print(word[i]+" ");
//        }
//
//    }
//}


//     enum status{
//        running , failed , pending , success;
//         }
//public class Rough {
//        public static void main(String[] args) {
//
//
//        int  i = 5;
//            status s  = status.failed ;
//            status s1 = status.success;
//            status s2 = status.pending;
//            status s3 = status.running;
//
//        System.out.println(s.ordinal());
//            System.out.println(s.compareTo(s1));
//    }
//}
//

/// Lambada Expression
//interface add{
//    int sum (int a , int b);
//}
//
//public class Rough {
//    public static void main(String[] args) {
//
//        add obj = (a, b) -> a + b;
//        System.out.println(obj.sum(4,5));
//
//    }
//}
//

/// Exception
//
//public  class Rough {
//    public static void main(String[] args) {
//
//        int[] arr = new int[5];
//     //   arr[2] = 89;
//
//String s1 = null;
//        try
//        {
//            System.out.println(10/5);
//            System.out.println(s1.length());
//            System.out.println(arr[7]);
//        }catch(ArithmeticException e){
//            System.out.println("A");
//         }catch(NullPointerException e){
//             System.out.println("B''" +89+ "'' ");
//        }
//    }
//}
///_______
///\\\ | String Replace


//public class Rough {
//    public static void main(String[] args) {
//
//        String s1 = "Cat";
//        System.out.println(s1);
//        System.out.println(s1.replace('a','u'));
//        System.out.println(s1);
//        System.out.println(s1.indexOf('t'));
//        System.out.println(s1.isEmpty());
//        System.out.println(s1.length());
//
//        StringBuffer stringBuffer = new StringBuffer("Don");
//
//
//    }
//}


/// MultiThreading
///
///
///
//class  A extends  Thread{
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
//}
//class  B extends Thread{
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Good Morning");
//            try {
//                Thread.sleep(1500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//public class Rough {
//    public static void main(String[] args) {
//        A obj = new A();
//        B obj1 = new B();
//
////        obj.Show();
////        obj1.Show();
//
//        obj.start();
//        obj1.start();
//
//
//    }
//}



/// ACCOUNT BALANCE
///


//public class Rough {
//    public static void main(String[] args) {
//Scanner in = new Scanner(System.in)
//;       int accountBalance = 1000;
//
//        int num = 1;
//        System.out.println("Press 1 for Deposit: ");
//
//        System.out.println("Press 2 for Withdrawal: ");
//        System.out.println("Press 3 for check Bank Balance: ");
//
//        Cat cat = new Cat();
//
//    }
//}
//abstract class Dog {
//    public  void dog(){
//        System.out.println("Hii");
//    }
//}
//class   Cat extends Dog{
//    public void  cat(){
//        System.out.println("Good");
//    }
//}


//
//interface Dog {
//    void dog(); // abstract method (no body)
//}
//
//class Cat implements Dog {
//
//    public void dog() {
//        System.out.println("Hii"); // implementation of interface method
//    }
//
//    public void cat() {
//        System.out.println("Good");
//    }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//
//
//        cat.dog(); // from interface
//        cat.cat(); // own method
//    }
//}
/*
____ _ ____
//*\\ //*\\

*/

/// Multiple Nested Loops
//public class Rough {
//    public static void main(String[] args) {
//
//
//        for (int i = 0; i < 5 ; i++) {
//            for (int j = 0; j < 5 ; j++) {
//                for (int k = 0; k < 5 ; k++) {
//                    for (int l = 0; l < 5; l++) {
//                        System.out.println("hello");
//
//                    }
//                }
//            }
//        }
//
//    }
//}




/// Binary Search

//public  class Rough {
//    public static void main(String[] args) {
//        int arr[] = {11,22,33,44,55,66,77,88,99};
//        int result = binarySearch(arr,109);
//        if (result == -1){
//            System.out.println("Not Found");
//        }else{
//            System.out.println("Found At index: "+ result);
//        }
//
//
//    }
//    public static int binarySearch(int[] arr, int result){
//        int left = 0;
//        int right = arr.length-1;
//
//        for ( ; left <= right ; ) {
//            int mid = (right + left) / 2;
//            if (arr[mid] == result){
//                return mid;
//            }else if (arr[mid] < result){
//
//  //                    33          88
//                 left = left + 1;
//
//            }else{
//                right = right - 1;
//            }
//
//        }
//        return  -1;
//    }
//}


///  Linear Search
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int arr[] = {13,43,23,44,56,32,34};
//
//        int result = linearSearch(arr,44);
//        if (result == -1){
//            System.out.println("Not Found");
//        }else {
//            System.out.println("Fount At Index: "+result);
//        }
//
//
//    }
//    public static int linearSearch(int[] arr, int target){
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] == target){
//                return i;
//            }
//        }
//        return  -1;
//    }
//
//}


///Find Duplicated (My Program)

//public class Rough {
//    public static void main(String[] args) {
//
//        int arr[] = {12,34,22,43,12,99,22};
//        int duplicate = 0;
//
//        for (int i = 0; i <arr.length-1;  i++) {
//            for (int j = i + 1; j < arr.length;  j++) {
//                if (arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                }
//            }
//        }
//    }
//}






/// Find Duplicate Element (ChatGpt Code)

//public class Rough {
//    public static void main(String[] args) {
//
//        int arr[] = {12,12,22,43,12,99,22};
//
//        for (int i = 0; i < arr.length - 1; i++) {
//
//            boolean isPrinted = false;
//
//            for (int k = 0; k < i; k++) {
//                if (arr[i] == arr[k]) {
//                    isPrinted = true;
//                    break;
//                }
//            }
//
//            if (isPrinted) continue;
//
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println(arr[i]);
//                    break;
//                }
//            }
//        }
//
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//}

/// Collection Interface
//public class Rough {
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList(); // not generic
//        ArrayList<Integer> arrayList = new ArrayList<>(); // it is generic rules and regulation
//        arrayList.add(23);
//     //   arrayList.add("onkar");
//        List l = new LinkedList();
//
//        l.add(12);
//        l.add("good");
//
//        list.add(12);
//        list.add("onkar");
//    }
//}

/////ALL IN ONE
//import java.util.*;
//
//public class Rough {
//    public static void main(String[] args) {
//
//        // 1️⃣ List (ArrayList)
//        List<String> list = new ArrayList<>();
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Apple"); // duplicate allowed
//
//        System.out.println("List (ArrayList): " + list);
//
//        // 2️⃣ Set (HashSet)
//        Set<String> set = new HashSet<>();
//        set.add("Apple");
//        set.add("Banana");
//        set.add("Apple"); // duplicate ignored
//
//        System.out.println("Set (HashSet): " + set);
//
//        // 3️⃣ Queue (LinkedList)
//        Queue<String> queue = new LinkedList<>();
//        queue.add("A");
//        queue.add("B");
//        queue.add("C");
//
//        System.out.println("Queue: " + queue);
//        System.out.println("Removed from Queue: " + queue.poll()); // FIFO
//
//        // 4️⃣ Map (HashMap)
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Onkar");
//        map.put(2, "Java");
//
//        System.out.println("Map (HashMap): " + map);
//
//        // Traversing Map
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
//    }
//}

//
//public class Rough {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//
////        list.add(34);
////        list.add(45);
////        list.add(12);
////        list.add(9);
////        list.add(56);
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//
//
//        //Ludo Game important topic
//        Collections.shuffle(list);
//
//        System.out.println(list);
//
//        System.out.println();
//        System.out.println();
//
//       // System.out.println(list.reversed());
//        System.out.println(list.get(0));
//
//        System.out.println(list);
//      Collections.sort(list);
//        System.out.println(list);
//        System.out.println(list.get(3) - 4);
//        System.out.println(list.reversed());
//    }
//}
//


///  print odd or even number from 1 to 100
//public class Rough {
//    public static void main(String[] args) {
////        for (int i = 2; i <= 100 ; i= i+2) {
////            System.out.println(i);
////        }
//
//
//
//    }
//}

/// Stream AND Filter
//import java.util.*;
//import java.util.stream.*;
//
//public class Rough {
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
//
//        // Using stream and filter
//        list.stream()
//                .filter(n -> n % 2 == 0)   // condition: even numbers
//                .forEach(System.out::println);  // print result
//    }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int n = 5;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <=n - i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//
//        }
//
//
//    }
//}

/// Optional
//public class Rough {
//    public static void main(String[] args) {
//
//        List<String> string = Arrays.asList("Onkar", "Krushna", "Sahil","Tushar","Aditya");
//        System.out.println(string);
//
////        for (int i = 0; i < 5; i++) {
////           int k = 5;
////            System.out.println(k);
////        }
//
//    }
//    }
//
//




//public class Rough {
//    public static void main(String[] args) {
//        int n =5;
//        for (int i = 5; i >= 0; i--) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//}


///


//public class Rough {
//    public static void main(String[] args) {
//        int star = 5;
//
//        for (int i = 1; i <= star ; i++) {
//            for (int j = 1; j <= star ; j++) {
//                if (i == 1 ||i == 5||j == 1|| j == 5) {
//                    System.out.print(" * ");
//                }else {
//                    System.out.print("   ");
//                }
//            }
//                System.out.println(  );
//        }
//    }
//}








//public class Rough {
//    public static void main(String[] args) {
//        int n = 6;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n ; j++) {
//                System.out.print( i+"i"+ "     "+ j +" ");
//            }
//            System.out.println( );
//        }
//    }
//}


/// LVTI(Local variable Type inference)

//public  class Rough {
//    public static void main(String[] args) {
//        var n = 3;
//        var name = "onkar";
//        var result = n + name;
//        System.out.println(result);
//    }
//
//}


/// fibo

//public class Rough {
//    public static void main(String[] args) {
//
//Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number: ");
//        int n = input.nextInt();
//        ///int n = 5; // user print this number;
//
//        int a = 0;
//        int b = 1;
//        for (int i = 0; i <= n ; i++) {
//            int c = a + b;
//            System.out.println(a);
//            a = b;
//            b = c;
//            if (n == b){
//                break;
//            }
//        }
//    }
//
// \/}

///  fibo
//public class Rough {
//    public static void main(String[] args) {
//
//Scanner input = new Scanner(System.in);
//        System.out.println("Print A Number: ");
//        int n = input.nextInt();
//
//
//        int a = 0,b= 1;
//        while (a <= n){
//            System.out.println(a);
//        int c = a + b;
//        a = b;
//        b = c;
//
//        }
//    }
// }
//
//
//
//


//
//public class Rough {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100 ; i++) {
//            System.out.println("Per Day 3Cr");
//        }
//    }
//}
//
//
//
 /// vowels and consonants
//public  class Rough {
//     public static void main(String[] args) {
//         String s1 = "helloWorld";
//
//         int vowels = 0;
//         int consonants = 0;
//
//         for (int i = 0; i < s1.length() ; i++) {
//             char ch = s1.toLowerCase().charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                 vowels++;
//             }else {
//                 consonants++;
//             }
//         }
//
//         System.out.println(vowels+" vowels");
//         System.out.println(consonants+" consonants");
//     }
//}



/// bubble sort
/// it is not a bubble sort in bubble sort just small correction needed
// if(arr[j] > arr[j+1]) just replace it will be convert into bubble sort
//
//public class Rough {
//    public static void main(String[] args) {
//
//        int[] arr = {12,34,9, 5,66,90,33};
//
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i + 1; j <= arr.length - 1; j++) {
//                if (arr[i] > arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//    }
//}
//


/// selection sort

////
//public class Rough {
//    public static void main(String[] args) {
//int midIndex = 0;/// sorry it's minIndex
//        int[] arr = {12,99,88,34,91};
//        for (int i = 0; i < arr.length; i++) {
//             midIndex = i;
//
//            for (int j = i + 1; j < arr.length; j++) {
//
//
//                if (arr[j] < arr[midIndex]){
//                   midIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[midIndex];
//            arr[midIndex] = temp;
//        }
//        for (int num : arr){
//            System.out.println(num);
//        }
//
//    }
//
//}

///  remove duplicate element in the array

//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {12,32,22,13,122,32,122,122};
//        int temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//              temp=arr[i];
//                    // System.out.println(temp);
//
//                }
//
//
//            }
//
//        }
//        System.out.println("Gap");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == temp){
//
//            }else {
//                System.out.println(arr[i]);
//            }
//        }
//
//    }
//}


///  start ABC

//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        char ch = 'a';
//        //System.out.println(ch);
//
//
//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println( );
//
//        }
//
//    }
//}

///move all 0 in end of array
//public class Rough {
//    public static void main(String[] args) {
//
//        int[] arr = {12,0,5,0,9,87,12};
//        int n = arr.length;
//
//
//        /// 1St Attempt
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0){
//              int temp = arr[i];
//              arr[i] = arr[n];
//              arr[n] = temp;
//              n = n - 1;
//            }
//        }
//
//
//
//
//
//
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//
//    }
//}
//
//
//
//


//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {12,33,78,9,65,3};
//        int target = 99;
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i] == target){
//                System.out.println(i);
//            }
//        }
//    }
//}

//public class Rough {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(" OK ");
//            }
//        }
//    }
//}



/// find the check majority element in the array(if any)
//public class Rough {
//    public static void main(String[] args) {
//
//        int[] arr = {2,1, 2, 2, 3, 2, 2, 2};
//
//        int increase = 0;
//        int value = 0;
//        int count = 0;
//        //  int temp = arr[increase];
//        int n = arr.length / 2;
//        //for (int k = 0; k < arr.length; k++) {
//        int temp = arr[increase];
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if (temp == arr[i]) {
//                    value = arr[i];
//                    count++;
//                }
//
//            }
//
//
//            // System.out.println(count);
//            if (count > n) {
//                System.out.println("majority element: " + value);
//            } else {
//                System.out.println("No majority ");
//            }
//
//
//
//        }
//    }
//
 /// print the number is Armstrong or Not
//
//public class Rough {
//     public static void main(String[] args) {
//
//int num = 153;
//int original = num;
//int count = 0;
//int rev = 0;
//
//
//
//while(num != 0){
//    int rem = num % 10;
//    rev = rev * 10 + rem;
//    count += rem * rem * rem;
//    num = num / 10;
//}
//
//         System.out.println(rev);
//         if (original == count){
//             System.out.println("Armstrong Number");
//         }else {
//             System.out.println("Not Armstrong");
//         }
//
//     }
//}

//
//class A{
//    int  x, y;
//    int result = x + y;
//    void Show(){
//        System.out.println("hello");
//
//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print("   ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//
//
//        System.out.println();
//        System.out.println();
//
//
//        int i = 0;
//        do {
//            System.out.println("Hello");
//        }while (i != 0);
//
//    }
//
//
// }
//public class Rough {
//    public static void main(String[] args) {
//        A a = new A();
//        a.Show();
//
//        System.out.println(add(2,3));
//    }
//    public static int add(int x , int y){
//        return x + y;
//    }
//}


///  print all zero end of an array
//
//public class Rough {
//    public static void main(String[] args) {
//
//       //  System.out.println('a' + 0); -> 97
//       //  System.out.println('A'+ 0);  -> 65
//
//
//        int[] arr = {0,0,1,0,8,90,8,0,2};
//        int index = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0){
//                //System.out.println(arr[i]);
//                arr[index] = arr[i];
//                index++;
//            }
//
//        }
//        System.out.println(index);
//        while (index < arr.length) {
//
//            arr[index] = 0;
//            index++;
//        }
//
//
//
///// print via Enhanced Loop
////            for (int num : arr){
////                System.out.println(num);
////            }
//        /// print via normal loop
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        }
//       // System.out.println(index+" Index");
//    }
//
//




///  print all 0 end of an array
//
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {12,0,15,0,9,0,8};
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] != 0){
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//        while (index < arr.length){
//            arr[index] = 0;
//            index++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}

//
//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int num = 19;
//        isPrime(num);
//        System.out.println(isPrime(num));
//
//
//
//    }
//    public static boolean isPrime(int x){
//        if (x <= 1){
//            return false;
//        }else {
//            for (int i = 2; i < x ; i++) {
//                if (x % i == 0){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//}


//
//public class Rough {
//    public static void main(String[] args) {
//
//        int[] arr = {12,0,9,0,1};
//        int index = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] != 0){
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//        while(index < arr.length){
//            arr[index] = 0;
//            index++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//    }
//
//}
//
//
//public class Rough {
//    public static void main(String[] args) {
//        int num = 153;
//        int count = 0;
//         int original = num;
//int rev = 0;
//
//        while(num != 0){
//            int rem = num % 10;
//            rev = rev * 10 + rem;
//            count += rem * rem * rem;
//
//            num = num / 10;
//        }
//        if (count == original){
//            System.out.println("Armstrong");
//        }else {
//            System.out.println("Not Armstrong");
//        }
//        System.out.println(rev);
//    }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(12);
//        arrayList.add(23);
//
//
//
//        for (int num : arrayList){
//            if (num % 2 == 0){
//                System.out.println(num+" Number is Even");
//            }else {
//                System.out.println(num+" num is odd");
//            }
//        }
//
//
//    }
//}


    ///Infinite Loop
//public class Rough {
//    public static void main(String[] args) {
////        for(;;){
////            System.out.println("Sahil");
////        }
////        while (true){
////            System.out.println("Sahil");
////        }
//
////while(true){
////    System.out.println("per day 3cr");
////}
//
//    }
//}

//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int n = 6;
//
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//
//

/// binary Search Algorithm
//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int[] arr = {1,2,3,4,5,6,7,8,9,98};
//        int target = 98;
//
//        int result = isBinary(arr,target);
//
//
//        if (result == -1){
//            System.out.println("not found");
//        }else {
//            System.out.println(result);
//        }
//
//
//
//
//    }
//    public static int isBinary(int[] arr, int target){
//        int low = 0;
//        int high = arr.length-1;
//
//
//
//        while(low <= high){
//            int mid = (low + high)/2;
//            if (arr[mid] == target){
//                return mid;
//            } else if (arr[mid] < target) {
//              low  = mid + 1;
//            }else {
//                high = mid - 1;
//            }
//
//        }
//        return -1;
//    }
//
//
//}


/// Bubble sort

//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int[]  arr = {98,34,55,1,5,67};
//
//
//        for (int i = 0; i <arr.length-1 ; i++) {
//
//            for (int j = 0; j < arr.length-1; j++) {
//
//
//                if (arr[j] > arr[j +1]){
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//
//                }
//            }
//        }
//
//
//        for (int num : arr){
//            System.out.println(num);
//        }
//    }
//}
//
//
//


/// factorial

//public
//class Rough {
//    public static void main(String[] args) {
//
//
//        int n = 5;
//        int count = 1;
//        for (int i = 1; i <= 5 ; i++) {
//            count *= i;
//        }
//        System.out.println(count);
//    }
//}


/// fibonacci series
//public class Rough {
//    public static void main(String[] args) {
//
//int n = 10;
//
//        int a = 0, b= 1;
//        while (a <= n) {
//            System.out.println(a);
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//    }
//}

/////  find the frequency element in the array
//public class Rough {
//    public static void main(String[] args) {
//
//        int[] arr = {50,60,50,70,60,50};
//        int count = 0;
//        int temp = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]){
//                    temp = arr[i];
//                    count++;
//
//
//                }
//            }
//            System.out.println(temp +" in the array "+count+" times");
//            count = 0;
//        }
//
//
//
//    }
//}




///  print all 0 end of an array
//
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {12,0,15,0,9,0,8};
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] != 0){
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//        while (index < arr.length){
//            arr[index] = 0;
//            index++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}

//
//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int num = 19;
//        isPrime(num);
//        System.out.println(isPrime(num));
//
//
//
//    }
//    public static boolean isPrime(int x){
//        if (x <= 1){
//            return false;
//        }else {
//            for (int i = 2; i < x ; i++) {
//                if (x % i == 0){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//}


//
//public class Rough {
//    public static void main(String[] args) {
//
//        int[] arr = {12,0,9,0,1};
//        int index = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] != 0){
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//        while(index < arr.length){
//            arr[index] = 0;
//            index++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//    }
//
//}
//
//
//public class Rough {
//    public static void main(String[] args) {
//        int num = 153;
//        int count = 0;
//         int original = num;
//int rev = 0;
//
//        while(num != 0){
//            int rem = num % 10;
//            rev = rev * 10 + rem;
//            count += rem * rem * rem;
//
//            num = num / 10;
//        }
//        if (count == original){
//            System.out.println("Armstrong");
//        }else {
//            System.out.println("Not Armstrong");
//        }
//        System.out.println(rev);
//    }
//}
//
//public class Rough {
//    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(12);
//        arrayList.add(23);
//
//
//
//        for (int num : arrayList){
//            if (num % 2 == 0){
//                System.out.println(num+" Number is Even");
//            }else {
//                System.out.println(num+" num is odd");
//            }
//        }
//
//
//    }
//}


///Infinite Loop
//public class Rough {
//    public static void main(String[] args) {
////        for(;;){
////            System.out.println("Sahil");
////        }
////        while (true){
////            System.out.println("Sahil");
////        }
//
////while(true){
////    System.out.println("per day 3cr");
////}
//
//    }
//}

//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int n = 6;
//
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//
//

/// binary Search Algorithm
//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int[] arr = {1,2,3,4,5,6,7,8,9,98};
//        int target = 98;
//
//        int result = isBinary(arr,target);
//
//
//        if (result == -1){
//            System.out.println("not found");
//        }else {
//            System.out.println(result);
//        }
//
//
//
//
//    }
//    public static int isBinary(int[] arr, int target){
//        int low = 0;
//        int high = arr.length-1;
//
//
//
//        while(low <= high){
//            int mid = (low + high)/2;
//            if (arr[mid] == target){
//                return mid;
//            } else if (arr[mid] < target) {
//              low  = mid + 1;
//            }else {
//                high = mid - 1;
//            }
//
//        }
//        return -1;
//    }
//
//
//}


/// Bubble sort

//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int[]  arr = {98,34,55,1,5,67};
//
//
//        for (int i = 0; i <arr.length-1 ; i++) {
//
//            for (int j = 0; j < arr.length-1; j++) {
//
//
//                if (arr[j] > arr[j +1]){
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//
//                }
//            }
//        }
//
//
//        for (int num : arr){
//            System.out.println(num);
//        }
//    }
//}
//
//
//


/// factorial

//public
//class Rough {
//    public static void main(String[] args) {
//
//
//        int n = 5;
//        int count = 1;
//        for (int i = 1; i <= 5 ; i++) {
//            count *= i;
//        }
//        System.out.println(count);
//    }
//}


/// fibonacci series
//public class Rough {
//    public static void main(String[] args) {
//
//int n = 10;
//
//        int a = 0, b= 1;
//        while (a <= n) {
//            System.out.println(a);
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//    }
//}

/////  find the frequency element in the array
//public class Rough {
//    public static void main(String[] args) {
//
//        int[] arr = {50,60,50,70,60,50};
//        int count = 0;
//        int temp = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]){
//                    temp = arr[i];
//                    count++;
//
//
//                }
//            }
//            System.out.println(temp +" in the array "+count+" times");
//            count = 0;
//        }
//
//
//
//    }
//}




//
//public  class Rough {
//   public static  void main(String[] args){
//
//
//       Student s = new Student("Onkar",23);
//       System.out.printf(String.valueOf(s));
//
//   }
//
//   static class Student{
//
//       private int age;
//       private String name;
//
//       public Student(String name, int age){
//this.name=name;
//this.age=age;
//
//
//       }
//       @Override
//public String toString() {
//    return "Student{id=" + age + ", name='" + name + "'}";
//}
//
//   }
//
//
//}

//public class Rough {
//    static void main() {
//
//        int star = 6;
//        for (int i = 1; i <= star ; i++) {
//            for (int j = 1; j <=star - i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }
//
//
//    }
//}

//
//public class Rough {
//    static void main() {
//
//
//        int star = 6;
//        for (int i = star; i >= 0; i--) {
//            for (int j = 1; j <= star - i; j++) {
//                System.out.print("   ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//
//
//        System.out.println();
//
//        char ch = 'a';
//
//        for (int i = star; i >= 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" " + ch + " ");
//                // ch++;
//            }
//
//            System.out.println();
//            ch++;
//        }
//        System.out.println();
//
//        for (int i = 1; i <= star; i++) {
//            for (int j = 1; j <= star; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//
//        }
//        System.out.println();
//        for (int i = 1; i <= star; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//}


//
//   enum gender{
//        male,
//       female
//   }




////
 ///
//public class Rough {
//    static void main() {
//
//                int star = 6;
//        for (int i = star; i >= 0 ; i--) {
//            for (int j = 1; j <=star - i ; j++) {
//                System.out.print("   ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//
//
//        System.out.println();
//
//
//        for (int i = 1; i <= star ; i++) {
//            for (int j = 1; j <= star - i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }











//
//
//
//        List<Integer> employee = new ArrayList<>();
//        employee.add(12);
//        employee.add(23);
//        employee.add(34);
//        employee.add(45);
//        employee.add(67);
//        employee.add(9);


//        employee.stream().
//                filter(employee -> employee.compareTo(12))
//                .toArray();








//
//
//    }
//}
//
//
//





/// Armstrong number cha vishay asa ahe
/// number 3 digit asla tar rem * rem * rem
///// ani 4 digit asla tar rem * rem * rem * rem ;
//    public class Rough {
//    public static void main(String[] a) {
//
//
//        int num = 8208;
//        int digitCount = 0;
//        int original = num;
//        int count = 0;
//        int rev = 0;
//        int rem = 0;
//        for (; num != 0; num = num / 10) {
//            int rem1 = num % 10;
//            rev = rev * 10 + rem1;
//            digitCount++;
//        }
//
//        if (digitCount == 3) {
//            for (; original != 0; original = original / 10) {
//                rem = original % 10;
//                count += rem * rem * rem;
//            }
//        }else {
//            for (; original != 0; original = original / 10) {
//                rem = original % 10;
//                count += rem * rem * rem * rem;
//            }
//
//
//        }
//        System.out.println("Rev " + rev);
//        System.out.println("Arm " + count);
//}
//}
//
//
//
//
//
//
//
//



    /// to find a strong number using a factorial
//
//public class Rough {
//     static void main() {
//
//
//        int num = 145;
//        int original = num;
//       // int rem = 0;
//        int count = 0;
//
//
//        for (; num != 0; num = num / 10) {
//           int rem = num % 10;
//            System.out.println(rem);
//            count += isFact(rem);
//            System.out.println("count " + count);
//        }
//if (count == original){
//    System.out.println("Strong Number");
//
//    }else {
//    System.out.println("Not Strong Number");
//    }
//}
//
//
//    public static int isFact(int x) {
//        int count = 1;
//        for (int i = 1; i <= x ; i++) {
//            count *= i;
//        }
//        return count;
//    }
//






///
/// to find largest , second largest , lowest and second lowest
///
//
//        public class Rough {
//        static void main() {
//
//
//            int arr[] = {12,43,54,21,33,4,22};
////
////            for (int i = arr.length-1; i >= 0 ; i--) {
////                System.out.println(arr[i]);
////            }
//
//int largest = arr[0];
//int secondLargest = 0;
//
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] > largest){
//                    largest = arr[i];
//                }
//            }
//            System.out.println(largest);
//
//            for (int i = 0; i < arr.length; i++) {
//
//                if (arr[i] > secondLargest && arr[i] != largest){
//                    secondLargest = arr[i];
//                }
//            }
//            System.out.println(secondLargest);
//
//
//            // int arr[] = {12,43,54,21,33,4,22};
//            int smallest = arr[0];
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] < smallest){
//                    smallest = arr[i];
//
//                }
//            }
//            System.out.println(smallest);
//
//            int secondSmallest = arr[0];
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] < secondSmallest && arr[i] != smallest){
//                    secondSmallest = arr[i];
//                }
//            }
//
//            System.out.println(secondSmallest);
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
//        }
//}
//
//


//
//public class Rough {
//    static void main() {
//
//    }
//}
//


///  To check String Is palindrome or not
//
//public  class Rough {
// public static void main(String[] args) {
//
//
//     String s1 = "madam";
//
//     String s2 = "";
//     for (int i = s1.length()-1; i >= 0 ; i--) {
//         s2 = s2+s1.charAt(i);
//     }
//     if (s1.equals(s2)){
//         System.out.println("String Is Palindrome");
//     }else{
//         System.out.println("Not Palindrome");
//     }
//
//
//    }
//}
//
//
//
//public class Rough {
//    static void main() {
//
//
//        int num = 123;
//        int reverse = 0;
//        for (; num != 0; num = num / 10){
//            int rem = num % 10;
//            reverse = reverse * 10 + rem;
//        }
//        System.out.println(reverse);
//
//    }
//}
//
//


//public class Rough {
//    static void main() {
//
//        String s1 =  "Name";
//        String s2 = "";
//
//        StringBuffer stringBuffer = new StringBuffer("Hello");
//
//        s2 = s2+stringBuffer.reverse();
//        System.out.println(s2);
//    }
//}
//




///  To Check The Addition of Two Elements in the array is equal to target if yes return those element


///  myOWN
//public class Rough {
//    public static void  main(String[] args){
//
//        int[] arr = {1,2,3,4,5,6};
//        int target = 12;
//
//        int low = 0;
//        int high = arr.length - 1;
//
//        boolean isFound = false;
//
//
//        while (low < high){
//             int sum = arr[low] + arr[high];
//
//             if (sum == target){
//                 System.out.println(arr[low] +  "   " + arr[high]);
//                 isFound = true;
//                 break;
//
//             } else if (sum < target) {
//                 low++;
//             }else {
//                high--;
//             }
//
//
//        }
//if (!isFound){
//    System.out.println("No Pair Found ");
//}
//
//
//
//        }
//
//
//}
//
//
//
//
//
//








/// Chat GPT
//
//public class Rough {
//    public static void main(String[] args) {
//        int[] arr = {7, 2, 9, 4, 6, 3}; // unsorted array
//        int target = 10;
//
//        boolean found = false;
//
//        // Check every possible pair
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
//                    found = true;
//                }
//            }
//        }
//
//        if (!found) {
//            System.out.println("No pair found with sum = " + target);
//        }
//    }
//}
///// both code are true but one is possible for




//public class Rough {
//    public static  void main(String[] args){
//
//
//        int num = 6;
//
//        if (num <= 1){
//            System.out.println("Prime");
//        }else{
//            for (int i = 2; i < 5 ; i++) {
//                if (num % i == 0){
//                    System.out.println("not prime");
//                    break;
//                }else {
//                    System.out.println("Prime");
//                    break;
//                }
//            }
//        }
//    }
//}




//
//public class Rough {
//    static void main() {
//
//
//
//        int one = 100;
//        int two = 200;
//        int three = 300;
//        int four = 400;
//
//        for (int i = 0; i <one ; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i <two ; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i <three ; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i <four; i++) {
//            System.out.println(i);
//        }
//    }
//}



//    public class Rough {
//        public static void main(String[] args) {
//
//      int[][] arr ={{12,34,33},{34,55,45}};
//
//
//
//      /// i rows and j column
//
//    System.out.println(arr[1][1]);
//
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = 0; j < arr[i].length ; j++) {
//            int c = arr[i].length;
//            System.out.println("main -> "+ c);
//            System.out.print(arr[i][j]+"   ");
//        }
//        System.out.println();
//    }
//
//    }
//}
//



//
//public class Rough {
//    static void main() {
//
//    }
//}




//
//
// interface Sample{
//     void myName();
//    void myFriendName();
//
//}
//
//class Extra12 implements  Sample{
//    @Override
//    public void myFriendName() {
//        System.out.println("Onkar");
//    }
//
//    @Override
//    public void myName() {
//        System.out.println("Krushna");
//    }
//}
//public class Rough {
//    static void main() {
//        Extra12 extra = new Extra12();
//        extra.myFriendName();
//        extra.myName();
//    }
//}
//
//
//
//



//
//
//
//record myName(String name, int id){};
//
//
//public  class Rough {
//    public static void main(String[] args){
//        System.out.println("OK");
//
//        myName myName = new myName("onkar", 12);
//
//
//
//    System.out.println(myName);
//    }
//}
//
//
//
//
//
//




/// Best Way to Solve ARMSTRONG Number.
//
//public class Rough {
//    public static void main(String[] args) {
//
//
//        int num = 153;
//        int addition = 0;
//        int original = num;
//        int last = original;
//
//        /// digit count
//        int count = 0;
//        while (num != 0){
//            count++;
//            num = num /10;
//        }
//        System.out.println(count);
//       for(; original != 0 ; original = original/ 10){
//           int rem = original % 10;
//           addition += Math.pow(rem,count);
//
//       }
//       if (addition == last){
//           System.out.println("Armstrong");
//       }else {
//           System.out.println("Not Armstrong");
//       }
//
//
//
//
//
//
//
//    }
//}
//
//



/// gcd and lcm
//
//public class Rough {
//  public static void main(String[] args) {
//
//
//      int num1 = 12;
//      int num2 = 16;
//      int gcd = 0;
/////  The GCD is never grater than be smaller element
//      int c = Math.max(num1,num2);
//      System.out.println("C "+c);
//
//      for (int i = 1; i <= c; i++) {
//          if (num1 % i == 0 && num2 % i == 0){
//              gcd = i;
//
//          }
//
//      }
//      System.out.println("LCM = "+ (num1 * num2)/gcd);
//
//      System.out.println("GCD "+gcd);
//
//
//
//    }
//}


/// fibonacci
//
//public class Rough {
//   public static void main(String[] args) {
//
//       int n = 12;
//
//       ///  fibonacci
//
//
//       int a = 0 ;
//       int b = 1;
//       while ( a < n){
//           System.out.println(a);
//           int c = a + b;
//           a = b;
//           b = c;
//
//
//
//       }
//
//    }
//}

















 /// remove duplicates from an array ->
//public class Rough {
//    public static void main(String[] args){
//
//        int[] arr = {1,2, 2 , 3 , 4 , 2,3,1};
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < i; j++) {
//                //  System.out.println(i+"i <- "+arr[i] +" E "+arr[j]+" ->"+j);
//                if (arr[i] == arr[j]) {
//                    // System.out.println(arr[i] +" EE "+arr[j]);
//                    isDuplicate = true;
//                    break;
//                }
//            }
//
//  //           System.out.print(isDuplicate+"V");
//            if (!isDuplicate){
//                System.out.print(arr[i]+" ");
//            }
//
//        }
//


//
//    }
//
//}







//
//
// class rough {
//     public void reverseString(String s) {
//         String s1 = " ";
//         for(int i = s.length(); i>= 0 ; i--){
//             s1 = s1+s.charAt(i);
//         }
//
//     }
// }





///*
//public class Rough {
//    public static void main(String[] args){
//        String myName = "onkar";
//
//         String start = " ";
//        String end = ;
//
//        while (start < end){
//            String temp =
//        }
//    }
//
//}*/
///  To Pointer Approach
//public class Rough {
//    static void main() {
//
//        String[] myName = {"Onkar ", "Krushna ", "Sahil ", "Aditya ", "Tushar "};
//        int start = 0;
//        int end = myName.length-1;
//
//
//        int   value = 12;
//
//        double value1 = (int) value;
//
//        while (start < end){
//            String  temp = myName[start];
//            myName[start] = myName[end];
//            myName[end] = temp;
//
//            start = start + 1;
//            end = end - 1;
//        }
//        //System.out.println(myname);
//        for (int i = 0; i <myName.length ; i++) {
//            System.out.print(myName[i]);
//        }
//    }
//}


import java.util.Arrays;

/// delete element of an array
//public class Rough {
//    public static  void main(String[] args){
//
//
//        int[] arr = {1,2,3,4,5,6};
//        int x = arr.length;
//        System.out.println(x);
//
//
//
//      // arr[2] = 20;
//        /// print the index number you want to add element in that index
//
//        /// 3
//
//int index = 3;
//int n = index;
//
//
//
//
//        for (int i = index ; i < x; i++) {
//           // System.out.println(arr[index]);
//            arr[index] = arr[i];
//            index++;
//        }
//
//        /// enter element you want to add.at index 3
//        /// 20
//        arr[n] = 20;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+"   ");
//        }
//
//
//    }
//
//
//}
//
//

/// insert element in the array.
///


//
//public class Rough {
//    static void main() {
//
//
//        int[] arr = {1,2,3,4,5};
//
//        int[] newArray = new int[arr.length+1];
//
//        int index = 3;
//        int element = 30;
//
//        for (int i = 0; i < newArray.length; i++) {
//            if (i < index){
//                newArray[i] = arr[i];
//            }else if (i == index){
//                    newArray[i] = element;
//                }else {
//                newArray[i] = arr[i -1];
//            }
//        }
//
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i]);
//        }
//
//
//    }
//}


///  Delete element in the array
//public class Rough
//{
//
//
//    static void main() {
//
//
//        int[] arr ={1,2,3,4,5,6};
//        ///  i don't want 4
//        int deleteElement = 4;
//        int index = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == deleteElement){
//                index = i;
//
//            }
//        }
//
//       // System.out.println("index "+index);
//
//        int[] newArray = new int[arr.length-1];
//
//        for (int i = 0; i < newArray.length; i++) {
//           if (i < index){
//               newArray[i] = arr[i];
//           } else if (i == index) {
//               newArray[i] = arr[i + 1];
//           }else {
//               newArray[i] = arr[i+1];
//           }
//        }
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i]);
//        }
//
//    }
//
//
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
//public class Rough {
//
//    public static void main(String[] args) {
//
//        int[] arr = {1, 2, 3, 4, 5, 6};
//
//        int deleteElement = 4;
//        int index = 0;
//
//        // Find index of element
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == deleteElement) {
//                index = i;
//                break;
//            }
//        }
//
//        // Create smaller array
//        int[] newArray = new int[arr.length - 1];
//
//        // Copy elements
//        for (int i = 0; i < newArray.length; i++) {
//
//            if (i < index) {
//                newArray[i] = arr[i];
//            } else {
//                newArray[i] = arr[i + 1];
//            }
//        }
//
//        // Print
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i]);
//        }
//    }
//}


/// Method Overloading
//
//public class Rough {
//    static void main() {
//
//
//        int[] arr = {1,2,3,4,5,6,7};
//
//    }
//}
//class calculator{
//    public  int isaAdd(int a , int b){
//        return a + b;
//    }
//    public  int isaAdd(int a , int b,int c){
//        return a + b + c;
//    }
//
//
//}
//
  /// remove duplicate from the array

//
//
//public class Rough {
//
//      static void main() {
//
//
//
//          int[] arr = {1,2,3,4,2,3};
//
//
//          for (int i = 0; i < arr.length; i++) {
//              boolean isDuplicate = false;
//              for (int j = 0; j < i; j++) {
//                  if (arr[i] == arr[j]){
//                      isDuplicate = true;
//                  }
//              }
//
//              if (!isDuplicate){
//                  System.out.println(arr[i]);
//              }
//          }
//
//
//
//      }
//
//
//
//
//
//}
//




















/// remove  duplicate elements in the array
//
//public class Rough {
//    public static void main(String[] args){
//
//
//
//
//        int[] arr = {1,2,3,3,4,2,5,6};
//
//        for (int i = 0; i <arr.length ; i++) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < i ; j++) {
//                if (arr[i] == arr[j]){
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate){
//                System.out.println(arr[i]);
//            }
//        }
//
//
//
//
//
//
//
//    }
//
//}
//
//
//
//
//




//
//public class Rough {
//    static void main() {
//        System.out.println(isFact(5));
//
//
//    }
//
//
//
//
//
//    /// Last In First Out.
//    public static  int isFact(int n){
//
//        if (n == 0 || n == 1){
//            return 1;
//        }else {
//            return n * isFact(n - 1);
//        }
//    }
//
/// isFact(4) → not base case → returns 4 * isFact(3)
//
/// isFact(3) → not base case → returns 3 * isFact(2)
//
/// isFact(2) → not base case → returns 2 * isFact(1)
//
/// isFact(1) → base case → returns 1
//
/// Now the chain resolves:
//
///  isFact(2) = 2 * 1 = 2
//
/// isFact(3) = 3 * 2 = 6
//
/// isFact(4) = 4 * 6 = 24
//









//    public  static int isAdd(int a , int b){
//        return a + b;
//    }
//    public  static int  isAdd(int a , int b, int c){
//        return a + b;
//    }
//
//
//
//}




/// swap to values without creating  a 3rd value.

//
//public class Rough {
//    public static void  main(String[] args){
//
//        int num1 = 200;
//        int num2= 100;
//
//
//
//
//
//        int a = 10;
//        int b = 5;
//
//        a = a + b; // a = 15
//        b = a - b; // b = 10
//        a = a - b; // a = 5
//
//        System.out.println("a = " + a + ", b = " + b);
//
//
//
//
//    }
//
//
//}

//
//public class Rough {
//    public static void main(String[] args){
//
//
//int[] arr = {1,2,3,4};
///// expected [2,1,4,3]
//        int currentNode = arr[0];
//
//int nextNode = arr[currentNode + 1];
//
////int temp = currentNode;
////currentNode = nextNode;
////nextNode =temp;
//
//        // System.out.println(currentNode);
//        for (int i = 0; i < arr.length; i++) {
//
//
//            System.out.println(arr[i]);
//        }
//
//
//
//    }
//}







/// binary search





//
//   public class Rough {
//    public static void main(String[] args) {
//
//
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        int target = 9;
//
//
//       // System.out.println(mid);
//
//        while (start <= end) {
//        int mid = (start + end) / 2;
//
//            if (arr[mid] == target ){
//                System.out.println(mid);
//                break;
//
//            } else if (arr[mid] < target) {
//                start = start + 1;
//            }else {
//                end = end - 1;
//            }
//
//        }
//
//
//
//        }
//
//
//    }
//
//
//
//




///Interface

//  public  class Rough {
//    public static  void main(String []args){
//
//        A a = new B();
//
//        a.config();
//        a.myName();
//
//    }
//
//}
//
//interface A{
//    void config();
//    void myName();
//}
//class B implements  A{
//
//     @Override
//    public void myName() {
//        System.out.println("Onkar");
//    }
//
//
//    public void config() {
//        System.out.println("Configuration Done");
//    }
//}
//



/// Inheritance.

//
//
//abstract class myName{
//    public static int isAdd(int a , int b){
//        return a + b;
//    }
//
//
//
//
//}
//
//
//class b extends  myName{
//
//
//
//}
//public class Rough {
//    public static void main(String[] args) {
//
////        myName name = new b();
////
////        System.out.println(myName.isAdd(2, 3));
//        Krushna k = new c();
//        k.myName();
//
//
//    }
//}
//abstract class Krushna{
//
//
//    abstract void  myName();
//
//}
//class c extends Krushna{
//
//    public void myName(){
//        System.out.println("");
//    }
//
//}
//
//
//




//
//
//class A{
//  private static int isAdd(int a , int b){
//        return a + b;
//    }
//    public void name(){
//        System.out.println("Hello");
//    }
//}
//class B extends A{
//        public static int isAdd(int a , int b){
//            return a + b;
//        }
//
//        @Override
//    public void name(){
//        System.out.println("Hello");
//    }
//
//}
//
//
//public class Rough {
//    public static void main(String[] args){
//
//
//         B b = new B();
//         System.out.println(b.isAdd(2,3));
//b.name();
//
//
//
//    }
//}
//
//
//

//    public class Rough{
//    public static void main(String[] args){
//
//        for(int i = 0; i <=1000; i++){
//            System.out.println("Patil "+ i*2-5);
//        }
//    }
//}
//
//
//



//
//
//public class Rough {
//    static void main() {
//
//
//
//       // String[] arr = {"O","N","K","A","R"};
//int[] arr ={1,2,3,4,5,6,7};
//        int start = 0;
//        int end = arr.length-1;
//
//
//        while (start < end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//
//             start = start+1;
//             end = end - 1 ;
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//
//
//    }
//}
//
//
//public class Rough {
//    public static void main(String[] args){
//
//
//        int n = 5;
//
//
//        for (int i = 1; i <= n ; i++) {
//
//
//            for (int j = 1; j <= n; j++) {
//
//                if ( i == 1|| i == 5|| j == 1 || j == 5 ) {
//                    System.out.print(" * ");
//                }else {
//                    System.out.print("   ");
//                }
//
//            }
//            System.out.println();
//
//        }
//
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
//public class Rough {
//    static void main() {
//
//
//
//
//
//
//         int n = 5;
//
//
//        for (int i = 1; i <= n ; i++) {
//
//
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= 2 *(n - i) ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }
//
//
//        for (int i = n; i >= 1 ; i--) {
//
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= 2 *(n - i) ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }
//
//
//
//        }
//    }
//
//
//
//
//





//

//public class Rough {
//   public   static void main(String[] args) {
//        System.out.println("onkar");
//    }
//}
//
//
//




//
///  delete element in the array.
///  insert element in the array.
///  if we have time print all patterns
//
//
//


//
//public class Rough {
//    public static  void main(String[] args){
//
//        String text = "public  locate where is am 'loca te' ok ";
//        System.out.println(text.indexOf("locate"));
//
//
//    }
//}




/// GCD = hcf
///  lcm


//
//public class Rough {
//    public static  void main(String[] args){
//
//        int num1 = 12;
//        int num2 = 16;
//int gcd = 0;
//
//
//        for (int i = 1; i <= Math.min(num1,num2) ; i++) {
//            if (num1 % i == 0 && num2 % i == 0){
//            gcd = i;
//
//            }
//        }
//        int lcm = (num1 * num2)/gcd;
//        System.out.println(lcm);
//
//    }
//}
//
//









