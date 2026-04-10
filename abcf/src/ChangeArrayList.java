import java.util.ArrayList;

public class ChangeArrayList {
    static void update(ArrayList<Integer> e){
        e.add(6);
        e.remove(1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
        System.out.println(elements);
        update(elements);
        System.out.println(elements);
    }
}
