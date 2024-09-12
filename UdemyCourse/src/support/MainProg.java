package support;

import java.math.BigDecimal;

public class MainProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal d = new BigDecimal("0.0000");
		System.out.println(d);
		System.out.println("--> con stripTrailingZeros:: " + d.stripTrailingZeros());
		
		

	}

}
