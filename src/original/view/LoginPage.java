package original.view;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class LoginPage extends TabPane {
    private TextField entered_Username;
    private PasswordField entered_password;
    private Button Enter_login;
    private Button Enter_sighnin;

    public LoginPage() {
        Image imagefirstpage = new Image("https://cdn.wallpapersafari.com/69/19/iLajcO.jpg");
        Label username = new Label("    Username");
        username.setTextFill(Color.GREEN);
        username.setFont(Font.font ("FontPosture.ITALIC", 18));
        username.setAlignment(Pos.CENTER);
        username.setPrefHeight(30);
        setEntered_Username(new TextField());
        Label password = new Label("    password");
        password.setPrefHeight(30);
        password.setAlignment(Pos.CENTER);
        password.setTextFill(Color.BLUE);
        password.setFont(Font.font ("FontPosture.ITALIC", 18));
        setEntered_password(new PasswordField());
        Enter_login = new Button("login");
        Enter_login.setPrefHeight(30);
        Enter_login.setPrefWidth(240);
        VBox boxlogin = new VBox(username, getEntered_Username(), password, getEntered_password(), getEnter_login());
        boxlogin.setAlignment(Pos.TOP_LEFT);
        boxlogin.setMaxWidth(240);
        boxlogin.setPrefHeight(50);
        boxlogin.setSpacing(20);
        Tab login = new Tab("longin", boxlogin);

        Label username2 = new Label("    Username");
        username2.setTextFill(Color.GREEN);
        username2.setFont(Font.font ("FontPosture.ITALIC", 18));
        username2.setPrefHeight(30);
        username2.setAlignment(Pos.CENTER);
        setEntered_Username(new TextField());
        Label password2 = new Label("    password");
        password2.setPrefHeight(30);
        password2.setAlignment(Pos.CENTER);
        password2.setTextFill(Color.BLUE);
        password2.setFont(Font.font ("FontPosture.ITALIC", 18));
        setEntered_password(new PasswordField());
        Enter_sighnin = new Button("sighn in");
        Enter_sighnin.setPrefHeight(30);
        Enter_sighnin.setPrefWidth(240);
        VBox boxsighnin = new VBox(username2, getEntered_Username(), password2, getEntered_password(), Enter_sighnin);
        boxsighnin.setAlignment(Pos.TOP_LEFT);
        boxsighnin.setMaxWidth(240);
        boxsighnin.setMaxHeight(50);
        boxsighnin.setSpacing(20);
        Tab Sighnin = new Tab("Sighn in", boxsighnin);

        this.getTabs().add(login);
        this.getTabs().add(Sighnin);

    }

    public TextField getEntered_Username() {
        return entered_Username;
    }

    public void setEntered_Username(TextField entered_Username) {
        this.entered_Username = entered_Username;
    }

    public PasswordField getEntered_password() {
        return entered_password;
    }

    public void setEntered_password(PasswordField entered_password) {
        this.entered_password = entered_password;
    }

    public Button getEnter_login() {
        return Enter_login;
    }

    public void setEnter_login(Button enter_login) {
        Enter_login = enter_login;
    }

    public Button getEnter_sighnin() {
        return Enter_sighnin;
    }

    public void setEnter_sighnin(Button enter_sighnin) {
        Enter_sighnin = enter_sighnin;
    }
}

