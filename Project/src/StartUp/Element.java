package StartUp;


public class Element extends Sprite{
	private String name;
	
	// set the filename of the images to be used
	public final static String PTS1000_IMAGE = "images/1000pts.png";
	public final static String PTS100_IMAGE = "images/100pts.png";
	public final static String PTS1500_IMAGE = "images/1500pts.png";
	public final static String PTS2000_IMAGE = "images/2000pts.png";
	public final static String PTS4000_IMAGE = "images/4000pts.png";
	public final static String PTS500_IMAGE = "images/500pts.png";
	public final static String BURGER_IMAGE = "images/Burger.png";
	public final static String PETERDEAD_IMAGE = "images/ChefPeterPepperDead.gif";
	public final static String PETERRIGHTMOVE_IMAGE = "images/ChefPeterPepperR.gif";
	public final static String PETERLEFTMOVE_IMAGE = "images/ChefPeterPepperL.gif";
	public final static String PETERBACKMOVE_IMAGE = "images/ChefPeterPepperB.gif";
	public final static String PETERFRONTMOVE_IMAGE = "images/ChefPeterPepperF.gif";
	public final static String PETERBACK_IMAGE = "images/ChefPeterPepperB.png";
	public final static String PETERFRONT_IMAGE = "images/ChefPeterPepperF.png";
	public final static String PICKLEL_IMAGE = "images/MrHotDogR.gif";
	public final static String PICKLER_IMAGE = "images/MrPickleR.gif";
	public final static String EGGL_IMAGE = "images/MrEggL.gif";
	public final static String EGGR_IMAGE = "images/MrEggR.gif";
	public final static String HOTDOGL_IMAGE = "images/MrHotDogL.gif";
	public final static String HOTDOGR_IMAGE = "images/MrHotDogR.gif";
	public final static String BUNTOP_IMAGE = "images/BurgerBunTop.png";
	public final static String BUNBOTTOM_IMAGE = "images/BurgerBunBottom.png";
	public final static String TOMATO_IMAGE = "images/Tomato.png";
	public final static String LETTUCE_IMAGE = "images/Lettuce.png";
	public final static String CHEESE_IMAGE = "images/Cheese.png";
	public final static String FRIES_IMAGE = "images/FrenchFries.png";
	public final static String COFFEE_IMAGE = "images/Coffee.png";
	public final static String ICECREAM_IMAGE = "images/IceCreamCone.png";
	
	// set the string type of each to the corresponding value
	public final static String PTS1000_TYPE = "1000 pts";
	public final static String PTS100_TYPE  = "100 pts";
	public final static String PTS1500_TYPE = "1500 pts";
	public final static String PTS2000_TYPE = "2000 pts";
	public final static String PTS4000_TYPE = "4000 pts";
	public final static String PTS500_TYPE = "500 pts";
	public final static String BURGER_TYPE = "burger patty";
	public final static String PETERDEAD_TYPE = "chef dead";
	public final static String PETERRIGHTMOVE_TYPE = "chef moving right";
	public final static String PETERLEFTMOVE_TYPE = "chef moving left";
	public final static String PETERBACKMOVE_TYPE = "chef move back";
	public final static String PETERFRONTMOVE_TYPE = "chef moving front";
	public final static String PETERBACK_TYPE = "chef front";
	public final static String PETERFRONT_TYPE = "chef back";
	public final static String PICKLEL_TYPE = "pickle move left";
	public final static String PICKLER_TYPE = "pickle move right";
	public final static String EGGL_TYPE = "egg move left";
	public final static String EGGR_TYPE = "egg move right";
	public final static String HOTDOGL_TYPE = "hotdog move left";
	public final static String HOTDOGR_TYPE = "hotdog move right";
	public final static String BUNTOP_TYPE = "top bun";
	public final static String BUNBOTTOM_TYPE = "bottom bun";
	public final static String TOMATO_TYPE = "tomato";
	public final static String LETTUCE_TYPE = "lettuce";
	public final static String CHEESE_TYPE = "cheese";
	public final static String FRIES_TYPE = "french fries";
	public final static String COFFEE_TYPE = "coffee";
	public final static String ICECREAM_TYPE = "ice cream cone";

