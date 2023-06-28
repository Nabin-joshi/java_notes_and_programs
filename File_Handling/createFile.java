import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        System.out.println(file.exists());
        file.createNewFile();

        if(file.exists()){
            System.out.println("File exists");
        }else {
            System.out.println("file not created");
        }
    }
}
