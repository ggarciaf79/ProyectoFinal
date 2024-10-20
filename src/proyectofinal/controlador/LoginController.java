/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectofinal.controlador;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginController {

   private Stage stage;

    @FXML
    private PasswordField txtclave;

    @FXML
    private TextField txtuser;

    @FXML
    void ShowMessage(ActionEvent event) throws IOException {
        
        FXMLLoader loader   = new FXMLLoader(getClass().getResource("/proyectofinal/vistas/Ingreso.fxml"));
        Parent root =loader.load();
        IngresoController controller = loader.getController();
        Stage primaryStage =new Stage();   
        primaryStage.setTitle("Ingreso");
        primaryStage.setScene(new Scene(root));
        controller.init(txtuser.getText(),primaryStage,this);
        primaryStage.show();
        this.stage.close();
        
    }
 
    public void setStage(Stage primaryStage) {
       
        stage= primaryStage;
    }

     void show() {
       stage.show();
    }
}
