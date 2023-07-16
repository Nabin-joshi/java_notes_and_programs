package File;
import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
//        create new file in java
        File file = new File("/home/hunter420/Desktop/Java/Lab/src/File/file.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File created");
            }
            else {
                System.out.println("File already exists");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        //    Rename file
        File newFile = new File("/home/hunter420/Desktop/Java/Lab/src/File/text.txt");
        boolean status = false;
        if (file.exists()) {
            status = file.renameTo(newFile);
        } else {
            System.out.println("File not found");

        }
        if (status){
            System.out.println("File rename sucessfully");

        }

    }



}
