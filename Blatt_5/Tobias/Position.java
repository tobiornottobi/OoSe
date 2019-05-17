	public class Position{
		double x;
		double y;
		double z;
		Position(double x, double y, double z)
		{
			this.x=x; this.y=y; this.z=z;
		}
		public void sum(Position d)
		{
			this.x=this.x+d.x;
			this.y+=d.y;
			this.z+=d.z;
		}
		public void printPosition(){
			System.out.println((this.x) + ", " + (this.y) +  ", " + (this.z));
			}
	}