package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = """
                Палец, писавший, движется вперед;
                И, написанное оставив впереди,
                Не отмоешь слезами, не стереть,
                И не вернуть назад его слова.""";
        String s = "Felicitari!";
        try (FileWriter writer = new FileWriter("test2.txt", true)) {
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
//            writer.write(rubai);
            writer.write(s + "\n");
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
