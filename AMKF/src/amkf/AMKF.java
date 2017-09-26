/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amkf;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Samuli Käkönen
 */
public class AMKF extends Application {

    Parent root;

    @Override
    public void start(Stage stage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("LoginScreenFXML.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        //scene.getStylesheets().add("style.css");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("TESTI");
        launch(args);

    }

    
    
    

}
