import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipFileExample {
    public static void main(String[] args) throws IOException {
        String zipFilePath = "C:\\Users\\nabin\\OneDrive\\Desktop\\Java\\File_Handling\\test.zip";
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry entry;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                String fileName = entry.getName();
                FileOutputStream fileOutputStream = new FileOutputStream(fileName);

                int data;
                while ((data = zipInputStream.read()) != -1) {
                    System.out.println(data);
                    fileOutputStream.write(data);
                }


                fileOutputStream.close();
                zipInputStream.closeEntry();
                System.out.println("Extracted: " + fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
