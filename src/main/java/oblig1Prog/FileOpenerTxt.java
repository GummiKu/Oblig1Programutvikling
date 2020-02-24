package oblig1Prog;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileOpenerTxt implements FileOpener {
    public List<Person> lesFraFil(String path) throws IOException {
        ArrayList<Person> list = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line;


            while ((line = reader.readLine()) != null) {
                list.add(ParsePerson.parsePerson(line));
            }
        }

        return list;
    }

}
