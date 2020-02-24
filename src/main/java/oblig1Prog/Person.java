package oblig1Prog;


public class Person {
    public String navn;
    public int alder;
    public Dato fødselsdato;
    public String epost;
    public String telefon;

    public Person(String navn, int alder, Dato fødselsdato, String epost, String telefon) {
        this.navn = navn;

        if (alder>0 && alder < 120){
            this.alder = alder;
        }
        else throw new InvalidAgeException("Alder må være mellom 0 og 120 år");

        int dag = fødselsdato.getDag();
        int måned = fødselsdato.getMåned();
        int år = fødselsdato.getÅr();
        try {
            Validering.datoSjekk(dag,måned,år);
            this.fødselsdato = fødselsdato;
        } catch (InvalidDateException e) {
            throw e;
        }
        if (Validering.epostSjekk(epost)) {
            this.epost = epost;
        } else throw new InvalidEpostException("Ugyldig epostadresse");
        if (Validering.telefonSjekk(telefon)) {
            this.telefon = telefon;
        } else throw new InvalidTelefonException("Telefunnummeret er ugyldig");
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        if (alder<0 || alder > 120){
            this.alder = alder;
        }
        else throw new InvalidAgeException("Alder må være mellom 0 og 120 år");
    }

    public Dato getFødselsdato() {
        return fødselsdato;
    }

    public void setFødselsdato(Dato fødselsdato) {
        this.fødselsdato = fødselsdato;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        if (Validering.epostSjekk(epost)) {
            this.epost = epost;
        } else throw new InvalidEpostException("Ugyldig epostadresse");
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        if (Validering.telefonSjekk(telefon)) {
            this.telefon = telefon;
        } else throw new InvalidTelefonException("Telefunnummeret er ugyldig");
    }

    @Override
    public String toString() {
        return "Navn: " + navn + ", Alder: " + alder + ", Fødselsdato: " + fødselsdato + ", Epost: " + epost + ", Telefonnr: " + telefon + ".";
    }
}
