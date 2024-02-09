package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController {
    @FXML
    private Label welcome;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label txtusername;

    @FXML
    private Label txtpassword;

    @FXML
    private Button sign;

    @FXML
    private TextField fname;

    @FXML
    private TextField lname;

    @FXML
    private TextField age;

    @FXML
    private TextField dob;

    @FXML
    private TextField gender;

    @FXML
    private TextField civil;

    @FXML
    private TextField country;

    @FXML
    private TextField email;

    @FXML
    private TextField mobile;

    @FXML
    private TextField susername;

    @FXML
    private PasswordField spassword;

    @FXML
    private PasswordField confirm;

    @FXML
    private Label text1;



    public void signup (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));

        Parent signupPane = loader.load();

        // Create a new stage for the signup pane
        Stage signupStage = new Stage();
        signupStage.setTitle("Sign Up");
        signupStage.setScene(new Scene(signupPane));
        signupStage.show();
    }

    public void onClear (ActionEvent event) throws IOException {
        fname.clear();
        lname.clear();
        age.clear();
        dob.clear();
        gender.clear();
        civil.clear();
        country.clear();
        email.clear();
        mobile.clear();
        susername.clear();
        spassword.clear();
        confirm.clear();
    }

    public void onSubmit (ActionEvent event) throws IOException{
        text1.setText("Successfully submitted");
    }
}

