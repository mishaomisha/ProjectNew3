package original;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import original.model.Channel;
import original.model.Grop;
import original.model.Person;
import original.view.*;

import java.util.ArrayList;

public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }
    public static ArrayList<Person> Person = new ArrayList<Person>();
    public static ArrayList<Grop> Grop = new ArrayList<original.model.Grop>();
    public static ArrayList<Channel> Channel = new ArrayList<original.model.Channel>();
    @Override
    public void start(Stage primaryStage) throws Exception {
        NewChannel newChannel = new NewChannel() {
        };
        ChatBoxChannel chat = new ChatBoxChannel() {
        };
        LeftSideMainPage leftSideMainPage = new LeftSideMainPage() {
        };
        NewGrop newGrop = new NewGrop() {
        };
        ListPeople listPeople = new ListPeople(){
        };
        primaryStage.setScene(new Scene(listPeople));
        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.show();
    }

}
