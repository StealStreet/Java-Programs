public class SwitchStatement {
    public static void main(String[] args) {
        char ch = 'a';
        switch (ch){
            case 'b'  : System.out.println("Burger..");
            break;
            case 'c' : System.out.println("Pizza..");
            break;
            case 'a' : System.out.println("Hot Dog..");
            break;
            default : System.out.println("We wake up..");
        }
    }
}
