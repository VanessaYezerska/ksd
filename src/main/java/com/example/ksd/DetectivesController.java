package com.example.ksd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DetectivesController {
    @FXML
    public void goToMainMenu(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    private void openModal () throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cartModal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 200);
        Stage stage = new Stage();
        stage.setTitle("Модальне вікно");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.showAndWait();
    }



}
