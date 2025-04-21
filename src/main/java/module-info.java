module com.example.user_3_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.user_3_4 to javafx.fxml;
    exports com.example.user_3_4;
}