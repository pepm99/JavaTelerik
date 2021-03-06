package Geometry;

public class Circle extends Shape {
	private static final double PI=Math.PI;
	private int radius;
	
	public int getRadius(){
		return this.radius;
	}
	
	public void setRadius(int value){
		if(value<=0){
			throw new IllegalArgumentException("Radius must be greather then 0");
		}
		else{
			this.radius=value;
		}
	}
	
	public Circle(int x, int y,int radius) {
		super(x, y);
		this.setRadius(radius);
		
	}

	public double getArea(){
		return PI*this.getRadius()*this.getRadius();
	}
	public String toString(){
		return "Shape("+this.getX()+","+this.getY()+") Radius= "+this.getRadius();
	}

}
