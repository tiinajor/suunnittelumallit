/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amkf;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import static javafx.application.Application.setUserAgentStylesheet;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Samuli Käkönen
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    Button pinkButton;
    
    @FXML
    MenuButton kys1;
    @FXML
    MenuButton kys2;
    @FXML
    MenuButton kys3;
    @FXML
    MenuButton kys4;
    @FXML
    MenuButton kys5;
    @FXML
    MenuButton kys6;
    @FXML
    MenuButton kys7;
    @FXML
    MenuButton kys8;
    @FXML
    MenuButton kys9;
    @FXML
    MenuButton kys10;
    @FXML
    MenuButton kys11;
    @FXML
    MenuButton kys12;
    @FXML
    MenuButton kys13;
    @FXML
    MenuButton kys14;
    @FXML
    MenuButton kys15;
    @FXML
    MenuButton kys16;
    @FXML
    MenuButton kys17;
    @FXML
    MenuButton kys18;
    @FXML
    MenuButton kys19;
    @FXML
    MenuButton kys20;
    @FXML
    MenuButton kys21;
    @FXML
    MenuButton kys22;
    
    
    
    
    /*
    @FXML
    MenuItem kys1k;
    */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        kysOnAction();
    }

    private final String theme1Url = getClass().getResource("index_pink.css").toExternalForm();
    private final String theme2Url = getClass().getResource("index.css").toExternalForm();

    public void pinkButton(ActionEvent event) throws IOException {

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("indexMusta.fxml"));/* Exception */
        Scene scene = new Scene(root);
        scene.getStylesheets().remove(theme2Url);
        System.out.println("scene stylesheets on button 1 click: " + scene.getStylesheets());
        if (!scene.getStylesheets().contains(theme1Url)) {
            scene.getStylesheets().add(theme1Url);
        }
        System.out.println("scene stylesheets on button 1 click: " + scene.getStylesheets());

    }

    @FXML
    public void whiteButton(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("indexMusta.fxml"));/* Exception */
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("Scene vaihdettu");
    }

    @FXML
    public void petrolButton(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("indexPetrol.fxml"));/* Exception */
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("Scene vaihdettu");
    }

    @FXML
    public void purpleButton(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("indexPurple.fxml"));/* Exception */
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("Scene vaihdettu");
    }

    @FXML
    public void greenButton(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("indexGreen.fxml"));/* Exception */
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("Scene vaihdettu");
    }

    @FXML
    public void ala(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("alaPaina.fxml"));/* Exception */
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("Scene vaihdettu");
    }

    @FXML
    public javafx.scene.control.Button closeButton;

    @FXML
    public void closeButtonAction() {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    
    public void kysOnAction() {
        ArrayList<MenuButton> buttonit = new ArrayList<MenuButton>();
        buttonit.add(kys1);
        buttonit.add(kys2);
        buttonit.add(kys3);
        buttonit.add(kys4);
        buttonit.add(kys5);
        buttonit.add(kys6);
        buttonit.add(kys7);
        buttonit.add(kys8);
        buttonit.add(kys9);
        buttonit.add(kys10);
        buttonit.add(kys11);
        buttonit.add(kys12);
        buttonit.add(kys13);
        buttonit.add(kys14);
        buttonit.add(kys15);
        buttonit.add(kys16);
        buttonit.add(kys17);
        buttonit.add(kys18);
        buttonit.add(kys19);
        buttonit.add(kys20);
        buttonit.add(kys21);
        buttonit.add(kys22);
        
        
        ObservableList<MenuItem> items;
        for(int i = 0; i < 22; i++){
            MenuButton käsiteltävä = buttonit.get(i);
            items = käsiteltävä.getItems();
            for(int j = 0; j < items.size(); j++){
                if(j == 0){
                items.get(j).setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e) {
                    käsiteltävä.setText("Kyllä");
                    
                }
            });
                }else{
                    items.get(j).setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e) {
                    käsiteltävä.setText("Ei");
                    
                }
            });
                }

        }
        
        
        }

    }

}
