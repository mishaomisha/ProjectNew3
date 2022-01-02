package original.view;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import original.Main;

import java.util.ArrayList;

public abstract class NewGrop extends VBox {
    private ArrayList<Button> choose = new ArrayList<Button>();
    private TextField name = new TextField();
    public NewGrop(){

        Label channelName = new Label("  Name Grop");
        Label listPeopleChannel = new Label("  choose people inside Grop");
        ObservableList data =  FXCollections.observableArrayList();
        final ListView listView = new ListView(data);
        listView.setPrefSize(300, 350);
        listView.setEditable(true);
        for (int i = 0; i < 6; i++) {//Main.Person.size()+1
            Label personUsername = new Label("username");//Main.Person.get(i).getUserName()
            getChoose().add(new Button("choose"));
            HBox person = new HBox(personUsername, getChoose().get(i));
            person.setSpacing(260);
            data.add(person);
        }
        listView.setItems(data);
        StackPane root = new StackPane();
        root.getChildren().add(listView);
        this.getChildren().addAll(channelName, getName(),listPeopleChannel,root);
        this.setSpacing(10);
        this.setMaxWidth(300);
    }

    public ArrayList<Button> getChoose() {
        return choose;
    }

    public void setChoose(ArrayList<Button> choose) {
        this.choose = choose;
    }

    public TextField getName() {
        return name;
    }

    public void setName(TextField name) {
        this.name = name;
    }
}
