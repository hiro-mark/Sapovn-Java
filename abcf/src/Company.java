class Employee{
    public void welcome() {
        System.out.println("Welcome to company X");
    }
    public void code(){
        ;
    }
    public void design(){
        ;
    }
}
class Developer extends Employee {
    public void welcome(){
        System.out.print("Chris is an employee at company X");
    }
    public void code(){
        System.out.println(", as well as a developer");
    }
}
class Designer extends Employee{
    public void welcome(){
        System.out.print("Peter is a designer at Company X");
    }
    public void design(){
        System.out.println(", as well as a designer");
    }
}

public class Company {
    public static void main(String[] args) {
        Employee Boss = new Employee();
        Employee Chris = new Developer();
        Employee Peter = new Designer();
        Boss.welcome();
        Chris.welcome();
        Chris.code();
        Peter.welcome();
        Peter.design();
    }
}

