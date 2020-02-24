package oblig1Prog;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Reader {
    public List<Person> lesFraFil(String path) throws IOException {
        ArrayList<Person> list = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line;

            // create a Person for each line
            while ((line = reader.readLine()) != null) {
                list.add(parsePerson(line));
            }
        }

        return list;
    }
    private Person parsePerson(String line) throws InvalidPersonFormatException {
        // split line string into three using the separator ";"
        String[] split = line.split(";");
        if(split.length != 5) {
            throw new InvalidPersonFormatException("Must use semicolon ; to separate the three data fields");
        }

        String name = split[0];
        int age = parseNumber(split[1], "Age (second field) is not a number");
        int date = parseNumber(split[2], "Id (third field) is not a number");
        String epost = split[3];
        String telefon = split[4];

        return new Person(name, age, date, epost, telefon);
    }

    private int parseNumber(String str, String errorMessage) throws InvalidPersonFormatException{
        int number;
        try {
            number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new InvalidPersonFormatException(errorMessage);
        }

        return number;
    }
}