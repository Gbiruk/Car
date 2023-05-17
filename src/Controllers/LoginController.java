package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.*;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

public class LoginController implements Initializable{
    @FXML 
    private JFXButton signup;
    @FXML 
    private JFXTextField username;
    @FXML 
    private JFXCheckBox remember;
    @FXML 
    private JFXButton login;
    @FXML 
    private ImageView progress;
    @FXML 
    private JFXPasswordField password;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
     progress.setVisible(false);
     username.setStyle("-fx-text-inner-color: #a0a2ab");
     password.setStyle("-fx-text-inner-color: #a0a2ab");   
     login.setOnAction(event -> {
        // Perform some action when the button is clicked
    System.out.print("hellow");
    });
       
    }
    
}

