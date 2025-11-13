import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
System.out.println("Himanshu Saini-24csu350");
        FileWriter fw = new FileWriter("data.txt");
        fw.write("Hello Java File Handling!");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        System.out.println(br.readLine());
        br.close();
    }
}
