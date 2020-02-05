package oblig1Prog;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class Controller {

    @FXML
    private TextField txtNavn;

    @FXML
    private TextField txtAlder;

    @FXML
    private TextField txtDag;

    @FXML
    private TextField txtMåned;

    @FXML
    private TextField txtÅr;

    @FXML
    private Label lblRegistrertePersoner;

    @FXML
    private Label lblFeilAlder;

    @FXML
    private Label lblFeilDato;

    @FXML
    void registrerPersoner(ActionEvent event) {
        int innDag, innMåned, innÅr, innAlder;

        String navn = txtNavn.getText();

        try{
            innDag = Integer.parseInt(txtDag.getText());
        } catch (InvalidDateException e){
            lblFeilDato.setText("Dagen må være et heltall mellom 1 og 31.");
            innDag = 0;
        }

        try{
            innMåned = Integer.parseInt(txtMåned.getText());
        } catch (InvalidDateException e){
            lblFeilDato.setText("Måneden må være et heltall mellom 1 og 12.");
            innMåned = 0;
        }

        try{
            innÅr = Integer.parseInt(txtÅr.getText());
        } catch (InvalidDateException e){
            lblFeilDato.setText("Året må være et heltall mellom 1900 og 2020.");
            innÅr = 0;
        }

        try{
            innAlder = Integer.parseInt(txtAlder.getText());
            if (innAlder<0 || innAlder>120){
                throw new InvalidAgeException("Alderen din må være et heltall mellom 0 og 120.");
            }
        } catch (InvalidAgeException e){
            lblFeilAlder.setText("Alderen din må være et heltall mellom 0 og 120.");
            innAlder = 0;
        }


        ArrayList<Person> liste = new ArrayList<>();
        Dato dato1 = new Dato(innDag, innMåned, innÅr);
        Person person1 = new Person(innAlder, navn, dato1);
        liste.add(person1);

       for(Person i:liste){
           lblRegistrertePersoner.setText("Navn : " + i.navn +"\nAlder: " + i.alder + "\nFødselsdato: "+ i.fødselsdato);
       }

        // lblRegistrertePersoner.setText("Test");

        /* Sitter fast ved datoen, ved at den skal feilsjekkes for at den er tall og den er mellom de tallene jeg vil*/

    }

}

