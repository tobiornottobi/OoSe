import java.util.ArrayList;
public class Blatt5_2_main {
	public static void main(String[] args) {
		ArrayList<Körper> k_list = new ArrayList<Körper>();
		
		//Beispielkugel
		double[] p_k = new double[3];
		p_k[0] = 0;
		p_k[1] = 0;
		p_k[2] = 0;
		double r = 100;
		Körper k = new Kugel(p_k, r);
		
		k_list.add(k);
		
		//Beispielquader
		double[] p_q = new double[3];
		p_q[0] = 1000;
		p_q[1] = 1000;
		p_q[2] = 1000;
		double l = 100;
		double b = 50;
		double h = 10;
		Körper q = new Quader(p_q, l, b, h);
		k_list.add(q);

		//Herumgewurschtele
		double[] m = new double[3];
		m[0] = 100;
		m[1] = -50;
		m[2] = 0;
		k.move(m);
		k.scale(0.01);
		
		double[] m2 = new double[3];
		m2[0] = -10;
		m2[1] = 500;
		m2[2] = 3.3;
		q.move(m2);
		q.scale(1.3);

		//Ausgabe
		for(int i = 0; i < k_list.size(); i++) {
			k_list.get(i).print_para();
		}
		
	}
}
