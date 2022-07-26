package filehandling1;

import java.io.FileWriter;
import java.io.IOException;

public class append {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "\\testfile.java";
        String text = "i am currently working on java";
 
        try {
            FileWriter fw = new FileWriter(path, true);
            fw.write(text);
            fw.close();
        }
        catch(IOException e) {
        }
    }
}
