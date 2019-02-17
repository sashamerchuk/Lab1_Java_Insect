package insects.com;

public class Main {

	public static void main(String[] args) {
		Insects insect1 = new Insects();
		Insects insect2 = new Insects("Mosquito",23,15.2, "USA");
		Insects insect3 = new Insects("Mosquito", 25,17.2,"USA",true,132,"Bread",true);
		System.out.println("Without parameters : " + insect1.toString());
		System.out.println("With only 4 parameters : " + insect2.toString());
		System.out.println("With all parameters : " + insect3.tostring());
		
		System.out.println("The print static of insect1 ");
		insect1.printStaticWingspan();
		insect1.printWingspan();
		
		System.out.println("The print static of insect2 ");
		insect2.printStaticWingspan();
		insect2.printWingspan();
		
		System.out.println("The print static of insect3 ");
		
		insect3.printStaticWingspan();
		insect3.printWingspan();
	}

}
