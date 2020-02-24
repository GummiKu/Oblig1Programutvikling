package oblig1Prog;

import java.util.List;

public class PersonFormatter {
    public static String DELIMITER = ";";

    public static String formatPerson(Person p){
        return p.getNavn() + DELIMITER + p.getAlder() + DELIMITER + p.getFødselsdato()
                + DELIMITER + p.getEpost() + DELIMITER + p.getTelefon();
    }

    public static String formatPerson (List<Person> personList){
        StringBuffer str = new StringBuffer();
        for(Person p : personList){
            str.append(formatPerson(p));
            str.append("\n");
        }
        return str.toString();
    }
}
