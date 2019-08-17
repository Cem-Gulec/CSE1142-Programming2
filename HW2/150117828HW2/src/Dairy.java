
public class Dairy extends Food {

	public Dairy(){ 				//defining a constructor with a basePrice setting method
		super.setBasePrice(8.0);
	}

	public Dairy(double basePrice){ //defining another constructor with a basePrice setting method initialized with given basePrice value

		super.setBasePrice(basePrice);
	}

	@Override
	public double calculatePrice(){ /*defining an overriden method which will later
									implement to calculatePrice abstract class in Item class*/

		double taxedPrice=getBasePrice()+(getVat()*getBasePrice()); //calculating taxedPrice
		double profit=(taxedPrice*30)/100;							//calculating profit which will later return with taxedPrice
		return taxedPrice+profit;// returning retail price

	}

}
