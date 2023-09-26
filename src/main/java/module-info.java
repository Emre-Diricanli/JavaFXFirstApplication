module com.example.lab13_emrediricanli {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab13_emrediricanli to javafx.fxml;
    exports com.example.lab13_emrediricanli;
}