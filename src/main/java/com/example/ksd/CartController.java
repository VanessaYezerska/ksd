package com.example.ksd;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class CartController {

    @FXML
    private ListView<Book> cartList;

    @FXML
    private Button removeButton;

    @FXML
    private Button closeButton;

    @FXML
    public void initialize() {
        cartList.setItems(Cart.getCartItems());
        removeButton.setOnAction(event -> removeSelectedBook());
    }

    private void removeSelectedBook() {
        Book selectedBook = cartList.getSelectionModel().getSelectedItem();
        if (selectedBook != null) {
            Cart.getCartItems().remove(selectedBook); // Видаляємо книгу з моделі
            showAlert("Видалення", "Книга видалена з кошика.", AlertType.INFORMATION);
        } else {
            showAlert("Помилка", "Будь ласка, оберіть книгу для видалення.", AlertType.ERROR);
        }
    }


    @FXML
    private void closeCart() {
        Stage stage = (Stage) cartList.getScene().getWindow();
        stage.close();
    }

    // Відображення повідомлення
    private void showAlert(String title, String message, AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
