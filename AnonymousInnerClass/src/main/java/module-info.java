module es.ieslosmontecillos.anonymousinnerclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.anonymousinnerclass to javafx.fxml;
    exports es.ieslosmontecillos.anonymousinnerclass;
}