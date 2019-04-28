
public class Sheep implements Cloneable{
		public String name;
		public Fur fur;
		public Sheep(String name, Fur fur) {
			this.name = name;
			this.fur = fur;
			}
		public void shear() {
			fur.length = 0;
			}
		public String toString() {
			return "Name: " + name + " " + fur.toString();
			}
		public Sheep clone() {
			return this;
		}
		
	public Sheep shallow_clone() {
		return this;
	}
	
	public Sheep deep_clone() {
		Fur f = new Fur(this.fur.length);
		Sheep s = new Sheep(this.name, f);
		return s;
	}
	
	public Boolean equals(Sheep s) {
		Boolean res = true;
		if(this.name != s.name) {res = false;}
		if(s.fur != this.fur){res = false;}
		return res;
	}
	
	//d
	public Sheep implemented_clone()throws CloneNotSupportedException{  
			return (Sheep)super.clone();  
	}
}
