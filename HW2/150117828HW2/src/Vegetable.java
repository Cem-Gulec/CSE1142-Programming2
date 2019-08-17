
public class Vegetable extends Food implements Vegan, Washable {

	public Vegetable(){  //defining a constructor with a basePrice setting method

		super.setBasePrice(10.0);
	}

	public Vegetable(double basePrice){  //defining another constructor with a basePrice setting method initialized with given basePrice value
		super.setBasePrice(basePrice);
	}

	@Override
	public double calculatePrice(){						/*defining an overriden method which will later
												implement to calculatePrice abstract class in Item class*/

		double taxedPrice=getBasePrice()+(getVat()*getBasePrice());   		//calculating taxedPrice
		double profit=(taxedPrice*25)/100;							//calculating profit which will later return with taxedPrice
		return taxedPrice+profit;					// returning retail price


	}

	@Override
	public void howToWash(){		// defining a howToWash method which implements to abstract class in Washable interface
		System.out.println("Wash Vegetable with warm water.");
	}

	@Override
	public void madeOf(){			// defining a madeOf method which implements to abstract class in Vegan interface
		System.out.println("It is made only of vegetables.");
	}
}
