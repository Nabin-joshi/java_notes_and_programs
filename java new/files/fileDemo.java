package files;

import java.io.File;

public class fileDemo {
    public static void main(String[] args) {
        File f = new File("C:\\name.txt");
        if (f.exists()){
            System.out.println("can Read" + f.canRead());
            System.out.println(f.length());
        }else {
            System.out.println("File Not Found");
        }
    }
}
