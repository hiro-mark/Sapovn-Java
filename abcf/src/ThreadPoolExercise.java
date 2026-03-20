import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class FileHandlerTask implements Runnable {
    private String fileName;
    public FileHandlerTask(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void run(){
        long start = System.nanoTime();
        File myFile = new File(fileName);
        if (myFile.exists()){
            System.out.println();
            System.out.println(myFile.getName() + " Loaded");
            long end = System.nanoTime();
            long duration = end - start;
            System.out.println("Time taken: " + duration + "ns for " + fileName);
        }
        else{
            System.out.println("File doesn't exist");
            long end = System.nanoTime();
        }
    }
}
public class ThreadPoolExercise {
    public static void main(String[] args) {
        new FileHandlerTask("startup.txt");
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(new FileHandlerTask("filejava.txt"));
        pool.execute(new FileHandlerTask("filetwo.txt"));
        pool.execute(new FileHandlerTask("filethree.txt"));
        pool.shutdown();
    }
}
