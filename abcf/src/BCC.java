public class BCC {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;
        while (a<=10) {
            if (b<=10) {
                c = a * b;
                System.out.println(c);
                b++;
            }
            else {
                b = 1;
                a++;
                System.out.println("Bảng cửu chương cho " + (a-1) + " bên trên");
            }
        }
    }
}
