import java.util.HashMap;

public class HashMapExercise {
    public static void main(String[] args){
        HashMap<String, String> itemAndCategory = new HashMap<>();
        itemAndCategory.put("Nissan Maxima GT 2025 Edition", "Sports cars");
        itemAndCategory.put("Basketball", "Leisure");
        itemAndCategory.put("Test tube", "Chemistry");
        itemAndCategory.remove("Test tube");
        itemAndCategory.put("Test tube", "Laboratory");
        itemAndCategory.put("iPhone 17 Pro Max", "Mobile phones");
        itemAndCategory.put("Samsung Smart Refrigerator", "Kitchen");
        System.out.println(itemAndCategory);
        System.out.println("The test tube belongs to the " + itemAndCategory.get("Test tube") + " section");
    }
}
