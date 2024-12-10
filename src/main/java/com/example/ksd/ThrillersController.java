package com.example.ksd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class ThrillersController {
    @FXML
    private void addToCart9() {
        Book book = new Book("Порожні могили", "Тарас Мельник", 200);
        Cart.addBook(book);
        showConfirmationMessage();
    }

    @FXML
    private void addToCart10() {
        Book book = new Book("Голлі", "Стівен Кінг", 440);
        Cart.addBook(book);
        showConfirmationMessage();
    }

    @FXML
    private void addToCart11() {
        Book book = new Book("Секрет служниці", "Фріда Мак-Фадден", 320);
        Cart.addBook(book);
        showConfirmationMessage();
    }

    @FXML
    private void addToCart12() {
        Book book = new Book("Виживуть п'ятеро", "Голлі Джексон", 480);
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
    public void goToMainMenu(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
