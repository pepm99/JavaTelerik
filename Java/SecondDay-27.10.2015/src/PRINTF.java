import java.util.Calendar;
import java.util.Locale;

public class PRINTF {
	public static void main(String[] args){
		String name ="Ivan";
		int age = 20;
		System.out.printf("Hi my name is %s and I am %d years old",name,age);
		System.out.println();
		System.out.println(age);
		double d = 3.14356561515156155d;
		System.out.printf("%.1f",d);
		System.out.println();
		System.out.printf("%5d",age);
		
		Calendar c = Calendar.getInstance();
		System.out.format(Locale.forLanguageTag("BG"), "%tB %te, %tY%n", c, c, c);
		System.out.format(Locale.US, "%tB %te, %tY%n", c, c, c);
	}
}
