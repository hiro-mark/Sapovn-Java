import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ComparatorExercise {

    public static void main(String[] args) {
        Map<String, Integer> shopItems = new HashMap<String, Integer>();
        shopItems.put("iPhone 18 Pro Max base", 1799);
        shopItems.put("DELL Alienware U96420G59", 4699);
        shopItems.put("TV LG G6 OLED", 2499);
        shopItems.put("Red Dragons playing cards", 2);
        shopItems.put("Hershey's Chocolate", 4);
        shopItems.put("Samsung S26 Ultra", 1399);
        shopItems.put("Asus ROG Strix SCAR 17 (G733PY-XS96)", 1800);
        shopItems.put("Odyssey G9 Monitor", 899);
        shopItems.put("Bicycle Playing Cards Virts Moments edition", 13);
        shopItems.put("Feastables Chocolate", 11);
        shopItems.put("Feastables Chocolate", 11);
        System.out.println("Welcome to shop");
        Map <String, Integer> shopAlphabetical = shopItems.entrySet().stream().sorted(
                Map.Entry.<String, Integer>comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        System.out.println("Items sorted by ascending value:");
        shopAlphabetical.forEach((key, value) -> System.out.println("Item: " + key + ", price: $" + value));
        Map <String, Integer> shopValue = shopItems.entrySet().stream().sorted(
                        Map.Entry.<String, Integer>comparingByKey()).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        System.out.println();
        System.out.println("Items sorted by alphabetical order:");
        shopValue.forEach((key, value) -> System.out.println("Item: " + key + ", price: $" + value));
        Map <String, Integer> overLimit = shopItems.entrySet().stream()
                .filter(e -> e.getValue() > 100)
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        System.out.println();
        System.out.println("Items sorted by value over $100: ");
        overLimit.forEach((key, value) -> System.out.println("Item: " + key + ", price: $" + value));
    }
}
