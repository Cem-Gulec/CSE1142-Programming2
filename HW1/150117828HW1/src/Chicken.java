
public class Chicken extends Bird {
	private static int count=0;

	public Chicken(String name, int age){
		super(name,age);
		super.setlegNumber(2);
		super.setnumberOfOffsprings(1);
		super.setpregnancyPerYear(200);
		count++;
	}

	public void sayGreeting(){
		System.out.println("I have nothing to say other than I am against Pigs!");
	}

	public static int getCount(){
		return count;
	}

	public static void decrementCount(){
		count--;
	}
}
