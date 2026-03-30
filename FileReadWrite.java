import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {

        try {
            // Writing to file
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello Java File Handling");
            fw.close();

            // Reading from file
            FileReader fr = new FileReader("sample.txt");
            int ch;

            System.out.println("File Content:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}