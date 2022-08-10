module controlador.botones02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens controlador.botones02 to javafx.fxml;
    exports controlador.botones02;
}