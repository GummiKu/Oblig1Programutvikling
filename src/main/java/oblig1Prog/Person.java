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
}
