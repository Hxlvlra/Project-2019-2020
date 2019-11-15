package StartUp;
	
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage){
		MainScreen mainscreen = new MainScreen();
		mainscreen.setStage(stage);
	}

}
