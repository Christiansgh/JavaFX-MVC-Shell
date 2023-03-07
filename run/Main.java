package run;
import MVC.controller.SceneController;
import MVC.controller.StageController;
import MVC.controller.SceneController.Scenes;
import javafx.application.Application;
import javafx.stage.Stage;

/*
 * MVC:
 * - Model er vores database
 * - View er vores scenes
 * - Controlleren kontrollerer logikken.
 * 
 * Ejer: CRUD
 *  - Personlige oplysninger
 *  - Preferencer
 *  - Fremskridt
 * 
 * Personale:
 *  - Checke besøgende ind og ud
 *      - Søg på medlemsnummer -> vis billede og navn.
 *          - 1 knap som toggler checket ind / checket ud.
 *              - Må gerne skifte farve, og måske animeres?
 * 
 *  - Bekræfte identitet
 *      - Billede
 *      - Navn
 * 
 * Medlem:
 *  - Login
 *  - Opdatere Oplysninger
 */

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage = StageController.getInstance();
        stage.setTitle("Løgstør Fitness");
        //stage.getIcons().add(); //TODO

        
        //stage.setScene(SceneController.getLogin());
        SceneController.setScene(stage, Scenes.LOGIN);

        stage.show();
    }
}
