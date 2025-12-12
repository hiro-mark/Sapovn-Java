public class Four {
    public static void main(String[] args) {
/*
* String stores text
* int stores integer
* float stores decimals/FPNs
* char stores characters (single quotes)
* boolean stores false/true
* Identifiers cannot start with a digit, contain spaces nor use reserved keywords
 */
        String name = "Mark";
        System.out.println(name);
        int myAge = 16; // Declare final int if it is read-only, also same as defining constant
        System.out.println(myAge);
        int nextAge;
        nextAge = 17;
        System.out.println(nextAge);
        float yearsLeft = 78/365f;
        System.out.println(yearsLeft);
        char classRating = 'A';
        System.out.println(classRating);

        System.out.println(name + " is " + myAge + " this year and will turn " + nextAge + " next year, but he has to wait for " + yearsLeft + " years left");
        System.out.println(name + " has an " + classRating + " rating");
    }
}
