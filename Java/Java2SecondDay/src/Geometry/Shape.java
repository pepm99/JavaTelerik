package Geometry;

import Enomeration.IMovable;

public abstract class Shape {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Shape(int x,int y){
		this.setX(x);
		this.setY(y);
	}

	public abstract double getArea();
	public void move(int deltaX,int deltaY){
		this.setX(this.getX()+deltaX);
		this.setY(this.getY()+deltaY);
	}
	
	public String toString(){
		return "Shape("+this.getX()+","+this.getY()+")";
	}
}
