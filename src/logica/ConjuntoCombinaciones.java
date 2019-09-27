package logica;
import java.util.Random;

public class ConjuntoCombinaciones {
	private static ConjuntoCombinaciones conjuntoCombinaciones;
	private String[] conjunto;
	static int tamanoTotalConjunto=260;
	private ConjuntoCombinaciones(int numeroElementosConjunto) {
		this.conjunto=new String[numeroElementosConjunto];
	}
	public static ConjuntoCombinaciones getConjuntoCombinaciones() {
		if(conjuntoCombinaciones==null) {
			conjuntoCombinaciones= new ConjuntoCombinaciones(tamanoTotalConjunto);
		}
		return conjuntoCombinaciones;
	}

	public String[] getConjunto() {
		return conjunto;
	}

	public void setConjunto(String[] conjunto) {
		this.conjunto = conjunto;
	}
	
	private void shuffle() {
		Random rgen = new Random();  // Random number generator			
		 
		for (int i=0; i<conjunto.length; i++) {
		    int randomPosition = rgen.nextInt(conjunto.length);
		    String temp = conjunto[i];
		    conjunto[i] = conjunto[randomPosition];
		    conjunto[randomPosition] = temp;
		}
	}
	public String[] muestra() {
		
		return conjunto;
		
	}
}
