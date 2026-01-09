import java.util.Scanner;
public class TryAndCatch {
    public static void enterInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập một số nguyên: ");int number = sc.nextInt();
    }
     public static void main(String[] args){
         while (true) {
             try {
                 enterInteger();
                 System.out.println("Cảm ơn bạn đã nhập một số nguyên.");
                 break;
             }
             catch (Exception e){
                 System.out.println("Bạn không nhập một số nguyên!");
            }
         }
     }
}
