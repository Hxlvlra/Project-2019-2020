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
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Instructions {
	private AnchorPane pane;
	private Scene scene;
	private GraphicsContext gc;
	private Canvas canvas;
	private MainScreen mainscreen;

	// add a parameter for the reason: 0 for lose, 1 for win
	Instructions(MainScreen mainscreen){
		this.pane = new AnchorPane();
		this.scene = new Scene(pane, 800, 800);
		this.canvas = new Canvas(800, 800);
		this.gc = canvas.getGraphicsContext2D();
		this.mainscreen = mainscreen;
		this.setProperties();
	}
	
	private void setProperties(){
		this.gc.setFill(Color.rgb(13, 49, 61));
		this.gc.fillRect(0,0,800,800);
		Font Header = Font.font("Press Start 2P",FontWeight.BOLD,40);
		this.gc.setFont(Header);
		this.gc.setFill(Color.rgb(100, 162, 100));
		this.gc.fillText("Instructions", 50, 100);
		
		Font content = Font.font("Press Start 2P",FontWeight.BOLD,15);
		Text howTo = new Text();
		howTo.setFont(content);
		howTo.setTextAlignment(TextAlignment.JUSTIFY);
		howTo.setFill(Color.rgb(100, 162, 100));
		howTo.setLayoutX(50);
		howTo.setLayoutY(130);
		howTo.setLineSpacing(10);
		howTo.setText("Playing as Chef Peter Pepper, player is chased by hotdogs, pickles and fried eggs up and down ladders and across platforms.\n"
				+ "On each stage, a number of  complete burgers are to be assembled. "
				+ "Each burger must be dropped to the bottom in its designated holding place. "
				+ "This is done by running across the buns, burger patties, lettuce and tomato slices. "
				+ "Every time that player runs across a part of the burger, it drops down one level. "
				+ "When all of the burgers are done, the level is complete.\n"
				+ "Picking up food icons that appear on the platforms and defeating enemies awards the player extra points.\n"
				+ "\nUse the the arrow keys to move Chef Peter Pepper\n"
				+ "\nUse the space bar to activate Chef Peter Pepper's pepper shaker.\n"
				+ "\nGood Luck!!!"
				);
		howTo.setWrappingWidth(700);
		
		Font button = Font.font("Press Start 2P",FontWeight.BOLD,10);	//set font type, style and size	
		Button backtomain = new Button("Return");
		backtomain.setFont(button);
		backtomain.setLayoutX(660);
		backtomain.setLayoutY(70);
		this.addEventHandler(backtomain);
		
		pane.getChildren().addAll(this.canvas, backtomain, howTo);
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