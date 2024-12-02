package com.example.ksd;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class FantasyController {

    @FXML
    private Button cart;
    @FXML
    private Button menu;


    @FXML
    private void goToMainMenu() {
        try {
            // Отримуємо поточне вікно (Stage) через будь-яку кнопку на сцені
            Stage stage = (Stage) menu.getScene().getWindow();
            stage.close();
        } catch (Exception e) {
            System.out.println("Помилка при закритті вікна: " + e.getMessage());
        }
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

    @FXML
    private void closeModal(javafx.event.ActionEvent event) {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
    }



    @FXML
    void initialize() {
        assert cart != null : "fx:id=\"cart\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert menu != null : "fx:id=\"menu\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
