import java.io.File;
import java.util.Scanner;

public class CheckFileOrDir {
    public static void main(String[] args) {
System.out.println("Himanshu Saini-24csu350");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path: ");
        String path = sc.nextLine();
        File f = new File(path);

        if (!f.exists())
            System.out.println("Path does not exist.");
        else if (f.isFile())
            System.out.println("It is a file.");
        else if (f.isDirectory())
            System.out.println("It is a directory.");
        else
            System.out.println("Unknown type.");
    }
}
