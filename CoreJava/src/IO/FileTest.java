package IO;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        String dir = "./";
        System.out.println(dir);

        File file_dir = new File(dir);
        File file_01 = new File(file_dir, "abc.txt");
        if (!file_01.exists()) {
            try {
                file_01.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String[] list = file_dir.list();
        for (String i : list) {
            System.out.println(i);
        }
    }
}
