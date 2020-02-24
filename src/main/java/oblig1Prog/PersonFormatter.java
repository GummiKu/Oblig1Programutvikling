package oblig1Prog;

import java.util.List;

public class PersonFormatter {
    public static String DELIMITER = " - ";

    public static String formatPerson(Person nyPerson){
        return nyPerson.getNavn() + DELIMITER + nyPerson.getAlder() + DELIMITER + nyPerson.getFødselsdato()
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
