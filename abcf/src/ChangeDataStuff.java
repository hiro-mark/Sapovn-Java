public class ChangeDataStuff {
    static class Student{
        int score;
    }
    static void update(Student s) {
        s.score = 100;
    }
    public static void main(String[] args) {
        Student st = new Student();
        st.score = 50;
        System.out.println(st.score);
        update(st);
        System.out.println(st.score);
    }
}
