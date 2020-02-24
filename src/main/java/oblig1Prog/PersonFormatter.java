package oblig1Prog;

import java.util.List;

public class PersonFormatter {
    public static String DELIMITER = ";";

    public static String formatPerson(Person nyPerson){
        int dag = nyPerson.fødselsdato.getDag();
        int måned = nyPerson.fødselsdato.getMåned();
        int år = nyPerson.fødselsdato.getÅr();
        return nyPerson.getNavn() + DELIMITER + nyPerson.getAlder() + DELIMITER + dag + DELIMITER + måned + DELIMITER + år
                + DELIMITER + nyPerson.getEpost() + DELIMITER + nyPerson.getTelefon();
    }

    public static String formatPerson (List<Person> personList){
        StringBuffer str = new StringBuffer();
        for(Person nyPerson : personList){
            str.append(formatPerson(nyPerson));
            str.append("\n");
        }
        return str.toString();
    }
}
