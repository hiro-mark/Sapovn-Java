import java.util.Random;

class threadTask extends Thread {
    private int task;

    threadTask(int task) {
        this.task = task;
    }


    public void run() {
        System.out.println(Thread.currentThread().getName() + " number: " + task + " Ran");
    }
}
public class ThreadExercise {
    public static void main(String[] args) {
        Random rand = new Random();
        Thread t1 = new threadTask(rand.nextInt(100) * 2);
        Thread t2 = new threadTask(rand.nextInt(100) * 2 + 1);
        t1.start();
        t2.start();
    }
}
