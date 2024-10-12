package es.ieslosmontecillos.anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*Instanciacion de un objeto Pane*/
        Pane pane = new Pane();
        /*Instanciacion de cuatro objetos de la clase boton*/
        Button btnNew = new Button("New");
        Button btnOpen = new Button("Open");
        Button btnSave = new Button("Save");
        Button btnPrint = new Button("Print");

        Scene scene = new Scene(pane, 250, 100);

        btnNew.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               System.out.println("Nuevo proceso");
           }
         });

        btnOpen.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                System.out.println("Abrir proceso");
            }
        });

        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                System.out.println("Guardar proceso");
            }
        });

        btnPrint.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                System.out.println("Imprimir proceso");
            }
        });

        HBox hbox = new HBox(btnNew, btnOpen, btnSave, btnPrint);
        hbox.setSpacing(15);
        hbox.setLayoutX(20);
        hbox.setLayoutY(20);
        pane.getChildren().add(hbox);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}