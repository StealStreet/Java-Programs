public class LargestOfThree {
    public static void main(String[] args) {
        int a = 6, b = 2, c = 5;

        if (a >= b && a >= c)
        {
            System.out.println(a);
        }
        else if (b >= c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}
