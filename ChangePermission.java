import java.io.File;

public class ChangePermission {
    public static void main(String[] args) {
System.out.println("Himanshu Saini-24csu350");
        File f = new File("test.txt"); // your file name here
        if (f.exists()) {
            f.setReadable(true);
            f.setWritable(true);
            f.setExecutable(true);
            System.out.println("Permissions changed successfully.");
        } else {
            System.out.println("File not found.");
        }
    }
}
