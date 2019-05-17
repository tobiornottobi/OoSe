
import java.util.ArrayList;
import java.util.List;


public class Blatt5_2_main {
	public static void main(String[] args) {
		
	List<Solid> liste =new ArrayList<>();
	liste.add(new Sphere( 1., new Position(2.,3.,4.)));
	liste.add(new Sphere( 4., new Position(5.,6.,7.)));
	liste.add(new Sphere( 3., new Position(3.,5.,8.)));
	liste.add(new Cuboid(10., 10., 10., new Position(100.,2.,5.)));
	liste.add(new Cuboid(10., 5., 2., new Position(300.,2.,5.)));
	
	for (Solid s: liste)
	{
		s.print();
}
	

	}
}