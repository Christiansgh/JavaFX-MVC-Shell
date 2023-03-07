package MVC.controller;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StageController {
    private static Stage stage = null;
    private StageController() {};

    public static Stage getInstance() {
        if(stage == null) {
            stage = new Stage(StageStyle.UNDECORATED);
        }

        return stage;
    }
}
