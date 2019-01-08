package FileRecursion;
import java.io.File;

public class Recursion {
    static void readFile(File dir) {
        if(dir.isFile()) {
            System.out.println("here : " + dir.getName());
        }else if (dir.isDirectory()) {
            for (File file: dir.listFiles()) {
                readFile(file);
            }
        }
    }

    public static void main(String[] args) {
        File files  = new File("./file_test");
        readFile(files);
    }
}
