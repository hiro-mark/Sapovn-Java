public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println("1");
        int c;
        for (int count = 0; count<20;count++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }
    }

}
