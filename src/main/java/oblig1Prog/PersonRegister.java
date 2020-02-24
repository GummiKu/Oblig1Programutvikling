package oblig1Prog;

import java.util.ArrayList;

public class PersonRegister {
        public ArrayList<Person> register = new ArrayList<>();
        public void registrerPerson (Person enPerson) {

            try{
                register.add(enPerson);
            } catch (IllegalArgumentException e){ throw e;}
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
