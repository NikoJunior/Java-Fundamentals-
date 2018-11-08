import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        String resourceFolder = "C:\\Users\\Niko\\IdeaProjects\\InputOutputFilesDirectories\\src\\Resources\\";

        FootBallPlayer player = new FootBallPlayer("Christiano Ronaldo", 32, "Real Madrid", 12);

        String serializableObjectPath = resourceFolder + "object.ser";
        try (FileOutputStream fos = new FileOutputStream(serializableObjectPath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(player);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
