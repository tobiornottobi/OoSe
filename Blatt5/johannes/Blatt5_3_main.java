import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.*;
public class Blatt5_3_main {
	
	public static double[] get_min(ArrayList<Double> arr) {
		//Stelle 0 für index, Stelle 1 für Wert
		double[] res = new double[2];
		res[0] = 0;
		res[1] = arr.get(0);
		for(int i = 0; i < arr.size(); i++) {
			if (arr.get(i) < res[1]){
				res[0] = i;
				res[1] = arr.get(i);
			}
		}
		return res;
	}
	
	public static Double[] sort_arr(Double arr[]) {
		ArrayList<Double> search_list = new ArrayList<Double>();
		for(int i = 0; i < arr.length; i++) {
			search_list.add(arr[i]);
		}						
		ArrayList<Double> res_list = new ArrayList<Double>();
		
		while(res_list.size() < arr.length) {
			double[] i = new double[2];
			i = get_min(search_list);
			res_list.add(i[1]);
			search_list.remove((int)i[0]);
		}
		Double[] res = res_list.toArray(new Double[(res_list.size())]); 
        return res;
	}

	public static void main(String[] args) {
		Random rnd = new Random();		 
		Double[] arr = new Double[100];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextDouble();
		}
		
		arr = sort_arr(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
