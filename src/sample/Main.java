package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends Application {
    public static ArrayList<String> arr=new ArrayList<String >();
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Ala-too");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setResizable(false);
        primaryStage.show();

    }


    public static void main(String[] args) throws SQLException {
        DBworker worker = new DBworker();
        String query ="select * FROM [Students].[dbo].[Studnets]";
        try{
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet =statement.executeQuery(query);

            while (resultSet.next()){
                Users users = new Users();
                users.setName(resultSet.getString(1));
                arr.add(resultSet.getString(1).replaceAll("\\s+",""));

            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }



        launch(args);

}}
