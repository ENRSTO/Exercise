package connectorFunctional;

import java.util.function.Function;

public class MainPR {
	
	
	static Function<String, String> function = (name) -> name.toUpperCase();
	static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" Stocchetti").toUpperCase();
	
	static Function<String, String> quote = s -> "'" + s + "'";
	static Function<Integer, String> intToString = Object::toString;
	static Function<Integer, String> quoteIntToString = quote.compose(intToString);
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(function);
		System.out.println(function.apply("ERNESTO"));
		System.out.println("Risultato is :" + function.andThen(addSomeString).apply("Enrico"));
		
		System.out.println(quoteIntToString.apply(5));
		
		
	}

}
