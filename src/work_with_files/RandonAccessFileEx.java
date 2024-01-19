package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandonAccessFileEx {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
//            a = file.read();
//            System.out.println((char) a);
            String s = file.readLine();
            System.out.println(s);

            file.seek(101);
            String s1 = file.readLine();
            System.out.println(s1);

            long position = file.getFilePointer();
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("Privet");

            file.seek(file.length() - 1);
            file.writeBytes("\n\t\t\t\t\t\t\tWilliam Butler Yeats");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
