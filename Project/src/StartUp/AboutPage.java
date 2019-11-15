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
		this.gc.setFill(Color.rgb(13, 49, 61));
		this.gc.fillRect(0,0,800,800);
		Font Header = Font.font("Press Start 2P",FontWeight.BOLD,40);
		this.gc.setFont(Header);
		this.gc.setFill(Color.rgb(100, 162, 100));
		this.gc.fillText("About Page", 50, 100);

		Font content = Font.font("Press Start 2P",FontWeight.BOLD,15);
		Text about = new Text();
		about.setFont(content);
		about.setTextAlignment(TextAlignment.JUSTIFY);
		about.setFill(Color.rgb(100, 162, 100));
		about.setLayoutX(50);
		about.setLayoutY(130);
		about.setLineSpacing(10);
		about.setText("Known as BurgerTime in the U.S., this game had an original title of Hamburger when it was first released to Japanese audiences in 1982.\n"
				+ "\nThe player is chef Peter Pepper, who must walk over hamburger ingredients located across a maze of platforms while avoiding pursuing characters.\n"
				+"\nThis mini-game is a project of CMSC 22 students of AY 2019-2020 1st semester.\n"
				+ "AGUILAR,DANIEL PETE MALINGIN\r\n"
				+ "CRESPO,STEVEN DAVID ANGELES\r\n"
				+ "PEKAS,DAVID AVERY TUDLONG\r\n"
				);
		about.setWrappingWidth(700);
		
		Font button = Font.font("Press Start 2P",FontWeight.BOLD,10);
		Button backtomain = new Button("Return");
		backtomain.setFont(button);
		backtomain.setLayoutX(660);
		backtomain.setLayoutY(70);
		this.addEventHandler(backtomain);
		
		pane.getChildren().addAll(this.canvas, about);
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