public class Four {
    public static void main(String[] args) {
/*
* String stores text
* int stores integer
* float stores decimals/FPNs
* char stores characters (single quotes)
* boolean stores 0/1
* Identifiers cannot start with a digit, contain spaces nor use reserved keywords
 */
        String name = "Mark";
        System.out.println(name);
        int Num = 16; // Declare final int if it is read-only, also same as defining constant
        System.out.println(Num);
        int num;
        num = 17;
        System.out.println(num);
        float Year = 78/365f;
        System.out.println(Year);
        char Rating = 'A';
        System.out.println(Rating);

        System.out.println(name + " is " + Num + " this year and will turn " + num + " next year, but he has to wait for " + Year + " years left");
        System.out.println(name + " has an " + Rating + " rating");
    }
}
