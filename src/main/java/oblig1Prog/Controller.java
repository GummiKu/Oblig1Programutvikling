package oblig1Prog;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;

public class Controller {

    PersonRegister reg = new PersonRegister();

    @FXML
    private MenuItem lagreTilFil;

    @FXML
    private MenuItem hentFraFil;

    @FXML
    private Label lblNavn;

    @FXML
    private TextField txtNavn;

    @FXML
    private Label lblAlder;

    @FXML
    private TextField txtAlder;

    @FXML
    private Label lblFødselsdato;

    @FXML
    private TextField txtDag;

    @FXML
    private TextField txtMåned;

    @FXML
    private TextField txtÅr;

    @FXML
    private Label lblEpost;

    @FXML
    private TextField txtEpost;

    @FXML
    private Label lblTelefon;

    @FXML
    private TextField txtTelefon;

    @FXML
    private Button registrerPerson;

    @FXML
    private Label lblErrNavn;

    @FXML
    private Label lblErrAlder;

    @FXML
    private Label lblErrFødselsdato;

    @FXML
    private Label lblErrEpost;

    @FXML
    private Label lblErrTelefon;

    @FXML
    private Label lblError;


    @FXML
    void hentFraFil(ActionEvent event) {
        void hentFraFil(ActionEvent event) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Åpne fil");
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Kommaseparert verdi", "*.csv"));
            File fil = fileChooser.showOpenDialog(null);
            FileOpenerTxt leser = new FileOpenerTxt();
            try {
                leser.lesFraFil(fil.getPath());
            }catch (IOException e){
                lblError.setText(e.toString() + ": finner ikke fil.");
            }

    }

    @FXML
    void lagreTilFil(ActionEvent event) {

    }

    @FXML
    void registrerPerson(ActionEvent event) {
        //Hente informasjon fra Label og legge til person i reg

        int intAlder = Integer.parseInt(txtAlder.getText());
        int intDag = Integer.parseInt(txtDag.getText());
        int intMåned = Integer.parseInt(txtMåned.getText());
        int intÅr = Integer.parseInt(txtÅr.getText());
        Dato fødselsdato = new Dato(intDag, intMåned, intÅr);
        Person enPerson = new Person(txtNavn.getText(), intAlder, fødselsdato, txtEpost.getText(), txtTelefon.getText());
        reg.registrerPerson(enPerson);


    }

}
