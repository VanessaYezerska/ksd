package com.example.ksd;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
public class FantasyController {

    @FXML
    private Button cart;
    @FXML
    private Button menu;

    @FXML
    private void addToCart1() {
        Book book = new Book("Четверте крило. Книга 1", "Ребекка Ярос", 680);
        Cart.addBook(book);
        showConfirmationMessage();
    }

    @FXML
    private void addToCart2() {
        Book book = new Book("Блиск. Книга 1", "Рейвен Кеннеді", 350);
        Cart.addBook(book);
        showConfirmationMessage();
    }

    @FXML
    private void addToCart3() {
        Book book = new Book("Легенда", "С.Гарбер", 600);
        Cart.addBook(book);
        showConfirmationMessage();
    }

    @FXML
    private void addToCart4() {
        Book book = new Book("Двір шипів і троянд", "Сара Дж. Маас", 360);
        Cart.addBook(book);
        showConfirmationMessage();
    }
    private void showConfirmationMessage() {
        Stage stage = new Stage();
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));

        Label label = new Label("Книга додана у кошик!");
        label.setStyle("-fx-font-size: 16; -fx-font-weight: bold;");

        Button closeButton = new Button("Ок");
        closeButton.setStyle("-fx-background-color: red; -fx-text-fill: white; -fx-font-size: 14; -fx-background-radius: 20;");
        closeButton.setOnAction(event -> stage.close());

        vbox.getChildren().addAll(label, closeButton);

        Scene scene = new Scene(vbox, 300, 150);
        stage.setScene(scene);
        stage.setTitle("Підтвердження");
        stage.setResizable(false);
        stage.show();
    }
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
