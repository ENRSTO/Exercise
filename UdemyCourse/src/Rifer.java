
public class Rifer {

	
	public int helloR(int x) {
		x++;
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Rifer  p = new Rifer();
		int count = 11;
		
		p.helloR(count);
		
		System.out.println(p.helloR(count));

	}

}
