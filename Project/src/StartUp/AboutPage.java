package StartUp;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class AboutPage {
	private AnchorPane pane;
	private Scene scene;
	private GraphicsContext gc;
	private Canvas canvas;
	private MainScreen mainscreen;
	
			
	// add a parameter for the reason: 0 for lose, 1 for win
	AboutPage(MainScreen mainscreen){
		this.pane = new AnchorPane();
		this.scene = new Scene(pane, 800, 800);
		this.canvas = new Canvas(800, 800);
		this.gc = canvas.getGraphicsContext2D();
		this.mainscreen = mainscreen;
		this.setProperties();
	}
	
	private void setProperties(){
		this.gc.setFill(Color.rgb(13, 49, 61));					//set color of background
		this.gc.fillRect(0,0,800,800);
		Font Header = Font.font("Press Start 2P",FontWeight.BOLD,40);	//set font type, style and size
		this.gc.setFont(Header);
		this.gc.setFill(Color.rgb(100, 162, 100));										//set font color of text
		this.gc.fillText("About Page", 25, 40);
		Font content = Font.font("Press Start 2P",FontWeight.BOLD,20);
		this.gc.setFont(content);
		this.gc.fillText("Known as BurgerTime in the U.S., this game had an original title of Hamburger when it was first released to Japanese audiences in 1982.", 25, 65);

		Font button = Font.font("Press Start 2P",FontWeight.BOLD,16);	//set font type, style and size
		
		Button backtomain = new Button("Return");
		backtomain.setFont(button);
		backtomain.setLayoutX(700);
		backtomain.setLayoutY(20);
		this.addEventHandler(backtomain);
		
		pane.getChildren().add(this.canvas);
		pane.getChildren().add(backtomain);
	}
	
	private void addEventHandler(Button btn) {
		btn.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent arg0) {
				mainscreen.getStage().setScene(mainscreen.getScene());
			}
		});
		
	}
	
	Scene getScene(){
		return this.scene;
	}
}