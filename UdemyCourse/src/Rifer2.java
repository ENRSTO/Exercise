
public class Rifer2 {
	
	public void hello(Impiegato x) {
        x.setNome("pippo");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rifer2 p = new Rifer2();
		Impiegato tmp = new Impiegato();
		tmp.setNome("ERNESTO");
		
		p.hello(tmp);
		System.out.println(tmp.getNome());
		
		/*Un oggetto X viene passato ad un metodo per riferimento:
		 *  il metodo crea un’oggetto X1 che contiene un riferimento all’oggetto X.
		 *   Le modifiche fatte su X1, verranno perciò riportate su X.
		*/
	}

}
