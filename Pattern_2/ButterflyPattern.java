package Pattern_2;

public class ButterflyPattern {

    public static void Butterfly(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // first stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces 
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // second stars 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // second half 
        for (int i = n; i >= 1; i--) {
            // first stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces 
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // second stars 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Butterfly(4);
    }
}
