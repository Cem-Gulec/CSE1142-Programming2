
public class Test {

	public static ShoppingMall newSM=new ShoppingMall();

	public static void main(String[] args) {

		newSM.addDairy(); //new objects created
		newSM.addFruit();
		newSM.addTop();
		newSM.addTrousers();
		newSM.addUnderware();
		newSM.addVegetable();
		newSM.addArbitrary(new Top(100)); //new Top object is created with initialized 100 value

		printContent(); //using printContent method which is defined
		System.out.print("\n");

		printWashingInstructions(); //using printWashingInstructions method which is defined
		System.out.print("\n");


		System.out.println("Total bill is "+newSM.bill()); //printing out the bill value

	}

	public static void printContent(){ // printContent & printWashingInstructions methods that uses objects' print methods

		newSM.printContent();
	}

	public static void printWashingInstructions(){


		newSM.printWashingInstructions();

	}

}
