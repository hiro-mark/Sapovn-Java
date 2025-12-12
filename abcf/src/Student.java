public class Student {
    String studentName;
    int studentAge;
    double studentScore;
    public Student(String name, int age, double scoreOne, double scoreTwo) {
        studentName = name;
        studentAge = age;
        studentScore = (scoreOne + scoreTwo)/2;
    }
    public static void main(String[] args) {
        System.out.println("a");
        Student leVietAnh = new Student("Le Viet Anh", 17, 90.22, 92.17);
        System.out.println("Name: " + leVietAnh.studentName);
        System.out.println("Age: " + leVietAnh.studentAge);
        System.out.println("Score: " + leVietAnh.studentScore);
    }
}