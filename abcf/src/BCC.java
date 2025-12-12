public class BCC {
    public static void main(String[] args) {
        int a;
        int b;
        for (a = 1; a <= 10; a++) {
            System.out.println("Bang cuu chuong cho " + a + " la");
            for (b = 1; b <= 10; b++) {
                System.out.println(a*b);
            }
            b = 1;
        }
    }
}
