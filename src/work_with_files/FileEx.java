package work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        File folder = new File("C:\\Users\\potin\\OneDrive\\Desktop\\A");
        File file1 = new File("C:\\Users\\potin\\OneDrive\\Desktop\\A\\test2.txt");
        File folder1 = new File("C:\\Users\\potin\\OneDrive\\Desktop\\B");

        System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());
        System.out.println("folder.getAbsoluteFile() = " + folder.getAbsoluteFile());
        System.out.println("---------------------------------------------------");

        System.out.println("file.isAbsolute() = " + file.isAbsolute());
        System.out.println("folder.isAbsolute() = " + folder.isAbsolute());
        System.out.println("---------------------------------------------------");

        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("folder.isDirectory() = " + folder.isDirectory());
        System.out.println("---------------------------------------------------");

        System.out.println("file.exists() = " + file.exists());
        System.out.println("folder.exists() = " + folder.exists());
        System.out.println("file1.exists() = " + file1.exists());
        System.out.println("folder1.exists() = " + folder1.exists());
        System.out.println("---------------------------------------------------");

        System.out.println("file1.createNewFile() = " + file1.createNewFile());
        System.out.println("folder1.mkdir() = " + folder1.mkdir());
        System.out.println("---------------------------------------------------");

        System.out.println("file1.length() = " + file1.length());
        System.out.println("folder.length() = " + folder.length());
        System.out.println("---------------------------------------------------");

//        System.out.println("file1.delete() = " + file1.delete());
//        System.out.println("folder1.delete() = " + folder1.delete());
//        System.out.println("---------------------------------------------------");

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("---------------------------------------------------");

        System.out.println("file1.isHidden() = " + file1.isHidden());
        System.out.println("file1.canRead() = " + file1.canRead());
        System.out.println("file1.canWrite() = " + file1.canWrite());
        System.out.println("file1.canExecute() = " + file1.canExecute());
        System.out.println("---------------------------------------------------");
    }
}
