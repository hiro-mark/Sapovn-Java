class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE } // I am defining enum
    FreshJuiceSize size; // so because enum is defined size is declared
}

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice(); // the class is FreshJuice and declaring juice, but what is new? --> it defines object
        juice.size = FreshJuice. FreshJuiceSize.SMALL ;
        /*
         * both size and juice is inside freshjuice but size is null.
         * SMALL/MEDIUM/LARGE is inside of FreshJuiceSize and that is also inside of FreshJuice class.
         */
        System.out.println("Size: " + juice.size); // self explanatory
    }
// Now i understand a bit more about Java
}