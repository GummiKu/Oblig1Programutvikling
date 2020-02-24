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

    public String getTxtNavn() {
        return txtNavn.get();
    }

    public SimpleStringProperty txtNavnProperty() {
        return txtNavn;
    }

    public void setTxtNavn(String txtNavn) {
        this.txtNavn.set(txtNavn);
    }

    public int getTxtAlder() {
        return txtAlder.get();
    }

    public SimpleIntegerProperty txtAlderProperty() {
        return txtAlder;
    }

    public void setTxtAlder(int txtAlder) {
        if(txtAlder < 0 || txtAlder > 120){
            throw new InvalidAgeException("Ugyldig alder");
        }
        this.txtAlder.set(txtAlder);
    }

    public String getTxtFødselsdato() {
        return txtFødselsdato.get();
    }

    public SimpleStringProperty txtFødselsdatoProperty() {
        return txtFødselsdato;
    }

    public void setTxtFødselsdato(String txtFødselsdato) {
        this.txtFødselsdato.set(txtFødselsdato);
    }

    public String getTxtEpost() {
        return txtEpost.get();
    }

    public SimpleStringProperty txtEpostProperty() {
        return txtEpost;
    }

    public void setTxtEpost(String txtEpost) {
        this.txtEpost.set(txtEpost);
    }

    public String getTxtTelefon() {
        return txtTelefon.get();
    }

    public SimpleStringProperty txtTelefonProperty() {
        return txtTelefon;
    }

    public void setTxtTelefon(String txtTelefon) {
        this.txtTelefon.set(txtTelefon);
    }

    public PersonRegister(String txtNavn, int txtAlder, String txtFødselsdato, String txtEpost, String txtTelefon){

        this.txtNavn = new SimpleStringProperty(txtNavn);
        this.txtAlder = new SimpleIntegerProperty(txtAlder);
        this.txtFødselsdato = new SimpleStringProperty(txtFødselsdato);
        this.txtEpost = new SimpleStringProperty(txtEpost);
        this.txtTelefon = new SimpleStringProperty(txtTelefon);



    }


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
