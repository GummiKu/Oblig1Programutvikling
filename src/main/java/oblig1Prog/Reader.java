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


            while ((line = reader.readLine()) != null) {
                list.add(parsePerson(line));
            }
        }

        return list;
    }
    private Person parsePerson(String line) throws InvalidPersonFormatException {
        
        String[] split = line.split(PersonFormatter.DELIMITER);
        if(split.length != 7) {
            throw new InvalidPersonFormatException("Må bruke semikolon ; for å splitte datafeltene");
        }

        String navn = split[0];
        int alder = parseNumber(split[1], "Alder er ikke et tall");
        int dag = parseNumber(split[2], "Dag er ikke et tall");
        int måned = parseNumber(split[3], "Måned er ikke et tall");
        int år = parseNumber(split[4], "År er ikke et tall");
        String epost = split[5];
        String telefon = split[6];
        Dato fødselsdato = new Dato(dag,måned,år);

        return new Person(navn, alder, fødselsdato, epost, telefon);
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