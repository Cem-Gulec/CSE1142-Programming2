import java.util.*;

public class Test {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.print("Welcome to Animal Farm simulation program!\n"
				+ "Please enter the capacity of the animal farm:");
		int choice1=input.nextInt();
		AnimalFarm farm=new AnimalFarm(choice1);




		while(true){

			System.out.print("0 - Exit the program\n"
					+ "1 - Add animal\n"
					+ "2 - Remove animal\n"
					+ "3 - Search animal\n"
					+ "4 - Sort animals\n"
					+ "5 - Calculate next year's population estimate\n"
					+ "6 - Print all animal's movements\n"
					+ "7 - Print all animal's eating habits\n"
					+ "8 - Print report\n"
					+ "Please enter your choice:");

			int choice2= input.nextInt();

			switch(choice2){

			case 0:
				System.exit(0);

			case 1:
				System.out.print("1 - Chicken\n"
						+ "2 - Donkey\n"
						+ "3 - Horse\n"
						+ "4 - Pig\n"
						+ "5 - Raven\n"
						+ "6 - Sheep\n"
						+ "Select animal type:");

				int animaltype=input.nextInt();

				System.out.print("Enter the name:");
				input.nextLine();
				String name =input.nextLine();

				System.out.println("\nEnter the age:");
				int age=input.nextInt();

				if(animaltype==1)
					farm.addAnimal(new Chicken(name,age));
				else if(animaltype==2)
					farm.addAnimal(new Donkey(name,age));
				else if(animaltype==3)
					farm.addAnimal(new Horse(name,age));
				else if(animaltype==4)
					farm.addAnimal(new Pig(name,age));
				else if(animaltype==5)
					farm.addAnimal(new Raven(name,age));
				else
					farm.addAnimal(new Sheep(name,age));
				break;

			case 2:
				System.out.print("Enter the name that you want to remove from farm");
				String rname=input.nextLine();
				farm.removeAnimal(rname);
				break;

			case 3:
				System.out.println("1 - Search based on name\n"
						+ "2 - Search based on age");
				int search=input.nextInt();

				if(search==1){
					System.out.println("Enter a name:");
					String namee=input.nextLine();
					farm.searchBasedOnName(namee);
				}
				else{
					System.out.println("Enter an age:");
					int agee=input.nextInt();
					farm.searchBasedOnAge(agee);
				}
				break;


			case 4:
				System.out.println("1 - Sort based on name\n"
						+ "2 - Sort based on leg number\n"
						+ "3 - Sort based on age\n"
						+ "4 - Sort based on addition date");
					int choice4=input.nextInt();

					if(choice4==1)
						farm.sortAlphabetically();
					else if(choice4==2)
						farm.sortBasedOnLegNumber();
					else if(choice4==3)
						farm.sortBasedOnAge();
					else
						farm.printAllAnimals();

					break;

			case 5:
				System.out.println(farm.nextYearPopulationForecast());
				break;

			case 6:
				farm.animalMovements();
				break;

			case 7:
				farm.eatingHabits();
				break;

			case 8:
				System.out.println("Enter filename");
				String filename=input.nextLine();
				farm.printReport(filename);
				break;
			}

		}

	}

}
