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

public class MangsController {

    @FXML
    private void addToCart13() {
        Book book = new Book("Голограф веселки", "Ініо Асано", 315);
        Cart.addBook(book);
        showConfirmationMessage();
    }

    @FXML
    private void addToCart14() {
        Book book = new Book("Темний дворецький", "Яна Тобосо", 200);
        Cart.addBook(book);
        showConfirmationMessage();
    }

    @FXML
    private void addToCart15() {
        Book book = new Book("Токійські месники", "K. Wakui", 180);
        Cart.addBook(book);
        showConfirmationMessage();
    }

    @FXML
    private void addToCart16() {
        Book book = new Book("Оранж", "Ініо Такано", 200);
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
