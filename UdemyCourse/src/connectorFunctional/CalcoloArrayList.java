package connectorFunctional;

import java.util.ArrayList;

public class CalcoloArrayList {
    public static ArrayList<Integer> calcolaValori(int t1, int t2) {
        ArrayList<Integer> risultati = new ArrayList<>();
        
        int risultato1 = (int) Math.ceil((double) t1 / t2);
        risultati.add(risultato1);
        
        int rimanente = t1 - risultato1;
        int divisor = t2 - 1;
        
        while (divisor > 1) {
            int risultatoI = (int) Math.ceil((double) rimanente / divisor);
            risultati.add(risultatoI);
            rimanente -= risultatoI;
            divisor--;
        }
        
        if (divisor == 1) {
            risultati.add(rimanente);
        }
        
        return risultati;
    }
    
    public static void main(String[] args) {
        int t1 = 99;
        int t2 = 2;
        
        ArrayList<Integer> risultati = calcolaValori(t1, t2);
        
        for (int i = 0; i < risultati.size(); i++) {
            System.out.println("Risultato " + (i + 1) + ": " + risultati.get(i));
        }
    }
}



