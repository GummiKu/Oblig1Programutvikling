package oblig1Prog;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;

public class FileSaverTxt {

    /*
    public void saveToFile(List<?> objekter, Path fil){
        //Files.write(fil, objekter.toString().getBytes());
    }
     */

    public static void skrivFil(Path path, String str) throws IOException {
        Files.write(path, str.getBytes());
    }
}
