
public abstract class Solid {
	protected Position p;
	protected double l;
	/* 
	double b;
	double h;
	*/
	

	
	public Solid(Position p){
		this.p=p;
	}
	
	public void move(Position d)
	{
		this.p.sum(d);
	}
	public void scale(double a){
		this.l*=a;
	}	
	/*
	public double volume(){		
		throw new UnsupportedOperationException("\nThis function should only be called on an object\n");
	}
	*/
	public abstract double volume();

	public void print(){
		System.out.println("\nType: " + this.getClass().getName());	
		System.out.println("Volume: " + this.volume());
		System.out.println("Position: "); this.p.printPosition();
	}
	
	
}
