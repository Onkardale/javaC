package NUMBERS;
public class DiamondPattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {

            int spaces = i <= n ? n - i : i - n;
            int stars  = i <= n ? 2 * i - 1 : 2 * (2 * n - i) - 1;

            // Space loop
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Star loop
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}