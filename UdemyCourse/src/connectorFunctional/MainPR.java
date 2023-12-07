package connectorFunctional;

import java.util.function.Function;

public class MainPR {
	
	
	static Function<String, String> function = (name) -> name.toUpperCase();
	static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" Stocchetti").toUpperCase();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Risultato is :" + function.andThen(addSomeString).apply("Enrico"));
	}

}
