import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        float area = (3.14f * radius * radius);
        System.out.println(area);

    }
}
