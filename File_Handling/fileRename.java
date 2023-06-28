import java.io.File;
import java.io.IOException;

public class fileRename {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        file.createNewFile();
        File newFile = new File("rename.txt");
        if(file.exists()){
            file.renameTo(newFile);
        }else {
            System.out.println("File not found");
        }

    }
}
