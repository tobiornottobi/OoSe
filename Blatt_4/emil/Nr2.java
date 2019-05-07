public class Nr2 {

	interface Food {
		public String getMeal();
	}
	
	static class Cauliflower implements Food {
		@Override
		public String getMeal() {
			return "Blumenkohl an Gorgonzolasoße";
		}
	}
	
	static class Spaghetti implements Food {
		@Override
		public String getMeal() {
			return "Spaghetti Bologneser Art";
		}
	}

	static class Student {
		public void eat(Food food) {
			System.out.println("I like " + food.getMeal());
		}
	
		public void eat(Cauliflower cauliflower) {
			System.out.println("I don't like " + cauliflower.getMeal());
		}
	}

	public static void main(String[] args) {

		Student student = new Student();

		//spezifischste methode wird genommen
		Cauliflower essen1 = new Cauliflower();
		student.eat(essen1);

		//einzige methode die zutrifft wird genommen
		Spaghetti essen2 = new Spaghetti();
		student.eat(essen2);

		//einzige methode die zutrifft wird genommen
		Food essen = new Cauliflower();
		student.eat(essen);
	}
}