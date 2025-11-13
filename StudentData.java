import java.io.*;

public class StudentData {
    public static void main(String[] args) throws IOException {
System.out.println("Himanshu Saini-24csu350");
        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
        bw.write("1 Rahul 8.5 A");
        bw.newLine();
        bw.write("2 Sneha 9.2 A+");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }
}
