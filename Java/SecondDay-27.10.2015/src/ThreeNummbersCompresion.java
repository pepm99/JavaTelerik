import java.util.Scanner;

public class ThreeNummbersCompresion {
	public static void main(String[] args){
		int a,b,c,swap;
		Scanner scanner = new Scanner(System.in);
		System.out.println("a=");
		a=scanner.nextInt();
		System.out.println("b=");
		b=scanner.nextInt();
		System.out.println("c=");
		c=scanner.nextInt();
		
		if(b>a){
			swap=a;
			a=b;
			b=swap;
		}
		if(c>a){
			swap=a;
			a=c;
			c=swap;
		}
		else if(c>b){
			swap = c;
			c=b;
			b=swap;
		}
		System.out.printf("%d>%d>%d",a,b,c);
		scanner.close();
	}
}
