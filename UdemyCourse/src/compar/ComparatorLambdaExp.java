package compar;

import java.util.Comparator;

public class ComparatorLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Comparator<Integer> comparatore = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub				
				return o1.compareTo(o2);
			}
		};
		
		
		System.out.println("result of compare :" + comparatore.compare(3, 2));
		
		
		// con Lambda
		
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
		
		System.out.println("result con Lambda :"+ comparatorLambda.compare(1, 5));
		
	}

}
