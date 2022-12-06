module com.example.fx7500_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires Symbol.RFID.API3;


    opens com.example.fx7500_app to javafx.fxml;
    exports com.example.fx7500_app;
}