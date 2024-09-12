package functionalExe;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	@FunctionalInterface
	interface Operazione {
	    int esegui(int a, int b);
	}
	
	@FunctionalInterface
	interface Predicato<T> {
	    boolean test(T t);
	}
	
	

	public static void main(String[] args) {

		
		Operazione somma = (a,b) -> a+b;
		
		System.out.println("somma : " + somma.esegui(10, 20));
		
		Operazione moltiplicazione = (a, b) -> a * b;
		
		System.out.println("moltiplicazione  : " + moltiplicazione.esegui(10, 20));
		
		List<String> parole = new ArrayList<>();
        parole.add("cane");
        parole.add("gatto");
        parole.add("elefante");
        parole.add("tigre");
        parole.add("leone");
        
        Predicato<String> lunghezzaSuperioreAQuattro = s -> s.length() > 4;
        
        List<String> paroleFiltrate = filtra(parole, lunghezzaSuperioreAQuattro );
        
        System.out.println("Parole con più di 4 caratteri:");
        for (String parola : paroleFiltrate) {
            System.out.println(parola);
        }
        
		
		

	}
	
	  public static <T> List<T> filtra(List<T> lista, Predicato<T> predicato) {
          List<T> risultato = new ArrayList<>();
          for (T elemento : lista) {
              if (predicato.test(elemento)) {
                  risultato.add(elemento);
              }
          }
          return risultato;
      }

}
