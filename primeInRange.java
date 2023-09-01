import java.util.Scanner;

public class primeInRange {

    public static boolean Prime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (Prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a range for prime number : ");
        Scanner sc = new Scanner(System.in);
        int primeNumber = sc.nextInt();
        primeRange(primeNumber);
        
    }
}
