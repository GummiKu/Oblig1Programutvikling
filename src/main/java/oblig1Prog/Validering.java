package oblig1Prog;

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

    public static void epostSjekk{
    }
    public static void telefonSjekk{

    }
}
