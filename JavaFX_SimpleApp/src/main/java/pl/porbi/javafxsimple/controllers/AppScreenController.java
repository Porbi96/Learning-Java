package pl.porbi.javafxsimple.controllers;

import javafx.event.ActionEvent;

public class AppScreenController {
    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void backToMenuScreen(ActionEvent event) {
        mainController.showMenuScreen();
    }
}
