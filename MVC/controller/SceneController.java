package MVC.controller;

import MVC.view.LoginView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
    private static Scene scene;
    private static Scene customer;
    private static Scene admin;
    private static Scene staff;

    public enum Scenes {
        LOGIN,
        CUSTOMER,
        ADMIN,
        STAFF
    }

    public static void setScene(Stage stage, Scenes scene) {
        switch (scene) {
            case LOGIN:
                Scene login = new Scene(LoginView.getInstance());
                stage.setScene(login);
                break;
            
            case CUSTOMER:
                Scene customer = new Scene(null);
                stage.setScene(customer);
                break;

            case ADMIN:
                Scene admin = new Scene(null);
                stage.setScene(admin);
                break;

            case STAFF:
                Scene staff = new Scene(null);
                stage.setScene(staff);
                break;

            default:
                break;
        }
    }
}
