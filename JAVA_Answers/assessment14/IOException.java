import java.io.FileWriter;
import java.io.IOException;

public class IOException {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("./file.txt");  // Generates IOException
        writer.write("Hello, World!");
        writer.close();
    }
}
