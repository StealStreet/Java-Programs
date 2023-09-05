package Pattern_2;

public class Triangle_0_1 {

    public static void Triangle_0_1(int n) {

        // int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (i+1); j++) {
                System.out.print((i + j)%2);
                // num ++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Triangle_0_1(4);
    }
}
