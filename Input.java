
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name? ");
        String input = sc.nextLine();
        System.out.println(input);
    }
}