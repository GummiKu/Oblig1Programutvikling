package oblig1Prog;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

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
    void hentFraFil(ActionEvent event) {

    }

    @FXML
    void lagreTilFil(ActionEvent event) {

    }

    @FXML
    void registrerPerson(ActionEvent event) {
        //Hente informasjon fra Label og legge til person i reg
        reg.registrerPerson(txtAlder.getText(), txtNavn.getText(), txtDag.getText(), txtMåned.getText(), txtÅr.getText(),
                txtEpost.getText(),txtTelefon.getText());
    }

}
