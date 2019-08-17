
public class Fruit extends Food implements Vegan, Washable{

	public Fruit(){ //defining a constructor with a basePrice setting method

		super.setBasePrice(6.0);
	}

	public Fruit(double basePrice){ //defining another constructor with a basePrice setting method initialized with given basePrice value

		super.setBasePrice(basePrice);
	}

	@Override
	public double calculatePrice(){  		/*defining an overriden method which will later
												implement to calculatePrice abstract class in Item class*/

		double taxedPrice=getBasePrice()+(getVat()*getBasePrice());   //calculating taxedPrice
		double profit=(taxedPrice*20)/100;			//calculating profit which will later return with taxedPrice
		return taxedPrice+profit;					// returning retail price
	}

	@Override
	public void howToWash(){  // defining a howToWash method which implements to abstract class in Washable interface
		System.out.println("Wash Fruit with cold water.");
	}

	@Override
	public void madeOf(){	// defining a madeOf method which implements to abstract class in Vegan interface
		System.out.println("It is made only of fruits.");
	}
}
