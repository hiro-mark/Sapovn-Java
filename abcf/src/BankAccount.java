import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon withdraw hay deposit? (W/D): ");
        String response = sc.nextLine();
        if (response == "W") {
            System.out.println("Ban muon withdraw bao nhieu: ");
            int withdraw = sc.nextInt();
            balance = balance - withdraw;
        }

    }
}
