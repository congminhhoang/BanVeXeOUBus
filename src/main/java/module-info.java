module com.mycompany.quanlyvexe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;

    opens com.mycompany.quanlyvexe to javafx.fxml;
    exports com.mycompany.quanlyvexe;
    exports com.qlbv.pojo;
}
