module org.example.diceroller {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.diceroller to javafx.fxml;
    exports org.example.diceroller;
}