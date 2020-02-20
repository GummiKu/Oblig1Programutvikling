package oblig1Prog;


public class Person {
    public int alder;
    public String navn;
    public Dato fødselsdato;
    public String epost;
    public String telefon;

    public Person(int alder, String navn, Dato fødselsdato, String epost, String telefon) {
        this.alder = alder;
        this.navn = navn;
        this.fødselsdato = fødselsdato;
        this.epost = epost;
        this.telefon = telefon;
    }
}
