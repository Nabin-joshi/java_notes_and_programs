import java.io.*;
import java.util.zip.*;

 class ZipFile {
    public static void main(String[] args) {
        String sourceFile = "text.txt";
        String zipFile = "compressed.zip";

        // Create a ZIP file
        try (FileOutputStream fos = new FileOutputStream(zipFile);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            // Add the source file to the ZIP file
            File fileToZip = new File(sourceFile);
            addToZip(fileToZip, fileToZip.getName(), zos);

            System.out.println("File successfully compressed!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data from the ZIP file
        try (FileInputStream fis = new FileInputStream(zipFile);
             ZipInputStream zis = new ZipInputStream(fis)) {

            // Iterate through each entry in the ZIP file
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                // Extract the entry
                String entryName = entry.getName();
                System.out.println("Extracting: " + entryName);

                // Read the entry's data
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    baos.write(buffer, 0, len);
                }

                // Print the entry's data
                System.out.println(baos.toString());
            }

            System.out.println("File successfully extracted!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addToZip(File fileToZip, String fileName, ZipOutputStream zos) throws IOException {
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zos.putNextEntry(zipEntry);

        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) > 0) {
            zos.write(buffer, 0, len);
        }

        fis.close();
        zos.closeEntry();
    }
}
