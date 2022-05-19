package org.example.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import org.example.App;

public class MainController {

    @FXML
    private void newRec() throws IOException {
        App.setRoot("meeting");
    }

}