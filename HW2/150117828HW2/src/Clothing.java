
public abstract class Clothing extends Item implements Washable {

	public Clothing(){ 			//defining the constructor with settingVat method
		super.setVat(0.18);
	}
}
