module tech.ypsilon {
    requires javafx.controls;
    requires javafx.fxml;

    opens tech.ypsilon to javafx.fxml;
    exports tech.ypsilon;
}