import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) throws IOException {
//        if throws IOEcewption JVM will handel it because it is a caller of main method
        FileReader fr = new FileReader("C:\\Users\\nabin\\OneDrive\\Desktop\\Java\\File_Handling\\write.txt");
        if(fr.ready()){
            int data;
            while ((data = fr.read()) != -1) {
//                this will return the integer value of the given data
//                and read single char by char
                System.out.print((char) data);
//                System.out.println(data);
            }
            fr.close();

        }

    }
}
