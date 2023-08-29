import java.util.Scanner;


public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's a? ");
        int a  = sc.nextInt();
        System.out.print("What's b? ");
        int b = sc.nextInt();

        System.out.println(a * b);
    }
}
