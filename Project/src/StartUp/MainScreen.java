package StartUp;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;


public class MainScreen {
	private AnchorPane pane;
	private Scene scene;
	public Stage stage;
	private GraphicsContext gc;
	private Canvas canvas;	
	
	public final static String NEW_GAME = "new game";
	public final static String INSTRUCTIONS = "instructions";
	public final static String ABOUT = "about";

	public final Image bg = new Image("images/dark.jpg",800,800,false,false);
	public final Image header = new Image("images/BT.jpg", 600, 189, false, false);
	
	// add a parameter for the reason: 0 for lose, 1 for win
	MainScreen(){
		this.pane = new AnchorPane();
		this.scene = new Scene(pane, 800, 800);
		this.canvas = new Canvas(800, 800);
		this.gc = canvas.getGraphicsContext2D();
	}
	
	//method to add the stage elements
	public void setStage(Stage stage) {
		this.stage = stage;

		this.gc.drawImage(bg, 0, 0);
//		this.gc.drawImage(header, 100, 50);
		Font Header = Font.font("Press Start 2P",FontWeight.BOLD,60);	//set font type, style and size
		this.gc.setFont(Header);
		this.gc.setFill(Color.WHITE);	//set font color of text
		this.gc.fillText("BURGER TIME", 50, 150);

		Font button = Font.font("Press Start 2P",FontWeight.BOLD,16);	//set font type, style and size

		Button newGame = new Button("Start New Game");
		newGame.setFont(button);
		newGame.setId(MainScreen.NEW_GAME);
		newGame.setLayoutX(300);
		newGame.setLayoutY(300);
		this.addEventHandler(newGame);
		
		Button instructions = new Button("How to Play");
		instructions.setFont(button);
		instructions.setId(MainScreen.INSTRUCTIONS);
		instructions.setLayoutX(300);
		instructions.setLayoutY(400);
		this.addEventHandler(instructions);

		Button about = new Button("About the Game");
		about.setFont(button);
		about.setId(MainScreen.ABOUT);
		about.setLayoutX(300);
		about.setLayoutY(500);
		this.addEventHandler(about);
				
		
		//set stage elements here
		pane.getChildren().addAll(this.canvas, newGame, instructions, about);
		
		this.stage.setTitle("Modified Burger Time Game");
		this.stage.setScene(this.scene);
		this.stage.show();
	}

	private void doGameOption(String id){
		
		PauseTransition pause = new PauseTransition(Duration.seconds(0.5));
		pause.setOnFinished(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (id == MainScreen.ABOUT) {
					AboutPage aboutpage = new AboutPage();
					stage.setScene(aboutpage.getScene());
				} else if (id == MainScreen.INSTRUCTIONS) {
					Instructions instructions = new Instructions();
					stage.setScene(instructions.getScene());
//				} else if (id == MainScreen.NEW_GAME) {
//					NewGame newgame = new NewGame();
//					stage.setScene(newgame.getScene());					
				}
				
			}
		});
		pause.play();
	}
	
	private void addEventHandler(Button btn) {

		btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if (btn.getId() == MainScreen.NEW_GAME) {
					doGameOption(btn.getId());
				} else if (btn.getId() == MainScreen.INSTRUCTIONS) {
					doGameOption(btn.getId());
				} else if (btn.getId() == MainScreen.ABOUT) {
					doGameOption(btn.getId());
				}
				
			}
		});

		
	}
	
	Scene getScene(){
		return this.scene;
	}

	Stage getStage() {
		return this.stage;
	}
}
