import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AnimalFarm {
	 ArrayList<Animal> animalList = new ArrayList<Animal>();  //defining arraylist that will keep Animal objects
	 ArrayList<String> animalNames = new ArrayList<String>();  //defining arraylist that will keep names
	private static int CAPACITY;
	private static int numberOfAnimals=0;

	public AnimalFarm(int capacity){
		this.CAPACITY=capacity;
	}

	public int getNumberOfAnimals(){
		return numberOfAnimals;
	}

	public boolean addAnimal(Animal animal){  //adding animal methods if the conditions are satisfied
		if(!animalList.contains(animal) && (animalList.size()<CAPACITY)){
			animalList.add(animal);
			animalNames.add(animal.returnName());
		}
		if(animalList.contains(animal)) //if the animallist contains which was added recently, returns true, otherwise false
			return true;
		return false;
	}

	public boolean removeAnimal(String name){

		 boolean a=false;
         boolean b=false;
         for(Animal iterator: animalList) {  //iterates on animallist checking the name if it exists, if it returns true removes
                 if(iterator.returnName().equals(name)) {
                     animalList.remove(iterator);
                     a=true;
                 }
             }
             if(animalNames.contains(name)) {
                 animalNames.remove(name);
                 b=true;
             }

             return a&&b;



	}

	public void printAllAnimalGreetings(){
		for(Animal iterator: animalList)
			printOneAnimalGreeting(iterator);
	}

	public void printOneAnimalGreeting(Animal animal){
			animal.sayGreeting();
	}

	public void printAllAnimalNames(){
		for(Animal iterator: animalList)
			printOneAnimalName(iterator);

	}

	public void printOneAnimalName(Animal animal){
		System.out.println(animal.returnName());
	}

	public void printAllAnimals(){
		for(Animal iterator: animalList)
			System.out.println(iterator.toString());

	}

	public int nextYearPopulationForecast(){

		int var1=0,var2=0,var3=0,var4=0,var5=0,var6=0,nextYearPopulationForecast=0;
		for(Animal iterator: animalList){

			if(iterator instanceof Chicken)
				var1=iterator.returnsetpregnancyPerYear()*iterator.returnnumberOfOffspring()*((Chicken) iterator).getCount();
			if(iterator instanceof Raven)
				var2=iterator.returnsetpregnancyPerYear()*iterator.returnnumberOfOffspring()*((Raven) iterator).getCount();
			if(iterator instanceof Horse)
				var3=iterator.returnsetpregnancyPerYear()*iterator.returnnumberOfOffspring()*((Horse) iterator).getCount();
			 if(iterator instanceof Donkey)
				var4=iterator.returnsetpregnancyPerYear()*iterator.returnnumberOfOffspring()*((Donkey) iterator).getCount();
			 if(iterator instanceof Pig)
				var5=iterator.returnsetpregnancyPerYear()*iterator.returnnumberOfOffspring()*((Pig) iterator).getCount();
			 if(iterator instanceof Sheep)
				var6=iterator.returnsetpregnancyPerYear()*iterator.returnnumberOfOffspring()*((Sheep) iterator).getCount();




		}
		nextYearPopulationForecast=var1+var2+var3+var4+var5+var6;
		return nextYearPopulationForecast+1;
	}

	public void animalMovements(){
		for(Animal iterator: animalList){
			if(iterator instanceof Bird){
				System.out.print("My name is "+iterator.returnName()+" and");
				((Bird) iterator).fly();
			}
			if(iterator instanceof Mammal){
				System.out.print("My name is "+iterator.returnName()+" and");
				((Mammal) iterator).walk();
			}

		}

	}

	public void eatingHabits(){
		for(Animal iterator: animalList){
			if(iterator instanceof Bird){
				System.out.print("My name is "+iterator.returnName()+" and");
				((Bird) iterator).omnivore();
			}
			if(iterator instanceof Mammal){
				System.out.print("My name is "+iterator.returnName()+" and");
				((Mammal) iterator).herbivore();
			}

		}
	}

	public void sortAlphabetically(){

		String[] sortAlph=new String[animalList.size()];
        int i=0;
        for(Animal iterator: animalList) {
        	sortAlph[i]=iterator.returnName();
            i++;
        }
        Arrays.sort(sortAlph);
        for(int j=0; j<sortAlph.length; j++) {
            System.out.println(sortAlph[j]);
        }



	}

	public void sortBasedOnLegNumber(){
		int[] sortLeg=new int[animalList.size()];
        int i=0;
        for(Animal iterator: animalList) {
            sortLeg[i]=iterator.returnlegnumber();
            i++;
        }
        Arrays.sort(sortLeg);
        for(int j=0; j<sortLeg.length; j++) {
            System.out.println(sortLeg[j]);
        }


	}

	public void sortBasedOnAge(){
		int[] sortAge=new int[animalList.size()];
        int i=0;
        for(Animal iterator: animalList) {
        	sortAge[i]=iterator.returnage();
            i++;
        }
        Arrays.sort(sortAge);
        for(int j=0; j<sortAge.length; j++) {
            System.out.println(sortAge[j]);
        }
	}


	public void searchBasedOnName(String name){

		  if(animalNames.contains(name)) {
              for(Animal iterator: animalList) {
                  if(iterator.returnName().equals(name))
                	  System.out.println(iterator.toString());
              }
              System.out.println("Bulundu.");
          }
              else
                  System.out.println("bulunamadý");


	}

	public void searchBasedOnAge(int age){

		 for(Animal iterator: animalList) {
             if(iterator.returnage()==age) {
                 System.out.println(iterator.toString());
                 break;
             }
         }



	}

	public void printReport(String filename){

		System.out.println("We have a total of "+numberOfAnimals+" in the farm.");
		System.out.println("\t*");
	}
}
