package geometry;

public class Point3d {
	double x;
	double y;
	double z;
	
	public  Point3d(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public double calcDistance(Point3d p){
		 	double dx = p.x - x;
	        double dy = p.y - y;
	        double dz=p.z-z;
	        return Math.sqrt(dx * dx + dy * dy + dz*dz);
			
	}
	
}
