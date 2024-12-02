module com.example.ksd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ksd to javafx.fxml;
    exports com.example.ksd;
}