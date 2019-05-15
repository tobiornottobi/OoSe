import java.util.ArrayList;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        List<Koerper> list = new ArrayList<>();
        list.add(new Kugel(1,5,2,5));
        list.add(new Quader(5,5,5));
        list.add(new Quader(1,1,1,2,5,1));
        list.add(new Kugel(10,8,1,1));
        list.add(new Quader(1,2,3,5,5,6));

        for(int i=0; i<5; i++) {
            if(list.get(i).getKind() == "Kugel") System.out.println(list.get(i).getKind() + ": (" + list.get(i).getPos('x') + "," + list.get(i).getPos('y') + "," + list.get(i).getPos('z') + "), Radius: "+ ((Kugel) list.get(i)).getRadius() + " Volumen: " + list.get(i).getVolume()); 
            else System.out.println(list.get(i).getKind() + ": (" + list.get(i).getPos('x') + "," + list.get(i).getPos('y') + "," + list.get(i).getPos('z') + "), Maße: "+ ((Quader) list.get(i)).getDimensions() + " Volumen: " + list.get(i).getVolume());
        }

        System.out.println("\n\nmove 1,2 ... scale 3,4");
        list.get(0).move(1,1,1);
        list.get(1).move(2,2,2);
        list.get(2).scale(2);
        list.get(3).scale(3);

        for(int i=0; i<5; i++) {
            System.out.println(list.get(i).getKind() + ": (" + list.get(i).getPos('x') + "," + list.get(i).getPos('y') + "," + list.get(i).getPos('z') + "), Volumen: " + list.get(i).getVolume()); 
        }

    }
}

class Koerper {
    double position[];

    public Koerper () {  //default constructorm, sets coordiantes (0,0,0)
        position = new double[3];
        position[0] = 0;
        position[1] = 0;
        position[2] = 0;
    }
    public Koerper (double posx, double posy, double posz) { //manual constructor, sets coordinates (x,y,z)
        position = new double[3];
        position[0] = posx;
        position[1] = posy;
        position[2] = posz;
    }

    public void move(double x, double y,double z) {
        this.position[0]+=x;
        this.position[1]+=y;
        this.position[2]+=z;
    }

    public void scale(double factor) {
    }

    public double[] getPos () {
        return this.position;
    }

    public double getPos(char axis) {
        switch (axis) {
            case 'x':
                return this.position[0];
            case 'y':
                return this.position[1];
            case 'z':
                return this.position[2];
            default:
                return 0;
        }
    }

    public String getKind(){
        return "Koerper";
    }
    public double getVolume() {
        return 0;
    }


}

class Kugel extends Koerper {
    double radius;

    public Kugel (double posx, double posy, double posz, double radius) {
        super(posx,posy,posz);
        this.radius=radius;
    }

    public double getVolume() {
        return (4/3 * 3.1415926539 * (this.radius*this.radius*this.radius));
    }

    public String getKind() {
        //System.out.println("Kugel");
        return "Kugel";
    }

    public double getRadius() {
        return this.radius;
    }

    public void scale(double factor) {
        this.radius*=factor;
    }

}

class Quader extends Koerper {
    double width, heigth, depth;

    public Quader (double posx, double posy, double posz) { //manual constructor, calls Koerper(x,y,z), sets w,h,d=1
        super(posx,posy,posz);
        this.width=1;
        this.heigth = 1;
        this.depth=1;
    }

    public Quader (double posx, double posy, double posz, double width, double heigth, double depth) {
        super(posx,posy,posz);
        this.width=width;
        this.heigth=heigth;
        this.depth=depth;
    }

    public double getVolume() {
        return (this.width*this.heigth*this.depth);
    }

    public String getKind() {
        //System.out.println("Quader");
        return "Quader";
    }

    public String getDimensions() {
        String dim;
        dim= ("(" + this.width + ", " + this.heigth + ", " + this.depth + ")");
        return dim;
    }

    public void scale(double factor) {
        this.width*=factor;
        this.heigth*=factor;
        this.depth*=factor;
    }
}