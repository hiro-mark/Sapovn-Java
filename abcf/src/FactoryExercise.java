public class FactoryExercise {
    interface Example {
        void send(String message);
    }

    class ExampleA implements Example {
            public void send(String message) {
                System.out.println("A says " + message);
        }
    }
    class ExampleB implements Example{
        public void send(String message){
            System.out.println("B says " + message);
        }
    }
    public Example createExample(String type){
        if (type.equals("a")){
            return new ExampleA();
        }
        else if (type.equals("b")){
            return new ExampleB();
        }
        else{
            throw new IllegalArgumentException("Invalid type");
        }
    }

    public static void main(String[] args) {
        FactoryExercise ex = new FactoryExercise();
        try {
            Example A = ex.createExample("a");
            A.send("hello");
            Example B = ex.createExample("b");
            B.send("hi");
            Example C = ex.createExample("c");
            C.send("hey");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
