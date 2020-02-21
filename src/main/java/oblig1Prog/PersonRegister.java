package oblig1Prog;

import java.util.ArrayList;

public class PersonRegister {
        public ArrayList<Person> register = new ArrayList<>();
        public void registrerPerson (Person enPerson) {

            register.add(enPerson);
            for(Person i : register) {

                    System.out.println("Navn: " + i.navn);
                    System.out.println("Alder: " + i.alder + " år");
                    System.out.println("Fødselsdato: " + i.fødselsdato);
                    System.out.println("Epost: " + i.epost);
                    System.out.println("Telefonnummer: " + i.telefon);
                    System.out.println("----------------------");

            }
        }
}
