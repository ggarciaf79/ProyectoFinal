/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectofinal.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class IngresoController {
    @FXML
    private LoginController controllerlogin;
    private Stage stage;

    @FXML
    private Button btnregresar;

    @FXML
    private Label labelbienvenida;

    @FXML
    void Salir(ActionEvent event) {
        controllerlogin.show();
        stage.close();
    }

    void init(String text, Stage primaryStage, LoginController controllerlogin) {
        labelbienvenida.setText(text);
        this.controllerlogin=controllerlogin;
        this.stage=primaryStage;
    }

}

