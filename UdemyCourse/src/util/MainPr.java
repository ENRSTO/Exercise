package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List movimenti = new ArrayList<Cnmop>();
		//String item, String bolla, String mag, String op, String seq, String aggraf
		movimenti.add(new Cnmop("ART1", "B01", "026", "OP1", "001", "1"));
		movimenti.add(new Cnmop("ART2", "B01", "026", "OP1", "001", "1"));
		movimenti.add(new Cnmop("ART2", "B01", "300", "OP1", "001", "1"));
		movimenti.add(new Cnmop("ART2", "B01", "100", "OP1", "001", "1"));
		movimenti.add(new Cnmop("ART2", "B01", "304", "OP1", "001", "1"));
		movimenti.add(new Cnmop("ART1", "B01", "200", "OP1", "001", "1"));
		movimenti.add(new Cnmop("ART4", "B01", "200", "OP1", "001", "1"));
		movimenti.add(new Cnmop("ART1", "B02", "026", "OP2", "001", "1"));
		movimenti.add(new Cnmop("ART2", "B02", "026", "OP2", "001", "1"));
		movimenti.add(new Cnmop("ART2", "B02", "200", "OP2", "001", "1"));
		movimenti.add(new Cnmop("ART3", "B02", "026", "OP2", "001", "1"));
		movimenti.add(new Cnmop("ART3", "B02", "200", "OP2", "001", "1"));
		movimenti.add(new Cnmop("ART3", "B02", "300", "OP2", "001", "1"));
		movimenti.add(new Cnmop("ART7", "B02", "300", "OP2", "001", "1"));
		movimenti.add(new Cnmop("ART8", "B02", "300", "OP2", "001", "1"));
		
		// aggiunti elemnenti
		
		Map <String, Map<String, Integer>> resultMap = UtilMaterial.populateMap(movimenti);
		System.out.println(resultMap);
		
		Map <String, Map<String, Integer>> resultMap1 = UtilMaterial.populateMapParallel(movimenti);
		System.out.println(resultMap1);
		
//		
//		System.out.println(UtilMaterial.getMaterialiRipetuti(movimenti).toString());
//		//System.out.println(UtilMaterial.trovaMaterialiDuplicati(movimenti).toString());
//		System.out.println(UtilMaterial.trovaMaterialiDuplicatiAggraffata(movimenti).toString());
//		

	}

}
