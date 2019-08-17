
public class Sheep extends Mammal {
	private static int count=0;

	public Sheep(String name, int age){
		super(name,age);
		super.setlegNumber(4);
		super.setnumberOfOffsprings(1);
		super.setpregnancyPerYear(1);
		count++;
	}

	public void sayGreeting(){
		System.out.println("Four legs good, two legs better!");
	}

	public static int getCount(){
		return count;
	}

	public static void decrementCount(){
		count--;
	}
}
