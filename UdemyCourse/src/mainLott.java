import java.util.HashMap;
import java.util.Map;
		
public class mainLott {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	
		        String records = "L D 01 8479AANE 001 0466NT SS2 001 000000000018223 62 105415_UB_5 KG 0 100 000000000018223 30.0000 60.0000\n" +
		                "L D 01 8479AANE 001 0466NT SS2 001 000000000018223 62 105415_UB_5 KG 0 101 000000000018223 70.0000 140.0000\n" +
		                "L D 01 8479AANE 001 0466NT SS2 001 ENRSTO.102 88 105415_UB_5 KG 0 102 ENRSTO.102 77.0000 154.0000;";

		        Map<String, Map<String, String>> resultMap = new HashMap<>();

		        String[] lines = records.split("\n");

		        for (String line : lines) {
		            String[] tokens = line.split("\\s+");
		            String article = tokens[3];
		            String lot = tokens[9];
		            String warehouse = tokens[7];

		            if (!resultMap.containsKey(article)) {
		                resultMap.put(article, new HashMap<>());
		            }

		            resultMap.get(article).put(lot, warehouse);
		        }

		        // Stampa della mappa risultante
		        for (Map.Entry<String, Map<String, String>> entry : resultMap.entrySet()) {
		            System.out.println("Articolo: " + entry.getKey());
		            for (Map.Entry<String, String> innerEntry : entry.getValue().entrySet()) {
		                System.out.println("Lotto: " + innerEntry.getKey() + ", Magazzino: " + innerEntry.getValue());
		            }
		        }
		    }
		

		
		
	}


