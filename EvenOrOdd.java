import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number :: ");
        n = sc.nextInt();

        // ternary operator
        String cond = (n % 2 == 0)? "even" : "odd";
        
        System.out.println(n + " is an " + cond + " number");
    }
}
