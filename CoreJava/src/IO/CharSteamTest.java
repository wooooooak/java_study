package IO;

import java.io.*;

public class CharSteamTest {
    public static void main(String[] args) throws Exception {
        File dir = new File("./file_test");
        File file = new File(dir, "yyy.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        out.println("안녕하세요.");
        out.println("이용준입니다.");
        out.println("반갑습니다.");
        out.close();

        BufferedReader in = new BufferedReader(new FileReader(file));
        while(true) {
            String data = in.readLine();
            if(data == null) break;
            System.out.println(data);
        }
        in.close();
    }
}
