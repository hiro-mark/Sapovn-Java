import java.io.File;
class FileHandler{
    public FileHandler(String fileName){
        long start = System.nanoTime();
        File myFile = new File(fileName);
        if (myFile.exists()){
            System.out.println();
            System.out.println("File: " + myFile.getName());
            System.out.println("Path: " + myFile.getAbsolutePath());
            System.out.println("Space: " + myFile.length());
            System.out.println("Read: " + myFile.canRead());
            System.out.println("Write: " + myFile.canWrite());
            System.out.println("File loaded");
            long end = System.nanoTime();
            long duration = end - start;
            System.out.println("Time taken: " + duration + "ns");
        }
        else{
            System.out.println("File doesn't exist");
            long end = System.nanoTime();
        }
    }
}
public class FileUploadExercise {
    public static void main(String[] args) {
        new FileHandler("startup.txt");
        new FileHandler("filejava.txt");
        new FileHandler("filetwo.txt");
        new FileHandler("filethree.txt");
    }
}
