package pl.porbi.javafxsimple.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {

    @FXML
    public StackPane mainScreenStackPane;

    @FXML
    public void initialize() {
        showMenuScreen();
    }

    void showMenuScreen() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MenuScreen.fxml"));

        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MenuScreenController controller = loader.getController();
        controller.setMainController(this);
        setScreen(pane);
    }

    void setScreen(Pane pane) {
        mainScreenStackPane.getChildren().clear();
        mainScreenStackPane.getChildren().add(pane);
    }
}
