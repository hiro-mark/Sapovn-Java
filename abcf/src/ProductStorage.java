import java.util.HashMap;
import java.util.Map;

public class ProductStorage {
    public static void main(String[] args) {
        Map<String, Integer> productStorage = new HashMap<>();
        productStorage.put("iPhone 17 Pro Max", 12);
        productStorage.put("ROG Zephyrus G16 GU606AX-TB008X", 3);
        productStorage.put("Samsung Odyssey G9 Monitor", 0);
        productStorage.put("Samsung Galaxy S26 Ultra", 20);
        productStorage.put("LG TV G6 OLED 2026 Edition", 0);
        productStorage.put("Dubai Chocolate Bar", 142);
        productStorage.put("Apple MacBook M5 Ultra with 8TB storage", 10);
        productStorage.put("PlayStation 6, console included", 0);
        productStorage.put("Chef's Gordon Ramsay exclusive recipes", 0);
        String productIsAvailable = productStorage.entrySet().stream()
                .reduce(
                        "",
                        (acc, e) -> e.getValue() > 0
                    ? acc + e.getKey() + ": " + e.getValue() + " left \n"
                        : acc,
                        String::concat);
        System.out.println("Available products: ");
        System.out.println(productIsAvailable);
        String productOutOfStock = productStorage.entrySet().stream()
                .reduce(
                        "",
                        (acc, e) -> e.getValue() <= 0
                                ? acc + e.getKey() + "\n"
                                : acc,
                        String::concat);
        System.out.println("Out of stock products: ");
        System.out.println(productOutOfStock);
    }
}
