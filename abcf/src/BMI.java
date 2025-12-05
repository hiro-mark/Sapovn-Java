import java.util.Scanner; //I used scanner and then I thought how simple python was
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // I need to compare between nextInt, nextLine,...

        System.out.print("Nhập cân nặng của bạn: ");
        double weight = sc.nextDouble();

        System.out.print("Nhập chiều cao của bạn: ");
        double height = sc.nextDouble();


        double result = weight / (height * height);
        System.out.println("BMI của bạn là: " + result);
        // Close the scanner
        sc.close();
    }
}
