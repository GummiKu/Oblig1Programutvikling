package oblig1Prog;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class PersonRegister {
    private SimpleStringProperty txtNavn;
    private SimpleIntegerProperty txtAlder;
    private SimpleStringProperty txtFødselsdato;
    private SimpleStringProperty txtEpost;
    private SimpleStringProperty txtTelefon;

    public PersonRegister(String txtNavn, int txtAlder, String txtFødselsdato, String txtEpost, String txtTelefon){
        if(txtNavn.isEmpty()==true||txtNavn.isBlank()==true){
            throw new InvalidNameException("Må fylles ut");
        }
        if(txtAlder < 0 || txtAlder > 120){
            throw new InvalidNameException("Må fylles ut");
        }
    }


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
