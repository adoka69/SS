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

public class Controller2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField wr7;

    @FXML
    private TextField wr6;

    @FXML
    private TextField wr5;

    @FXML
    private TextField wr4;

    @FXML
    private TextField mid7;

    @FXML
    private TextField mid1;

    @FXML
    private TextField mid6;

    @FXML
    private TextField mid5;

    @FXML
    private TextField mid4;

    @FXML
    private TextField mid3;

    @FXML
    private TextField mid2;

    @FXML
    private TextField wr3;

    @FXML
    private TextField wr2;

    @FXML
    private TextField wr1;

    @FXML
    private Label fin1;

    @FXML
    private Label fin2;

    @FXML
    private Label fin3;

    @FXML
    private Label fin4;

    @FXML
    private Label fin5;

    @FXML
    private Label fin6;

    @FXML
    private Label fin7;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;
    @FXML
    private Button back_button;

    static int Solving(String m, String w){
    int b=0;
    int total=0;
            try
    {
        Integer.parseInt(m);
        int value = Integer.parseInt(m);
        if(value>=0&&value<=100){
            b=b+1;
        }
    }
            catch (NumberFormatException e)
    {
        System.out.println(m + " is not a valid integer number");
    }
            try
    {
        Integer.parseInt(w);
        int value = Integer.parseInt(w);
        if(value>=50&&value<=100){
            b=b+1;
        }

    }
            catch (NumberFormatException e)
    {
        System.out.println(w + " is not a valid integer number");
    }
        int value1 = Integer.parseInt(m);
        int value2 = Integer.parseInt(w);
        int check=(value2-(value1*40/100))*100/60;
            if(b==2&&check<=100){

        total = (value2-(value1*40/100))*100/60;

    }

        return total;
    }

    @FXML
    void initialize() {
        mid1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    mid1.setText(oldValue);
                } try {
                    if(Integer.parseInt(newValue)>100){
                        mid1.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        mid2.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    mid2.setText(oldValue);
                }try {
                    if(Integer.parseInt(newValue)>100){
                        mid2.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        mid3.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    mid3.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        mid3.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        mid4.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    mid4.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        mid4.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        mid5.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    mid5.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        mid5.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        mid6.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    mid6.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        mid6.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        mid7.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    mid7.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        mid7.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        wr1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    wr1.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        wr1.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        wr2.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    wr2.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        wr2.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        wr3.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    wr3.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        wr3.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        wr4.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    wr4.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        wr4.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        wr5.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    wr5.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        wr5.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        wr6.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    wr6.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        wr6.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }
            }
        });
        wr7.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    wr7.setText(oldValue);
                }
                try {
                    if(Integer.parseInt(newValue)>100){
                        wr7.setText(oldValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Use only integers!!!");
                }

            }
        });

        button1.setOnAction(actionEvent -> {
            String m1 = mid1.getText();
            String w1 = wr1.getText();
            if(Solving(m1,w1)>0){
                fin1.setText(String.valueOf(Solving(m1,w1)));}
            else {
                fin1.setText("Error");
            }
        });
        button2.setOnAction(actionEvent -> {
            String m1 = mid2.getText();
            String w1 = wr2.getText();
            if(Solving(m1,w1)>0){
                fin2.setText(String.valueOf(Solving(m1,w1)));}
            else {
                fin2.setText("Error");
            }
        });
        button3.setOnAction(actionEvent -> {
            String m1 = mid3.getText();
            String w1 = wr3.getText();
            if(Solving(m1,w1)>0){
                fin3.setText(String.valueOf(Solving(m1,w1)));}
            else {
                fin3.setText("Error");
            }
        });
        button4.setOnAction(actionEvent -> {
            String m1 = mid4.getText();
            String w1 = wr4.getText();
            if(Solving(m1,w1)>0){
                fin4.setText(String.valueOf(Solving(m1,w1)));}
            else {
                fin4.setText("Error");
            }
        });
        button5.setOnAction(actionEvent -> {
            String m1 = mid5.getText();
            String w1 = wr5.getText();
            if(Solving(m1,w1)>0){
                fin5.setText(String.valueOf(Solving(m1,w1)));}
            else {
                fin5.setText("Error");
            }
        });
        button6.setOnAction(actionEvent -> {
            String m1 = mid6.getText();
            String w1 = wr6.getText();
            if(Solving(m1,w1)>0){
                fin6.setText(String.valueOf(Solving(m1,w1)));}
            else {
                fin6.setText("Error");
            }
        });
        button7.setOnAction(actionEvent -> {
            String m1 = mid7.getText();
            String w1 = wr7.getText();
            if(Solving(m1,w1)>0){
                fin7.setText(String.valueOf(Solving(m1,w1)));}
            else {
                fin7.setText("Error");
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
    }}

