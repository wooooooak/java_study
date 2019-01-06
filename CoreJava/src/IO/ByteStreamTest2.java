package IO;

import java.io.*;

public class ByteStreamTest2 {
    public static void main(String[] args) throws Exception{
        File dir = new File("./file_test");
        File file = new File(dir, "zzz2.txt");
        if (!file.exists()) file.createNewFile();

        int x = 100;
        int y = 200;
        DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
        out.writeInt(x);
        out.writeInt(y);
        out.close();

        DataInputStream in = new DataInputStream(new FileInputStream(file));
        int x1 = in.readInt();
        int x2 = in.readInt();
        in.close();

        System.out.println(x1);
        System.out.println(x2);
    }
}
