public class Sheep {
    public String name;

    public Fur fur;

    public Sheep(String name, Fur fur) {
        this.name = name;
        this.fur = fur;
    }

    public void changeName (String name) {
        this.name=name;
    }

    public void shear() {
        this.fur.length = 0;
    }

    public String toString() {
        return "Name: " + name + " " + fur.toString();
    }

    public Sheep clone() {
        return this;
    }

    public Sheep shallowCopy() {
        return this;
    }

    public Sheep deepCopy(Sheep newsheep) {
        newsheep.name=this.name;
        Fur newfur = new Fur(0);
        newsheep.fur=this.fur.deepclone(newfur);
        return newsheep;
    }

    public boolean equals (Sheep x) {
		if(x instanceof Sheep) {
			if(this.name == x.name && this.fur == x.fur) return true;
		}
		return false;
	}
}
