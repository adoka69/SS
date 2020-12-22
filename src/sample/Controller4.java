package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller4 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField field1;

    @FXML
    private TextField fielnd2;


    @FXML
    private TextField field3;

    @FXML
    private TextField field4;

    @FXML
    private TextField field5;

    @FXML
    private Label total;

    @FXML
    private Button back_button;

    @FXML
    private Button show;


    @FXML
    void initialize() {
        field1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    field1.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        field1.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        fielnd2.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    fielnd2.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        fielnd2.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        field3.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    field3.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        field3.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });

        field4.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    field4.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        field4.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        field5.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    field5.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>20){
                        field5.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });

        show.setOnAction(actionEvent -> {
            int b=0;

            String exams = field1.getText();
            String att = fielnd2.getText();
            String hw = field3.getText();
            String bb = field4.getText();
            String bp = field5.getText();
            try
            {
                Integer.parseInt(exams);
                int value = Integer.parseInt(exams);
                if(value>=0&&value<=100){
                    b=b+1;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println(exams+ " is not a valid integer number");
            }
            try
            {
                Integer.parseInt(att);
                int value = Integer.parseInt(att);
                if(value>=0&&value<=100){
                    b=b+1;
                }

            }
            catch (NumberFormatException e)
            {
                System.out.println(att + " is not a valid integer number");
            }
            try{
                Integer.parseInt(hw);
                int value = Integer.parseInt(hw);
                if(value>=0&&value<=100){
                    b=b+1;
                }

            }
            catch (NumberFormatException e)
            {
                System.out.println(hw + " is not a valid integer number");
            }
            try{
                Integer.parseInt(bb);
                int value = Integer.parseInt(bb);
                if(value>=0&&value<=100){
                    b=b+1;
                }

            }
            catch (NumberFormatException e)
            {
                System.out.println(bb + " is not a valid integer number");
            }
            try{
                Integer.parseInt(bp);
                int value = Integer.parseInt(bp);
                if(value>=0&&value<=20){
                    b=b+1;
                }

            }
            catch (NumberFormatException e)
            {
                System.out.println(bp + " is not a valid integer number");
            }
            int value1 = Integer.parseInt(exams);
            int value2 = Integer.parseInt(att);
            int value3 = Integer.parseInt(hw);
            int value4 = Integer.parseInt(bb);
            int value5 = Integer.parseInt(bp);
            if(b==5){
                int check=((value1*80/100)+(value2/10)+(value3/10))-value4;
                if(check+value5>100){
                    check = 100;
                }
                else{
                    check=check+value5;
                }
                total.setText(String.valueOf(check));
            }

        });
        back_button.setOnAction(actionEvent -> {
            back_button.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/sample.fxml"));
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
        });
    }
}
