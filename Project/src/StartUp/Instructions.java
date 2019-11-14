package StartUp;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Instructions {
	private AnchorPane pane;
	private Scene scene;
	private GraphicsContext gc;
	private Canvas canvas;

	// add a parameter for the reason: 0 for lose, 1 for win
	Instructions(){
		this.pane = new AnchorPane();
		this.scene = new Scene(pane, 800, 800);
		this.canvas = new Canvas(800, 800);
		this.gc = canvas.getGraphicsContext2D();
		this.setProperties();
	}
	
	private void setProperties(){
		
		this.gc.setFill(Color.rgb(13, 49, 61));					//set color of background
		this.gc.fillRect(0,0,800,800);
		Font Header = Font.font("Garamond",FontWeight.BOLD,40);	//set font type, style and size
		this.gc.setFont(Header);
		this.gc.setFill(Color.rgb(100, 162, 100));										//set font color of text
		this.gc.fillText("About Page", 25, 50);
		Font content = Font.font("Garamond",FontWeight.BOLD,20);
		this.gc.setFont(content);
		// di ko pa alam kung paano gawin na field para ma wrap text sana. kailangan ng edit
		// mas maganda ata na text nalang.
		this.gc.fillText("Chef Peter Pepper starts off in the center of the very bottom platform at the beginning of each level.", 25, 70);
		this.gc.fillText("Each burger must be dropped to the bottom in its designated holding place. ", 25, 90);
		this.gc.fillText("Use the pepper shaker if you become cornered or fear that you cannot outrun nearby opponents.", 25, 110);		
		this.gc.fillText("You will have an unlimited amount of time to complete each stage.", 25, 130);
		
		Button backtomain = new Button("Return");
		backtomain.setLayoutX(700);
		backtomain.setLayoutY(20);
		this.addEventHandler(backtomain);
		
		pane.getChildren().addAll(this.canvas, backtomain);
	}
	
	private void addEventHandler(Button btn) {
		// TODO Auto-generated method stub
		btn.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				// dito sana may return to main menu, pero di ko pa natry so exit palang yung ginagawa niya.
				System.exit(0);
				
			}
		});
		
	}
	
	Scene getScene(){
		return this.scene;
	}
}