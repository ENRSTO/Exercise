package lambdas;

public class RunnableExample {
	
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			System.out.println("INside runnable 1 version");	
			}
		};		
		new Thread(runnable).start();

	// with lambda 

	//	Runnable runnableLambda = () -> System.out.println(" da Lamda ");
		
		new Thread(() -> System.out.println(" da Lamda ")).start();

	}

}
