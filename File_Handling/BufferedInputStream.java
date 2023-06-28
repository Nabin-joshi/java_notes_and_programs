import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

 class BufferedInoutStream {
    public static void main(String[] args) {
        String sourceFile = "text.txt";
        String destinationFile = "destination.txt";

        try {
            // Create an InputStream (e.g., FileInputStream)
            InputStream inputStream = new FileInputStream(sourceFile);


            // Create a BufferedInputStream for efficient reading
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            // Create an OutputStream (e.g., FileOutputStream)
            OutputStream outputStream = new FileOutputStream(destinationFile);

            // Create a BufferedOutputStream for efficient writing
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

            // Read from the BufferedInputStream and write to the BufferedOutputStream
            int data;
            while ((data = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(data);
            }

            // Flush the buffered output stream
            bufferedOutputStream.flush();

            // Close the streams
            bufferedInputStream.close();
            bufferedOutputStream.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
