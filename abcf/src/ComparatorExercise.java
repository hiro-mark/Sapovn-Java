import java.util.ArrayList;

class shopItems {
    public String name;
    public int price;

    public shopItems(String n, int p) {
        name = n;
        price = p;
    }
}

public class ComparatorExercise {

    public static void main(String[] args) {
        ArrayList<shopItems> myShopItems = new ArrayList<shopItems>();
        myShopItems.add(new shopItems("Apple iPhone 17 Pro Max at 2TB Storage", 2000));
        System.out.println(myShopItems);
    }
}
