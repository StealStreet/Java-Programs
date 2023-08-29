public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(a+b);

        int c = 10;
        float d = 20.53f;
        long e = 35;
        double f = 30;
        double ans = c + d + e + f;
        System.out.println(ans);

        byte g = 5;
        g = (byte)(g*2);
        System.out.println(g);

    }
}
