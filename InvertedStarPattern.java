public class InvertedStarPattern {
    public static void main(String[] args) {
        
        // method 1
        // for (int lines = 1; lines <= 4; lines ++)
        // {
        //     for (int stars = 4; stars >= lines; stars --)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // method 2
        int n = 6;
        for (int lines = 1; lines <= n; lines ++)
        {
            for (int stars = 1; stars <= (n - lines + 1); stars ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
