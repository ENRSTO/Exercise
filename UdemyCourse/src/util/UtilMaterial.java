package util;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UtilMaterial {

	     static Map<String, Cnmop> getMaterialiRipetuti (List<Cnmop> materiali) {
	    	 
	    	 Set<String> materialiNonDuplicati = new HashSet<> ();
	         Map<String, Cnmop> materialiRipetuti = new HashMap<> ();

	         // Itera sulla lista dei materiali.
	         for (Cnmop materiale : materiali) {
	             // Se il materiale non è già presente nel set, lo aggiunge.
	             if (!materialiNonDuplicati.contains (materiale.getItem ())) {
	                 materialiNonDuplicati.add (materiale.getItem ());
	             } else {
	                 // Se il materiale è già presente nel set, lo aggiunge alla lista dei risultati.
	                 materialiRipetuti.put (materiale.getItem (), materiale);
	             }
	         }
	         // Restituisce la lista dei risultati.
	         return materialiRipetuti;
	    	 
	     }
  //
	
	
//	public static List<String> trovaMaterialiDuplicati(List<String> materiali) {
//        List<String> materialiDuplicati = new ArrayList<>();
//        Map<String, Integer> conteggioMateriali = new HashMap<>();
//
//        // Conta quante volte ogni materiale appare nella lista
//        for (String materiale : materiali) {
//            conteggioMateriali.put(materiale, conteggioMateriali.getOrDefault(materiale, 0) + 1);
//        }
//
//        // Aggiungi i materiali duplicati alla lista di output
//        for (Map.Entry<String, Integer> entry : conteggioMateriali.entrySet()) {
//            if (entry.getValue() > 1) {
//                materialiDuplicati.add(entry.getKey());
//            }
//        }
//        return materialiDuplicati;
//    }
    
    
    public static Map <String, Map<String, Cnmop>> trovaMaterialiDuplicatiAggraffata (List<Cnmop> materiali){
    	
    	 Map<String, Map<String, Cnmop>> bolleArticoli = new HashMap<>();
         for (Cnmop movimento : materiali) {
             String bolla = movimento.getBolla();
             Map<String, Cnmop> articoli = bolleArticoli.get(bolla);
             if (articoli == null) {
                 articoli = new HashMap<String, Cnmop> ();
                 bolleArticoli.put(bolla, articoli);
             }
             articoli.put(movimento.getItem(), movimento);
         }
//      //   bolleArticoli.forEach((key, value) -> {
//        	    // Fai qualcosa con la chiave e il valore
//          	 value = getMaterialiRipetuti(materiali);      	 
//        	 
//         });
         return bolleArticoli;
    }
    
    
    // MOLTO BUONA per Bolle aggraffate
    public static Map<String, Set<String>> populateMapK(List<Cnmop> movimenti) {
        Map<String, Map<String, Integer>> countMap = new HashMap<>();
        Map<String, Set<String>> resultMap = new HashMap<>();

        for (Cnmop movimento : movimenti) {
            String bolla = movimento.getBolla();
            String item = movimento.getItem();

            countMap.putIfAbsent(bolla, new HashMap<>());
            countMap.get(bolla).put(item, countMap.get(bolla).getOrDefault(item, 0) + 1);

            if (countMap.get(bolla).get(item) == 2) {
                resultMap.putIfAbsent(bolla, new HashSet<>());
                resultMap.get(bolla).add(item);
            } else if (countMap.get(bolla).get(item) == 1) {
                if (resultMap.containsKey(bolla)) {
                    resultMap.get(bolla).remove(item);
                }
            }
        }
        return resultMap;
    }
    
    public static Map<String, Map<String, Integer>> populateMapO(List<Cnmop> movimenti) {
        Map<String, Map<String, Integer>> countMap = new HashMap<>();
        Map<String, Map<String, Integer>> resultMap = new HashMap<>();

        for (Cnmop movimento : movimenti) {
            String bolla = movimento.getBolla();
            String item = movimento.getItem();

            countMap.putIfAbsent(bolla, new HashMap<>());
            countMap.get(bolla).put(item, countMap.get(bolla).getOrDefault(item, 0) + 1);

            if (countMap.get(bolla).get(item) == 2) {
                resultMap.putIfAbsent(bolla, new HashMap<>());
                resultMap.get(bolla).put(item, countMap.get(bolla).get(item));
            } else if (countMap.get(bolla).get(item) == 1) {
                if (resultMap.containsKey(bolla)) {
                    resultMap.get(bolla).remove(item);
                }
            }
        }
        return resultMap;
    }
    
    public static Map<String, Map<String, Integer>> populateMap(List<Cnmop> movimenti) {
        Map<String, Map<String, Integer>> countMap = new HashMap<>();
        Map<String, Map<String, Integer>> resultMap = new HashMap<>();

        for (Cnmop movimento : movimenti) {
            String bolla = movimento.getBolla();
            String item = movimento.getItem();

            countMap.putIfAbsent(bolla, new HashMap<>());
            countMap.get(bolla).put(item, countMap.get(bolla).getOrDefault(item, 0) + 1);

            if (countMap.get(bolla).get(item) > 1) {
                resultMap.putIfAbsent(bolla, new HashMap<>());
                resultMap.get(bolla).put(item, countMap.get(bolla).get(item));
            }
        }
        return resultMap;
    }
    
    public static Map<String, Map<String, Integer>> populateMapParallel(List<Cnmop> movimenti) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> countMap = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> resultMap = new ConcurrentHashMap<>();

        movimenti.parallelStream().forEach(movimento -> {
            String bolla = movimento.getBolla();
            String item = movimento.getItem();

            countMap.computeIfAbsent(bolla, k -> new ConcurrentHashMap<>());
            countMap.get(bolla).compute(item, (k, v) -> v == null ? 1 : v + 1);

            if (countMap.get(bolla).get(item) > 1) {
                resultMap.computeIfAbsent(bolla, k -> new ConcurrentHashMap<>());
                resultMap.get(bolla).put(item, countMap.get(bolla).get(item));
            }
        });

        return new HashMap<>(resultMap);
    }
    
	
}
