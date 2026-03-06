import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingExercise {
    public static void main(String[] args) {
        Map<String, String> productStorage = new HashMap<>();
        productStorage.put("iPhone 17 Pro Max", "Electronic Devices");
        productStorage.put("ROG Zephyrus G16 GU606AX-TB008X", "Electronic Devices");
        productStorage.put("Samsung Odyssey G9 Monitor", "Household Appliances");
        productStorage.put("Samsung Galaxy S26 Ultra", "Electronic Devices");
        productStorage.put("LG TV G6 OLED 2026 Edition", "Household Appliances");
        productStorage.put("Dubai Chocolate Bar", "Consumables");
        productStorage.put("Apple MacBook M5 Ultra with 8TB storage", "Electronic Devices");
        productStorage.put("PlayStation 6, console included", "Electronic Devices");
        productStorage.put("Chef's Gordon Ramsay exclusive recipes", "Books");
        productStorage.put("Lays Chip Combo Edition", "Consumables");
        productStorage.put("Atomic Habits", "Books");
        productStorage.put("History of homo sapiens", "Books");
        Map<String, List<String>> productCategories = productStorage.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        for (Map.Entry<String, List<String>> entry : productCategories.entrySet()) {
            System.out.println(entry.getKey() + ": " + String.join(", ", entry.getValue()));
        }
}}
