module oblig1Prog {
    requires javafx.controls;
    requires javafx.fxml;

    opens oblig1Prog to javafx.fxml;
    exports oblig1Prog;
}