module com.example.homeschoolhelper1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homeschoolhelper1 to javafx.fxml;
    exports com.example.homeschoolhelper1;
}