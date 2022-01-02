package original.Controller;
        import original.view.LoginPage;
        import original.model.Person;
        import original.Main;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.scene.Scene;
        import javafx.scene.layout.VBox;
        import javafx.stage.Stage;

public class LoginPageController extends VBox {
    LoginPage loginPage;
    Main main;
    public LoginPageController() {

        loginPage = new LoginPage();

    }
    public void loginButtonController() {
        loginPage.getEnter_login().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                for (Person i : Main.Person) {
                    if(loginPage.getEntered_Username().equals(i.getUserName())
                            && loginPage.getEntered_password().equals(i.getPassword())){
                        MainPageController mainPageController = new MainPageController();
                        loginPage.getScene().getWindow().hide();
                        Stage mainPageStage = new Stage();
                        mainPageStage.setScene(new Scene(mainPageController.MainPage()));

                    }

                }

            }
        });
    }

}