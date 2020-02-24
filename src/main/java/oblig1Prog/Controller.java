package oblig1Prog;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Controller {

    PersonRegister reg = new PersonRegister();

    @FXML
    private MenuItem lagreTilFil;

    @FXML
    private MenuItem hentFraFil;

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
    private TextField txtEpost;

    @FXML
    private TextField txtTelefon;

    @FXML
    private Button registrerPerson;

    @FXML
    private TableColumn<?, ?> txtUtNavn;

    @FXML
    private TableColumn<?, ?> txtUtAlder;

    @FXML
    private TableColumn<?, ?> txtUtFødselsdato;

    @FXML
    private TableColumn<?, ?> txtUtEpost;

    @FXML
    private TableColumn<?, ?> txtUtTelefon;

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
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Åpne fil");
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Tekstfil", "*.txt"));
            File fil = fileChooser.showOpenDialog(null);
            FileOpenerTxt leser = new FileOpenerTxt();
            try {
                leser.lesFraFil(fil.getPath());
            } catch (IOException e) {
                lblError.setText(e.toString() + ": finner ikke fil.");
            }

        }

        @FXML
        void lagreTilFil (ActionEvent event){
            int alder = Integer.parseInt(txtAlder.getText());
            int dag = Integer.parseInt(txtDag.getText());
            int måned = Integer.parseInt(txtMåned.getText());
            int år = Integer.parseInt(txtÅr.getText());
            Dato fødselsdato = new Dato(dag, måned, år);
            Person p = new Person(txtNavn.getText(), alder, fødselsdato, txtEpost.getText(), txtTelefon.getText());
            var path = Paths.get("person.txt");
            String formatert = PersonFormatter.formatPerson(p);
            try {
                FileSaverTxt.skrivFil(path, formatert);
            } catch (IOException e) {
                lblError.setText("Noe gikk feil: " + e.getMessage());
            }
        }

        @FXML
        void registrerPerson (ActionEvent event){
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
