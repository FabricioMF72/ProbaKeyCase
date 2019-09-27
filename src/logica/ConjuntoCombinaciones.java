package logica;
import java.util.Random;

public class ConjuntoCombinaciones {
	private static ConjuntoCombinaciones conjuntoCombinaciones;
	private String[] conjunto;
	
	static int tamanoTotalConjunto=260;
	private ConjuntoCombinaciones(int numeroElementosConjunto) {
		this.conjunto=new String[numeroElementosConjunto];
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] numbers = "0123456789".toCharArray();
        int posActual=0;
        for (int index1 = 0; index1 < alphabet.length; index1++)
        {
            
            for (int index2 = 0;index2 < numbers.length; index2++ )
            {
            	
            	conjunto[posActual]=String.valueOf(alphabet[index1])+String.valueOf(numbers[index2]);
            	posActual++;
            }
        }
        for(int i=0;i<260;i++) {
        	System.out.println(conjunto[i]);
        }
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
	
	public void shuffle() {
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
