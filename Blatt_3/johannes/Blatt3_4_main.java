
public class Blatt3_4_main {

	public static void main(String[] args) {
		//Tests
		Singleton s1 = Singleton.new_s();
		Singleton s1_2 = Singleton.new_s();
		s1_2.i = 1;
		System.out.print(s1.i);
		System.out.print(s1_2.i);
		
		//Tests
		Singleton2 s2 = Singleton2.shallow_clone();
		Singleton2 s2_2 = Singleton2.shallow_clone();
		s2_2.i = 44;
		System.out.print("\n");
		System.out.print(s2.i);
		System.out.print(s2_2.i);

	}
	/* Verwendung von Singletons (stackoverflow):
	 * On my quest for the truth I discovered that there are actually very few "acceptable" reasons to use a Singleton.

	One reason that tends to come up over and over again on the internets is that of a "logging" class (which you mentioned).
	In this case, a Singleton can be used instead of a single instance of a class because a logging class usually 
	needs to be used over and over again ad nauseam by every class in a project. If every class uses this 
	logging class, dependency injection becomes cumbersome.

	Logging is a specific example of an "acceptable" Singleton because it doesn't affect the execution of your code. 
	Disable logging, code execution remains the same. Enable it, same same. Misko puts it in the following 
	way in Root Cause of Singletons, "The information here flows one way:
	From your application into the logger. Even though loggers are global state, since no information flows from loggers
	into your application, loggers are acceptable."
	 */
}
