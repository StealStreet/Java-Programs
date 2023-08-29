import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Integer :: ");
        int a  = sc.nextInt();
        System.out.print("Enter Second Integer :: ");
        int b = sc.nextInt();
        System.out.print("Enter Operator :: ");
        char Operator = sc.next().charAt(0);

        switch (Operator)
        {
            case '+' : System.out.println(a + b);
            break;
            case '-' : System.out.println(a - b);
            break; 
            case '*' : System.out.println(a * b);
            break;
            case '/' : System.out.println(a / b);
            break;
            case '%' : System.out.println(a % b);
            break;
            default : System.out.println("Calculator isn't that advanced...");
        }

    }
}
