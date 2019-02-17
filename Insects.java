package insects.com;

public class Insects {
	private String name;
	private int mass;
	private double speed;
	private String livingArea;
	private boolean isPoison; 
	static private int wingspan=150;
	protected String food;
	protected boolean isInRedBook; 

	public Insects() {	};

	public Insects(String name, int mass, double speed, String livingArea) {
		this.name=name;
		this.mass=mass;
		this.speed=speed;
		this.livingArea=livingArea;
		
	}

	public Insects(String name, int mass, double speed, String livingArea, boolean isPoison, int wingspan,
			String food, boolean isInRedBook) {
        this(name,mass,speed,livingArea);
		this.isPoison = isPoison;
		this.food = food;
		this.isInRedBook = isInRedBook;
		
	}

	public String toString() {
		return "The data about this kind :" + name + " " + mass + " " + speed + " " + livingArea;
	}

	public String tostring() {
		return "All data about this kind " + name + " " + mass + " " + speed + " " + livingArea + " " + isPoison + " " + wingspan + " "
				+ food + " " + isInRedBook;
	}

	public void printStaticWingspan() {
		System.out.println("The printStaticWingspan : " + wingspan);
	}
	public void printWingspan() {
		System.out.println("The printWingspan is : " + wingspan);
	}

	public String getName() {
		return name;
	}

	public int getMass() {
		return mass;
	}

	public double getSpeed() {
		return speed;
	}

	public String getLivingArea() {
		return livingArea;
	}

	public boolean getIsPoison() {
		return isPoison;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setIsPoison(boolean isPoison) {
		this.isPoison = isPoison;
	}

	public void setLivingArea(String livingArea) {
		this.livingArea = livingArea;
	}

	public void resetValues(String name, int mass, double speed, String livingArea, boolean isPoison,
			String food, boolean isInRedBook) {
		this.name = name;
		this.mass = mass;
		this.speed = speed;
		this.livingArea = livingArea;
		this.isPoison = isPoison;
		this.food = food;
		this.isInRedBook = isInRedBook;
	}
}
