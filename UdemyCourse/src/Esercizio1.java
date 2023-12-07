import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * @author ENRSTO
 *
 */
public class Esercizio1 {

	public static void main(String[] args) {
		// inizializzazione 

		List <lotti> lottiL = new ArrayList<lotti>();

		List <items> articoli = new ArrayList<items>();
		
		 Map<String,Map<String,String>>  mapOfMaps =   new HashMap <String,Map<String,String>>();
		 
		 Map<String,String> mappa1 = new HashMap<String, String>();
		 Map<String,String> mappa2 = new HashMap<String, String>();
		 
		
		 
		 

		lottiL.add(new lotti ("1","lott6","art1",BigDecimal.valueOf(12.5)));
		lottiL.add(new lotti ("2","lott2","art2",BigDecimal.valueOf(10)));
		lottiL.add(new lotti ("3","lott3","art3",BigDecimal.valueOf(25)));
		lottiL.add(new lotti ("4","lott4","art1",BigDecimal.valueOf(5)));
		lottiL.add(new lotti ("5","lott5","art1",BigDecimal.valueOf(5)));

		
		Map <String, Integer>  howmany = new HashMap<String, Integer>();
		
		
		// inizializzazione mappa con riccorenze
		for (lotti lot : lottiL) {
			Integer count = 1;
			if (!howmany.containsKey(lot.getItem())) {
				howmany.put(lot.getItem(), count);
			} else {
				howmany.put(lot.getItem(), howmany.get(lot.getItem()) + 1);
			}
		}
		
		
		
		
		

		articoli.add(new items("art1", "ARTICOLO1"));
		articoli.add(new items("art2", "ARTICOLO2"));
		articoli.add(new items("art3", "ARTICOLO3"));
		articoli.add(new items("art4", "ARTICOLO4"));

		
		 mapOfMaps.put("1", mappa1);
		 mapOfMaps.put("2", mappa2);
		 
		 for (items items : articoli) {
			 //Hash_Map.put(key, value)
			 mappa1.put(items.getItem(), items.getDesc());
		 }
		 
		 for (lotti lot : lottiL) {
			 mappa2.put(lot.getLotto(), lot.getQta().toString());
		 }


		// dammi i lotti di art1 

		//lottiL.stream().filter(l -> l.getItem().equals("art1")).forEach((l ->  System.out.println(l.getLotto())));

		// DAMMI UNA STAMPA CHE MI DIA PER OGNI ARTICOLO I LOTTI SUOI 

		//		for (items artJ : articoli) {
		//		
		//			lottiL.stream().filter(S -> S.getItem().equals(artJ.getItem())).forEach(l ->  System.out.println(artJ.getItem() +"->" + artJ.getDesc() + " lotto: "+ l.getLotto()));
		//			
		//		}


//		articoli.stream()
//		.flatMap(artJ -> lottiL.stream()
//				.filter(l -> l.getItem().equals(artJ.getItem()))
//				.map(l -> artJ.getItem() + "->" + artJ.getDesc() + " lotto: " + l.getLotto()))
//		.forEach(System.out::println);
		
		
//		mapOfMaps.values().stream()
//		  .flatMap(map -> map.entrySet().stream())
//		  .forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
		 
//		 for (Map.Entry<String, Map<String, String>> entry : mapOfMaps.entrySet()) {
//	            String outerKey = entry.getKey();
//	            Map<String, String> innerMap = entry.getValue();
//	            System.out.println("Outer Key: " + outerKey);
//	            for (Map.Entry<String, String> innerEntry : innerMap.entrySet()) {
//	                String innerKey = innerEntry.getKey();
//	                String innerValue = innerEntry.getValue();
//	                System.out.println("Inner Key: " + innerKey + ", Inner Value: " + innerValue);
//	            }
//	        }
		
		 for (Map.Entry<String, Integer> innerEntry : howmany.entrySet()) {
             String innerKey = innerEntry.getKey();
             Integer innerValue = innerEntry.getValue();
             System.out.println("Inner Key: " + innerKey + ", Inner Value: " + innerValue);
         }
		
		//mapOfMaps.forEach((k,v)->System.out.println("Key = " + k + ", Value = " + v));
		 
		 for (items item : articoli) {
				System.out.println("Per questo articolo: " + item.getItem() + " ho : " + howmany.get(item.getItem()) + " lotti");
		 }
		
	} // main 


}