	public Element(double xPos, double yPos, String name) {
		super(xPos,yPos);
		this.name = name;
		
		//call the loadImage method depending on the object type
				if (this.name.equals(Element.PTS1000_TYPE)) 
					this.loadImage(Element.PTS1000_IMAGE, 70,70);
				else if (this.name.equals(Element.PTS100_TYPE)) 
					this.loadImage(Element.PTS100_IMAGE, 70,70);
				else if (this.name.equals(Element.PTS1500_TYPE)) 
					this.loadImage(Element.PTS1500_IMAGE, 70,70);
				else if (this.name.equals(Element.PTS2000_TYPE)) 
					this.loadImage(Element.PTS2000_IMAGE, 70,70);
				else if (this.name.equals(Element.PTS4000_TYPE)) 
					this.loadImage(Element.PTS4000_IMAGE, 70,70);
				else if (this.name.equals(Element.PTS500_TYPE)) 
					this.loadImage(Element.PTS500_IMAGE, 70,70);
				else if (this.name.equals(Element.BURGER_TYPE)) 
					this.loadImage(Element.BURGER_IMAGE, 70,70);
				else if (this.name.equals(Element.PETERDEAD_TYPE)) 
					this.loadImage(Element.PETERDEAD_IMAGE, 70,70);
				else if (this.name.equals(Element.PETERRIGHTMOVE_TYPE)) 
					this.loadImage(Element.PETERRIGHTMOVE_IMAGE, 70,70);
				else if (this.name.equals(Element.PETERLEFTMOVE_TYPE)) 
					this.loadImage(Element.PETERLEFTMOVE_IMAGE, 70,70);
				else if (this.name.equals(Element.PETERBACKMOVE_TYPE)) 
					this.loadImage(Element.PETERBACKMOVE_IMAGE, 70,70);
				else if (this.name.equals(Element.PETERFRONTMOVE_TYPE)) 
					this.loadImage(Element.PETERFRONTMOVE_IMAGE, 70,70);
				else if (this.name.equals(Element.PETERBACK_TYPE)) 
					this.loadImage(Element.PETERBACK_IMAGE, 70,70);
				else if (this.name.equals(Element.PETERFRONT_TYPE)) 
					this.loadImage(Element.PETERFRONT_IMAGE, 70,70);
				else if (this.name.equals(Element.PICKLEL_TYPE)) 
					this.loadImage(Element.PICKLEL_IMAGE, 70,70);
				else if (this.name.equals(Element.PICKLER_TYPE)) 
					this.loadImage(Element.PICKLER_IMAGE, 70,70);
				else if (this.name.equals(Element.EGGL_TYPE)) 
					this.loadImage(Element.EGGL_IMAGE, 70,70);
				else if (this.name.equals(Element.EGGR_TYPE)) 
					this.loadImage(Element.EGGR_IMAGE, 70,70);
				else if (this.name.equals(Element.HOTDOGL_TYPE)) 
					this.loadImage(Element.HOTDOGL_IMAGE, 70,70);
				else if (this.name.equals(Element.HOTDOGR_TYPE)) 
					this.loadImage(Element.HOTDOGR_IMAGE, 70,70);
				else if (this.name.equals(Element.BUNTOP_TYPE)) 
					this.loadImage(Element.BUNTOP_IMAGE, 70,70);
				else if (this.name.equals(Element.BUNBOTTOM_TYPE)) 
					this.loadImage(Element.BUNBOTTOM_IMAGE, 70,70);
				else if (this.name.equals(Element.TOMATO_TYPE)) 
					this.loadImage(Element.TOMATO_IMAGE, 70,70);
				else if (this.name.equals(Element.LETTUCE_TYPE)) 
					this.loadImage(Element.LETTUCE_IMAGE, 70,70);
				else if (this.name.equals(Element.CHEESE_TYPE)) 
					this.loadImage(Element.CHEESE_IMAGE, 70,70);
				else if (this.name.equals(Element.FRIES_TYPE)) 
					this.loadImage(Element.FRIES_IMAGE , 70,70);
				else if (this.name.equals(Element.COFFEE_TYPE )) 
					this.loadImage(Element.COFFEE_IMAGE, 70,70);
				else if (this.name.equals(Element.ICECREAM_TYPE)) 
					this.loadImage(Element.ICECREAM_IMAGE, 70,70);

	}

	//getter method
	String getName(){
		return this.name;
	}

	
}
