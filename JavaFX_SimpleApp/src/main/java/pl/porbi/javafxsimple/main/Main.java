package pl.porbi.javafxsimple.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainScreen.fxml"));

        StackPane pane = loader.load();
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Samba!");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
