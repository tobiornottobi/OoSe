public class Cuboid extends Solid{
	protected double b;
	protected double h;
	
	public Cuboid(double l, double b, double h, Position p){
		super(p);
		this.l=l;
		//this.p=p;
		this.b=b;
		this.h=h;
	}
	
	public void scale(double a){
		this.l*=a;
		this.b*=a;
		this.h*=a;
	}		
	
	public double volume(){		
		return l*b*h;
	}
	

}
