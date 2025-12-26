public class MethodOverloading {
    static int methodOverloader(int x, int y) {
        return x + y;
    }

    static double methodOverloader(double x, double y) {
        return x + y;
    }

    static String methodOverloader(String x, String y){
        return x + y;
    }


    public static void main(String[] args) {
        int myInt = methodOverloader(6, 7);
        double myDouble = methodOverloader(666, 777);
        String myString = methodOverloader("This is the ", "method overloading concept.");
        System.out.println("int: " + myInt);
        System.out.println("double: " + myDouble);
        System.out.println("string: " + myString);
    }
}
