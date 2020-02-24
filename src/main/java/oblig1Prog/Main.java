package oblig1Prog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.Reader;
import java.util.List;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 650, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

        FileOpenerTxt reader = new FileOpenerTxt();

        try {
        List<Person> personList = reader.lesFraFil("C:\\Users\\knaps\\Desktop\\Test.csv");
        System.out.println(personList);
        } catch (InvalidPersonFormatException e) {
        System.err.println("The data is not formatted correctly. Cause: " + e.getMessage());
        } catch (IOException e) {
        System.err.println("Could not read the requested file. Cause: " + e.toString());
        }

    }
}
