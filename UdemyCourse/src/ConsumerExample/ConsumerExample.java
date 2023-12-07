package ConsumerExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());		
//		c1.accept("Java8");			
//		
//		
//		Map<String, Integer> mappa = new HashMap<>();
//		mappa.put("a", 1);
//        mappa.put("b", 2);
//        mappa.put("c", 3);
//        
//        
//        
//        BiConsumer<String, Integer> biConsumer = (key, valore) -> {
//        	System.out.println("Key: " + key + ", Value: " + valore);
//        };
//		
//        mappa.forEach(biConsumer);
        
        List<String> lista = new ArrayList<>(Arrays.asList("ciao", "Java8", "sono", "un", "esempio"));

        Predicate<String> filtroLunghezza = (s) -> s.length() >= 4;
        Predicate<String> filtroIniziaPerS = (s) -> s.startsWith("s");

        lista.stream().filter(filtroLunghezza.and(filtroIniziaPerS)).forEach(System.out::println);              
        

	}

}
