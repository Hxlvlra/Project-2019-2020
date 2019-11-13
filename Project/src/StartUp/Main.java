package StartUp;
	
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	public void start(Stage stage){
		// TODO Auto-generated method stub
		MainScreen mainscreen = new MainScreen();
		mainscreen.setStage(stage);
	}

}
