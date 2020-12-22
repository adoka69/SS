package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller3 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField text_field;

    @FXML
    private Button login;

    @FXML
    private Label Wrong;

    @FXML
    void initialize() {
        login.setOnAction(actionEvent -> {
        if(text_field.getText().equals("pteacherz")) {
            login.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("sample4.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            String title = "Ala-too";
            stage.setTitle(title);
            stage.setResizable(false);
            stage.show();
        }
        else{
            Wrong.setText("Wrong password!!!!");
        }
        });
    }
}