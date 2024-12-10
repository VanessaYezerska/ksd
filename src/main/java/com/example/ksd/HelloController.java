package com.example.ksd;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

    public class HelloController {
        @FXML
        private Button detectives;

        @FXML
        private Button fantasy;

        @FXML
        private Button mangs;

        @FXML
        private Button psychology;

        @FXML
        private Button thrillers;


        @FXML
        private void openFantasyWindow() throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fantasy.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Фентезі");
            stage.setScene(scene);
            stage.show();
        }

        @FXML
        private void openDetectives() throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("detectives.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Трилери");
            stage.setScene(scene);
            stage.show();
        }


        @FXML
        private void openThrillers() throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("thrillers.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Детективи");
            stage.setScene(scene);
            stage.show();
        }

        @FXML
        private void openPsychologyWindow() throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("psychology.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Психологічні книги");
            stage.setScene(scene);
            stage.show();
        }

        @FXML
        private void openMangsWindow() throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mangs.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Манги");
            stage.setScene(scene);
            stage.show();
        }
        @FXML
        private void openCart() throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cart.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 500);
            Stage stage = new Stage();
            stage.setTitle("Ваш кошик");
            stage.setScene(scene);
            stage.show();
        }


        @FXML
        void initialize() {
            assert fantasy != null : "fx:id=\"fantasy\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert detectives != null : "fx:id=\"detectives\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert mangs != null : "fx:id=\"mangs\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert psychology != null : "fx:id=\"psychology\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert thrillers != null : "fx:id=\"thrillers\" was not injected: check your FXML file 'hello-view.fxml'.";

        }
    }