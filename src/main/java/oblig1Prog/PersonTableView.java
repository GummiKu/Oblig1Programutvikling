package oblig1Prog;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class PersonTableView {

    private ObservableList<PersonRegister> personListe = FXCollections.observableArrayList();

    public void attachTableView(TableView tv) {
        tv.setItems(personListe);
    }
    public void addElement(PersonRegister obj) {
        personListe.add(obj);
    }

}
