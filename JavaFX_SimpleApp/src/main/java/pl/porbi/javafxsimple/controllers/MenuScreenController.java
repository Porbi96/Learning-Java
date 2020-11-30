package pl.porbi.javafxsimple.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuScreenController {
    private MainController mainController;

    public void showAppScreen(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AppScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppScreenController controller = loader.getController();
        controller.setMainController(mainController);
        mainController.setScreen(pane);
    }

    public void showOptionsScreen(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/OptionsScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OptionsScreenController controller = loader.getController();
        controller.setMainController(mainController);
        mainController.setScreen(pane);
    }

    public void exitApp(ActionEvent event) {
        Platform.exit();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
