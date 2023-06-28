import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
    public static void main(String[] args) throws IOException {

//        mostly three ways to write in file fileWriter
//        bufferedWriter
//        printWriter

        try{
            File file = new File("writeTest.txt");
            file.createNewFile();
            FileWriter fw = new FileWriter("writeTest.txt");
            try{
//                file not found exception
                fw.write("String data sdasasasasasas asasasasasas");
                fw.write("next line");
                fw.write("अस्ब्ज्कस ज्ज्कस्ब्कस्क ");
                System.out.println(fw.getEncoding());
                System.out.println(fw.hashCode());
//                In Java, the flush() method is used to flush the contents of a writer's buffer and ensure that any buffered data is immediately written to the underlying file or output stream.
               fw.flush();
            }finally {
                fw.close();
            }
            System.out.println("File has written");
        }catch (IOException e){
            throw e;
        }
    }
}
