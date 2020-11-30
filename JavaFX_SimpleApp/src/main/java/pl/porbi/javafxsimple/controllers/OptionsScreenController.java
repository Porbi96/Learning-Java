package pl.porbi.javafxsimple.controllers;

import javafx.event.ActionEvent;

public class OptionsScreenController {
    private MainController mainController;

    public void backToMenuScreen(ActionEvent event) {
        mainController.showMenuScreen();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
