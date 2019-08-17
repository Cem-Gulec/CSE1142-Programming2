
public class Animal {
	private String name; //defining variables
	private int legNumber;
	private int age;
	private int pregnancyPerYear;
	private int numberOfOffsprings;

	public Animal(String name, int age){//defining constructor
		this.name=name;
		this.age=age;
	}

	public void sayGreeting(){ //defining methods that we will use afterwards
		System.out.println("Have nothing to say!");
	}

	public void reproduce(){
		System.out.println("None of your business!!");

	}

	public String toString(){
			return "My name is "+name+"! \nI am "+age+" years old!"+" \nI have "+legNumber+" legs!";

	}

	public void setName(String name){
		this.name=name;
	}

	public String returnName(){ //return value methods for using afterwards
		return name;
	}

	public void setlegNumber(int legNumber){
		this.legNumber=legNumber;
	}

	public int returnlegnumber(){
		return legNumber;
	}

	public void setage(int age){
		this.age=age;
	}

	public int returnage(){
		return age;
	}

	public void setpregnancyPerYear(int pregnancyPerYear){
		this.pregnancyPerYear=pregnancyPerYear;
	}

	public int returnsetpregnancyPerYear(){
		return pregnancyPerYear;
	}

	public void setnumberOfOffsprings(int numberOfOffsprings){
		this.numberOfOffsprings=numberOfOffsprings;
	}

	public int returnnumberOfOffspring(){
		return numberOfOffsprings;
	}
}
