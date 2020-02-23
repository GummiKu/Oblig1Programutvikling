package oblig1Prog;

import java.util.regex.Pattern;

public class Validering {
    public static void datoSjekk(int dag, int måned, int år) throws InvalidDateException{
        if (dag<1 || dag>31){
            throw new InvalidDateException("Dagen må være et heltall mellom 1 og 31.");
        }
        else if (måned<1 || måned>12){
            throw new InvalidDateException("Måneden må være et heltall mellom 1 og 12.");
        }
        else if (år<1900 || år>2020){
            throw new InvalidDateException("Året må være et heltall mellom 1900 og 2020.");
        }
    }

    public static boolean epostSjekk(String epost){
        String epostRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(epostRegex);
        if(epost == null)
            return false;
        return pat.matcher(epost).matches();

        // kilde for epostsjekk: https://www.geeksforgeeks.org/check-email-address-valid-not-java/
    }
    public static boolean telefonSjekk(String telefonnr){
        //TODO Feilsjekk telefunnummer
        String tlfRegex = "^\\+?(?:[0-9] ?){6,14}[0-9]$|^[+]?[01]?[- .]?(\\([2-9]\\d{2}\\)|[2-9]\\d{2})[- .]?\\d{3}[- .]?\\d{4}$|(0047|\\(\\+47\\) ?|47)?\\d{8}";
        Pattern pat = Pattern.compile(tlfRegex);
        if(telefonnr == null)
            return false;
        return pat.matcher(telefonnr).matches();

        // kilde for tlfnr regex: https://stackoverflow.com/questions/25763935/how-to-check-phone-number-format-is-valid-or-not-from-telephony-manager
    }


}
