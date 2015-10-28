
public class Methods_Demo {
	public static void main(String[] args){
		printLogo();
		printLogo("Ivan","Pesho");
		printSign(-5);
		printSign(-5+5);
		printSign(5);
		printPeriod(12,1);
	}
	
	static void printPeriod(int from, int to) {
		int period = to - from - 1;
		if(period<0) period+=12;
		System.out.println(period);
		
	}

	static void printLogo(){
		System.out.println("Telerik School Academy");
		System.out.println("Java Fundamentals");		
	}
	
	static void printLogo(String logo, String course){
		System.out.println(logo);
		System.out.println(course);
	}
	
	static void printSign(int n) {
		if(n>0){
			System.out.println("+");
		}
		else if(n<0){
			System.out.println("-");
		}
		else{
			System.out.println("0");
		}
	}
}