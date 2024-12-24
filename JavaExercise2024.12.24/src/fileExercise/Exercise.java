package fileExercise;

import java.io.*;

public class Exercise {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\test.txt");
        File file2 = new File("src\\hello.txt");
        File file3 = new File("C:\\Is not System\\Codes\\JavaExerciseImprove\\JavaExercise2024.12.24");
        /*if (file3.isDirectory()) {
            FilenameFilter filenameFilter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    File tempFile = new File(dir, name);
                    return tempFile.getName().endsWith(".java");
                }
            };
            String[] list = file3.list(filenameFilter);
            for (String s : list) {
                System.out.println(s);
            }
        }*/

        File file = new File("C:\\Is not System\\Codes\\JavaExerciseImprove\\JavaExercise2024.12.24\\src\\fileExercise\\test.txt");
        InputStream inputStream = new FileInputStream(file);
        int b = 0;
        while (b != -1) {
            b = inputStream.read();
            System.out.print((char)b);
        }

        OutputStream outputStream = new FileOutputStream(file, true);
        String s = "吴振博";
        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            outputStream.write(aByte);
        }

        File copyFile = new File("C:\\Is not System\\Codes\\JavaExerciseImprove\\JavaExercise2024.12.24\\src\\fileExercise\\copy.txt");
        boolean exists = copyFile.exists();
        if (!exists) {
            copyFile.createNewFile();
        }
        InputStream inputStream1 = new FileInputStream(file);
        OutputStream copy = new FileOutputStream(copyFile, true);
        long start = System.currentTimeMillis();
        int by = 0;
        while (by != -1) {
            b = inputStream1.read();
            copy.write(b);
        }
    }
}
