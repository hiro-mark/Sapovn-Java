import java.util.Scanner;
import java.util.logging.Logger;

public class BankAccount {
    public static void main(String[] args){
        Balance balance = new Balance();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon withdraw hay deposit? (W/D): ");
        String response = sc.nextLine();

        while (true){
            if (response.equals("W")) {
                System.out.print("Ban muon withdraw bao nhieu: ");
                int withdraw = sc.nextInt();
                balance.setUserBalance(balance.getUserBalance() - withdraw);
                response = "U";
                System.out.println("Hien tai ban co: " + balance.getUserBalance());
                sc.nextLine();
                if (balance.getUserBalance() < 0) {
                    System.out.println("Chuc mung ban da pha san");
                    break;
                }
            }
            else if (response.equals("D")) {
                System.out.print("Ban muon deposit bao nhieu: ");
                int deposit = sc.nextInt();
                balance.setUserBalance(balance.getUserBalance() + deposit);
                response = "U";
                System.out.println("Hien tai ban co: " + balance.getUserBalance());
                sc.nextLine();
            }
            else {
                System.out.print("Ban muon withdraw hay deposit? (W/D): ");
                response = sc.nextLine();
            }
        }
        sc.close();
    }
}
