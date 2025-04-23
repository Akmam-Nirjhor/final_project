package com.example.user_3_4;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class financial_managerController {

    @javafx.fxml.FXML
    private Label recent_namme_of_donner;
    @javafx.fxml.FXML
    private ComboBox pageDonationList;
    @javafx.fxml.FXML
    private Label PageFinancialTotalAmount;

    @javafx.fxml.FXML
    public void backButtonFinancialManagerPage(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/user_3_4/sponsor/sponsor.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Sponsor Page");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}