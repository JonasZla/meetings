package org.example.controllers;

import java.io.IOException;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.Categories;
import org.example.Types;
import org.example.model.Meeting;
import org.example.model.ResponsiblePerson;

public class MeetingController {

    @FXML
    public TextField name;
    @FXML
    public TextField responsiblePersonName;
    @FXML
    public TextField responsiblePersonSurname;
    @FXML
    public TextArea description;
    @FXML
    public ChoiceBox<Categories> category;
    @FXML
    public ChoiceBox<Types> type;
    @FXML
    public DatePicker startDate;
    @FXML
    public DatePicker endDate;


    private final String mainPageFileName = "main";

    @FXML
    private void back() throws IOException {
        App.setRoot(mainPageFileName);
    }

    @FXML
    private void save() throws IOException {
        if (name.getText() == null || responsiblePersonName.getText() == null || responsiblePersonSurname.getText() == null ||
            category.getItems().isEmpty() || type.getItems().isEmpty() || startDate.getValue() == null || endDate.getValue() == null) {
            System.out.println("Reik dialogo su pranesimu kad visi laukai turi buti uzpildyti");
            return;
        }
        Meeting meeting = new Meeting();
        meeting.setName(name.getText());
        meeting.setCategory(category.getValue().name());
        meeting.setType(type.getValue().name());
        meeting.setDescription(description.getText() != null ? description.getText() : null);
        meeting.setStartDate(OffsetDateTime.of(startDate.getValue(), LocalTime.MIN, ZoneOffset.UTC));
        meeting.setEndDate(OffsetDateTime.of(endDate.getValue(), LocalTime.MIN, ZoneOffset.UTC));

        ResponsiblePerson responsiblePerson = new ResponsiblePerson();
        responsiblePerson.setName(responsiblePersonName.getText());
        responsiblePerson.setSurname(responsiblePersonSurname.getText());
        meeting.setResponsiblePerson(responsiblePerson);

        this.back();
    }
}
