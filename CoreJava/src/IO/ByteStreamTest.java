package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamTest {
    public static void main(String[] args) throws Exception{
        File dir = new File("./file_test");
        File file = new File(dir, "zzz.txt");
        if (!file.exists()) file.createNewFile();

        byte[] data = "hello java!".getBytes();
        FileOutputStream out = new FileOutputStream(file);
        out.write(data);
        out.close();

        byte[] data2 = new byte[10];
        FileInputStream in = new FileInputStream(file);
        in.read(data2, 0, 5);
        in.close();

        for (byte dataByte :
                data2) {
            System.out.print((char)dataByte);
        }
    }
}
