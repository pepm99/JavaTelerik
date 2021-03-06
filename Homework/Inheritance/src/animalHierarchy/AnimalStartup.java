package animalHierarchy;

public class AnimalStartup {
	public static void main(String[] args){
		Dog[] dogs = new Dog[10];
		Kitten[] kit = new Kitten[10];
		
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog("Pesho", i+1, "m");
		}
		
		for (int i = 0; i < kit.length; i++) {
			kit[i] = new Kitten("Jorko", i+3);
		}
		
		System.out.print("Dogs average age= ");
		System.out.println(averageAge(dogs));
		System.out.print("Cats average age= ");
		System.out.println(averageAge(kit));
		
	}
	
	public static double averageAge(Animal[] a){
		double n=0;
		int sum=0;
		n=a.length;
		double result=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i].getAge();
		}
		result=sum/n;
		return result;
	}
	
}
