package Geometry;

public class Triangle extends Shape {
	public Triangle(int x, int y,int a,int b,int c) {
		super(x, y);
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}
	private int a;
	private int b;
	private int c;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public double Perimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	public double getArea(){
		double s=(this.a+this.b+this.c)/2;
		double S=Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
		return S;
	}
}
