import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class coverstring {
    public static String coverstring(String fileName) throws IOException {
        FileReader fileNamestream = new FileReader(fileName);
        while(fileNamestream.read() != -1){

        }
        return fileName;



    }
}
