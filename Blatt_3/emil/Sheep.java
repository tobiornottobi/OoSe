public class Sheep {
	public String name;
	public Fur fur;

	public Sheep(String name, Fur fur) {
		this.name = name;
		this.fur = fur;
	}

	public void shear() {
		fur.length = 0;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " " + fur.toString();
	}

	public Sheep clone() {
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Sheep))  return false;
		Sheep s = (Sheep) obj;
		return s.name.equals(name) && s.fur.equals(fur);
	}

	public Sheep shadowclone() {
		return new Sheep(name, fur);
	}

	public Sheep deepclone() {
		return new Sheep(name, new Fur(fur.length));
	}
}