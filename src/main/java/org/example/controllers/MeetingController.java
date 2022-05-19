package org.example.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import org.example.App;

public class MeetingController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
