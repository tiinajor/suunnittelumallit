/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import model.AMKFKone;

/**
 * FXML Controller class
 *
 * @author Samuli Käkönen
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    String[] maakunnat;

    AMKFKone kone = new AMKFKone();
    
    @FXML
    MenuButton maakuntaNappi;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        maakunnat = kone.getAsuinalueet();
        asetaMaakunnat(maakunnat);
        maakuntaNappi.getStylesheets().add("/amkf/style.css");
    }

    @FXML
    public void kirjauduNappula(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/amkf/ekaKysely.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        System.out.println("Scene vaihdettu");
    }
    
    public void asetaMaakunnat(String[] kunnat) {
        for (int i = 0; i < kunnat.length; i++) {
            MenuItem item = new MenuItem(kunnat[i]);
            item.getStyleClass().add("menuItem");
            maakuntaNappi.getItems().add(item);
        }
    }

}
