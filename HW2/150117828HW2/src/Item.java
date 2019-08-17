
public abstract class Item {

	private double vat; //variables
	private double basePrice;

	public double getVat(){ //a method which returns the value of Vat
		return vat;
	}

	public void setVat(double vat){ //a method which sets the value of Vat
		this.vat=vat;
	}

	public double getBasePrice(){ //a method which returns the value of basePrice
		return basePrice;
	}

	public void setBasePrice(double price){ //a method which sets the value of basePrice
		this.basePrice=price;
	}

	public abstract double calculatePrice(); //an abstract method which will be implemented by several other subclasses
}
