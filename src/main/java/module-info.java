module com.example.final_praktika_3_sprint {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.final_praktika_3_sprint to javafx.fxml;
    exports com.example.final_praktika_3_sprint;
}