import java.util.Scanner; //I used scanner and then I thought how simple python was
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // I need to compare between nextInt, nextLine,...

        System.out.print("Nhập cân nặng của bạn (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Nhập chiều cao của bạn (m): ");
        double height = sc.nextDouble();


        double result = weight / (height * height);
        System.out.println("BMI của bạn là: " + result);
        if (result < 18.5) {
            System.out.println("Bạn đang thiếu cân!");
        }
        else if (result > 25.0) {
            System.out.println("Bạn đang thừa cân!");
        }
        else {
            System.out.println("Bạn khoẻ!");
        }
        // Close the scanner
        sc.close();
    }
}
