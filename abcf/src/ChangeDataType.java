class Students{
    int score;
}

public class ChangeDataType {
    static void update(Students s) {
        s = new Students();
        s.score = 100;
    }
    public static void main(String[] args) {
        Students st = new Students();
        st.score = 50;
        System.out.println(st.score);
        update(st);
        System.out.println(st.score);
    }
}

