import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ShoppingMall {

	private static ArrayList<Item> items = new ArrayList<Item>(); //Item type arraylist which will hold the items added

	public ArrayList<Item> getItems(){ //a method which returns the items inside of this arraylist

		ArrayList<Item> getitem=new ArrayList<Item>();

		for(int i=0; i<=items.size()-1; i--) //by loop transfering items inside arraylist to arraylist which will be returned
			   getitem.add(items.get(i));

		return getitem;

	}

	public void printContent(){ //method which is iteratoring on arraylist and if the iterator come across Vegan typed item
								//it will use its madeOf method

		for(Item iterator: items)
			if(iterator instanceof Vegan)
				((Vegan) iterator).madeOf();
	}

	public void printWashingInstructions(){//method which is iteratoring on arraylist and if the iterator come across Washable typed item
										//it will use its howToWash method

		for(Item iterator: items)
			if(iterator instanceof Washable)
				((Washable) iterator).howToWash();
	}

	public void addDairy(){ //a method which adds new created dairy object to items arraylist

		Item newDairy=new Dairy();
		items.add(newDairy);
	}

	public void addFruit(){	//a method which adds new created fruit object to items arraylist

		Item newFruit=new Fruit();
		items.add(newFruit);
	}

	public void addTop(){ //a method which adds new created top object to items arraylist

		Item newTop=new Top();
		items.add(newTop);
	}

	public void addTrousers(){ //a method which adds new created trousers object to items arraylist

		Item newTrousers=new Trousers();
		items.add(newTrousers);
	}

	public void addUnderware(){ //a method which adds new created underware object to items arraylist

		Item newUnderware=new Underware();
		items.add(newUnderware);
	}

	public void addVegetable(){ //a method which adds new created vegetable object to items arraylist

		Item newVegetable=new Vegetable();
		items.add(newVegetable);
	}

	public void addArbitrary(Item item){ //a method which adds new created object with any type and initialized value

		items.add(item);
	}

	public double bill(){ //calculating bill method : which calculates every classes' calculatePrice value by iterating
							//and returning the total value

		double totalPrice=0;
		for(Item iterator: items)
			totalPrice+=iterator.calculatePrice();

		return totalPrice;
	}



}
