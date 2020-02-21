package oblig1Prog;

import java.util.ArrayList;

public class PersonRegister {
        public ArrayList<Person> register = new ArrayList<>();
        public void registrerPerson (Person enPerson) {

            register.add(enPerson);
        }

        public void skrivUtListe() {
            //Skriv ut til system out for testing
        }

}
