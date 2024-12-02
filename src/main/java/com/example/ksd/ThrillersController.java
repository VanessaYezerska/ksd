package com.example.ksd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ThrillersController {

    @FXML
    private void openModal () throws IOException {
        // Завантажуємо модальне вікно
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cartModal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 200);
        Stage stage = new Stage();
        stage.setTitle("Модальне вікно");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.showAndWait(); // Відкриває модальне вікно
    }
    @FXML
    public void goToMainMenu(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
