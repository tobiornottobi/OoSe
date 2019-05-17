
public class Sphere extends Solid {
	
	public Sphere(double l, Position p){
		super(p);
		this.l=l;
		//this.p=p;
	}
	
	public double volume(){		
		return 4/3*Math.PI*Math.pow(l/2, 3);
	}
	
}
