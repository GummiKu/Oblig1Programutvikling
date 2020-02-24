package oblig1Prog;

import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;

public class FileSaverTxt implements FileSaver {

    public void saveToFile(List<?> objekter, Path fil){
        //Files.write(fil, objekter.toString().getBytes());
    }
}
