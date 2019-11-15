package StartUp;


import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class NewGame {
 	private Scene scene;
	private Canvas canvas;
	private GraphicsContext gc;

	private Element PTS1000;
	private Element PTS100;
	private Element  PTS1500;
	private Element  PTS2000;
	private Element  PTS4000;
	private Element  PTS500;
	private Element  BURGER;
	private Element  PETERDEAD;
	private Element  PETERRIGHTMOVE;
	private Element  PETERLEFTMOVE;
	private Element  PETERBACKMOVE;
	private Element  PETERFRONTMOVE;
	private Element  PETERBACK;
	private Element  PETERFRONT;
	private Element  PICKLEL;
	private Element  PICKLER;
	private Element  EGGL;
	private Element  EGGR;
	private Element  HOTDOGL;
	private Element  HOTDOGR;
	private Element  BUNTOP;
	private Element  BUNBOTTOM;
	private Element  TOMATO;
	private Element  LETTUCE;
	private Element  CHEESE;
	private Element  FRIES;
	private Element  COFFEE;
	private Element  ICECREAM;
	private StackPane pane;
	

	public NewGame() {
		this.pane = new StackPane();
		this.scene = new Scene(pane, 800, 800, Color.WHITE);	
		this.canvas = new Canvas(800, 800);
		this.gc = canvas.getGraphicsContext2D();
		
		this.PTS1000 = new Element(0,0,Element.PTS1000_TYPE);
		this.PTS100 = new Element(0,0,Element.PTS100_TYPE);
		this.PTS1500 = new Element(0,0,Element.PTS1500_TYPE);
		this.PTS2000 = new Element(0,0,Element.PTS2000_TYPE);
		this.PTS4000 = new Element(0,0,Element.PTS4000_TYPE);
		this.PTS500 = new Element(0,0,Element.PTS500_TYPE);
		this.BURGER = new Element(0,0,Element.BURGER_TYPE);
		this.PETERDEAD = new Element(0,0,Element.PETERDEAD_TYPE);
		this.PETERRIGHTMOVE = new Element(0,0,Element.PETERRIGHTMOVE_TYPE);
		this.PETERLEFTMOVE = new Element(0,0,Element.PETERLEFTMOVE_TYPE);
		this.PETERBACKMOVE = new Element(0,0,Element.PETERBACKMOVE_TYPE);
		this.PETERFRONTMOVE = new Element(0,0,Element.PETERFRONTMOVE_TYPE);
		this.PETERBACK = new Element(0,0,Element.PETERBACK_TYPE);
		this.PETERFRONT = new Element(0,0,Element.PETERFRONT_TYPE);
		this.PICKLEL = new Element(0,0,Element.PICKLEL_TYPE);
		this.PICKLER = new Element(0,0,Element.PICKLER_TYPE);
		this.EGGL = new Element(0,0,Element.EGGL_TYPE);
		this.EGGR = new Element(0,0,Element.EGGR_TYPE);
		this.HOTDOGL = new Element(0,0,Element.HOTDOGL_TYPE);
		this.HOTDOGR = new Element(0,0,Element.HOTDOGR_TYPE);
		this.BUNTOP = new Element(0,0,Element.BUNTOP_TYPE);
		this.BUNBOTTOM = new Element(0,0,Element.BUNBOTTOM_TYPE);
		this.TOMATO = new Element(0,0,Element.TOMATO_TYPE);
		this.LETTUCE = new Element(0,0,Element.LETTUCE_TYPE);
		this.CHEESE = new Element(0,0,Element.CHEESE_TYPE);
		this.FRIES = new Element(0,0,Element.FRIES_TYPE);
		this.COFFEE = new Element(0,0,Element.COFFEE_TYPE);
		this.ICECREAM = new Element(0,0,Element.ICECREAM_TYPE);
		
		this.setProperties();
	}


	private void setProperties() {
		this.gc.setFill(Color.rgb(13, 49, 61));
		this.gc.fillRect(0,0,800,800);

//		this.showImages();
		
		pane.getChildren().add(this.canvas);
	}


	private void showImages() {
		ImageView iv = new ImageView();
		this.PTS1000.render(iv);
		this.PTS100.render(iv);
		this.PTS1500.render(iv);
		this.PTS2000.render(iv);
		this.PTS4000.render(iv);
		this.PTS500.render(iv);
		this.BURGER.render(iv);
		this.PETERDEAD.render(iv);
		this.PETERRIGHTMOVE.render(iv);
		this.PETERLEFTMOVE.render(iv);
		this.PETERBACKMOVE.render(iv);
		this.PETERFRONTMOVE.render(iv);
		this.PETERBACK.render(iv);
		this.PETERFRONT.render(iv);
		this.PICKLEL.render(iv);
		this.PICKLER.render(iv);
		this.EGGL.render(iv);
		this.EGGR.render(iv);
		this.HOTDOGL.render(iv);
		this.HOTDOGR.render(iv);
		this.BUNTOP.render(iv);
		this.BUNBOTTOM.render(iv);
		this.TOMATO.render(iv);
		this.LETTUCE.render(iv);
		this.CHEESE.render(iv);
		this.FRIES.render(iv);
		this.COFFEE.render(iv);
		this.ICECREAM.render(iv);
		
	}


	public Scene getScene() {
		return this.scene;
	}
	
	
	
}








