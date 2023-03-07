package MVC.view;

import javafx.scene.layout.AnchorPane;

public class LoginView  {
    private static AnchorPane loginView = null;
    private LoginView() {};

    public static AnchorPane getInstance() {
        if (loginView == null) {
            loginView = new AnchorPane();
        }

        return loginView;
    }
} 
