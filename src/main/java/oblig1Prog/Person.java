package oblig1Prog;


public class Person {
    public String navn;
    public int alder;
    public Dato fødselsdato;
    public String epost;
    public String telefon;

    public Person(String navn, int alder, Dato fødselsdato, String epost, String telefon) {
        this.navn = navn;
        this.alder = alder;
        this.fødselsdato = fødselsdato;
        this.epost = epost;
        this.telefon = telefon;
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
        this.alder = alder;
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
        this.epost = epost;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Navn: " + navn + ", Alder: " + alder + ", Fødselsdato: " + fødselsdato + ", Epost: " + epost + ", Telefonnr: " + telefon + ".";
    }
}
