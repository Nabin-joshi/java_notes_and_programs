import java.io.File;
import java.io.IOException;

public class fileInfo {
    public static void main(String[] args)  {
        File file = new File("text.txt");

        if(file.exists()){
            System.out.println("file Name" + file.getName());
            System.out.println("File Location" + file.getAbsolutePath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.length());
        }else {
            System.out.println("File not found");
        }

    }
}
