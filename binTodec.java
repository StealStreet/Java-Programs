import java.util.Scanner;

public class binTodec {
    public static int binToDec(int num) {
        int pow = 0;
        int decimal = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            num /= 10;
        }
        return decimal;
    }
    

    public static void main(String[] args) {
        System.out.print("Enter a binary number : ");
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();

        int num = binToDec(binary);
        System.out.println(num);
    }
}
