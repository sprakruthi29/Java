import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) {

            System.out.println("File Exists: Yes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());

            if (file.isFile())
                System.out.println("Type: File");
            else if (file.isDirectory())
                System.out.println("Type: Directory");

            System.out.println("Length: " + file.length() + " bytes");

        } else {
            System.out.println("File does not exist.");
        }

        sc.close();
    }
}