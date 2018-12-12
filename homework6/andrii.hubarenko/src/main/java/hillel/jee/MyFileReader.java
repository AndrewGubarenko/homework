package hillel.jee;

import java.io.*;

public class MyFileReader {
    public BufferedReader getFileContent(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
            return reader;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
