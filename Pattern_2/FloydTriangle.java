package Pattern_2;

public class FloydTriangle {

    public static void FloydTriangle(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                sum ++;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FloydTriangle(4);
    }
}
