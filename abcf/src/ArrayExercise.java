import java.util.ArrayList;

public class ArrayExercise {
    public static void main(String[] args){
        ArrayList<String> laptops = new ArrayList<String>();
        laptops.add("ROG Zephyrus G14 2025 Edition OLED");
        laptops.add("ASUS ROG PC 4090 Founder's Edition");
        laptops.add("Dell G series 15inch 3070 Ti");
        laptops.add("Lenovo Legion Y9000P Ryzen 9 8945HS with 380Hz");
        laptops.remove(1);
        System.out.println(laptops);
        System.out.println("Best seller: " + laptops.get(2));
    }
}
