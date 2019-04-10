public class Calc {
	public static void main(String[] args) {
		if (args.length >= 3) {
			int val1 = Integer.parseInt(args[0]);
			int val2 = Integer.parseInt(args[1]);
			int operation = Integer.parseInt(args[2]);
			
			switch (operation) {
				case 1:
					System.out.println(val1 + " + " + val2 + " = " + (val1 + val2));
					break;
					
				case 2:
					System.out.println(val1 + " - " + val2 + " = " + (val1 - val2));
					break;
				
				case 3:
					System.out.println(val1 + " * " + val2 + " = " + (val1 * val2));
					break;
				case 4:
					System.out.println(val1 + " / " + val2 + " = " + (val1 / (double)val2));					
					break;
			
				default:
					break;
			}
		}
	}
}