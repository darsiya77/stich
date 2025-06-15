package Archive.File.File_Reader_Writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "If you can dream - and not make dreams your master;   \n" +
                "    If you can think - and not make thoughts your aim;   \n" +
                "If you can meet with Triumph and Disaster\n" +
                "    And treat those two impostors just the same;   \n" +
                "If you can bear to hear the truth you’ve spoken\n" +
                "    Twisted by knaves to make a trap for fools,\n" +
                "Or watch the things you gave your life to, broken,\n" +
                "    And stoop and build ’em up with worn-out tools:\n";
        FileWriter writer = null;
        try {
            writer = new FileWriter("HelloAndreyT.txt");
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
            writer.write(rubai);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            assert writer != null;
            writer.close();
        }
    }
}
