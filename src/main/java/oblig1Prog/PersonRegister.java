package oblig1Prog;

import java.util.ArrayList;

public class PersonRegister {
        public ArrayList<Person> register = new ArrayList<>();
        public void registrerPerson (String navn, String alder, String dag, String måned, String år,  String epost, String telefon) {

            int inputAlder = Integer.parseInt(alder);
            int inputDag = Integer.parseInt(dag);
            int inputMåned = Integer.parseInt(måned);
            int inputÅr = Integer.parseInt(år);
            Dato fødselsdato = new Dato(inputDag, inputMåned, inputÅr);
            Person enPerson = new Person(navn, inputAlder, fødselsdato, epost, telefon);

            register.add(enPerson);
        }

        public ArrayList skrivUtListe() {
            return register;
        }

}
