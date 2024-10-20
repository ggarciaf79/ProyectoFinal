
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package proyectofinal;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import proyectofinal.controlador.LoginController;

/**
 *
 * @author Gegarfi
 */
public class ProyectoFinal extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
       
        FXMLLoader loader   = new FXMLLoader(getClass().getResource("/proyectofinal/vistas/Login.fxml"));
        Parent root =loader.load();
               
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root));
        LoginController controller = loader.getController();
        controller.setStage(primaryStage);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
