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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static sample.Main.arr;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField text_field;

    @FXML
    private Button login;

    @FXML
    private Label wrong_input;

    @FXML
    void initialize() {
        login.setOnAction(event -> {
            if(text_field.getText().equals("ruslan.isaev")){
                login.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/sample3.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root =loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                String title = "Ala-too";
                stage.setTitle(title);
                stage.setResizable(false);
                stage.show();
            }
            else {
                if (arr.contains(text_field.getText())) {
                    login.getScene().getWindow().hide();
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("/sample/sample2.fxml"));
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
                else wrong_input.setText("Wrong input!!!");
            }
        });

    }
}
