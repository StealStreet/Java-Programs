package Pattern_2;

public class invertedPyramidWithNumbers {

    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 0; i < n; i++) {
        
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j + " ");
            }

            // for (int j = 1; j <= )
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        inverted_rotated_half_pyramid(5);
    }
}
