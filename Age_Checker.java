import java.util.Scanner;

public class Age_Checker {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.print("Type your age :: ");
        age = sc.nextInt();

        if (age >= 18)
        {
            System.out.println("adult : drive, vote");
        }
        else if  (age >= 13 && age < 18)
        {
            System.out.println("teenager..");
        }
        else
        {
            System.out.println("child");
        }
    }
}
  