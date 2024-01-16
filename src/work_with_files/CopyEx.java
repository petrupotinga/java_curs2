package work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reder = new BufferedReader(new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"))) {
//            int character;
//            while ((character = reder.read()) != -1) {
//                writer.write(character);
//            }
            String line;
            while ((line = reder.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
