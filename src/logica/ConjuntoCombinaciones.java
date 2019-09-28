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
	public static String[] removeTheElement(String[] arr, int index) { 
	
		// If the array is empty 
		// or the index is not in array range 
		// return the original array 
		if (arr == null || index < 0 || index >= arr.length) { 
		
			return arr; 
		} 
		
		// Create another array of size one less 
		String[] nuevoArray = new String[arr.length - 1]; 
		
		// Copy the elements except the index 
		// from original array to the other array 
		for (int i = 0, k = 0; i < arr.length; i++) { 
			
			// if the index is 
			// the removal element index 
			if (i == index) { 
				continue; 
			} 
		
			// if the index is not 
			// the removal element index 
			nuevoArray[k++] = arr[i]; 
		} 
		
		// return the resultant array 
		return nuevoArray; 
}
	public void eliminarEliminarElementosDelConjunto(String[] elementosAEliminar)  {
		int indexConjuntoTotal;
		int tamanoConjunto= conjunto.length;
		for(indexConjuntoTotal=0;indexConjuntoTotal<tamanoConjunto;indexConjuntoTotal++) {
			int indexElementosAEliminar;
			int tamanoelementosAEliminar= elementosAEliminar.length;
			for(indexElementosAEliminar=0;indexElementosAEliminar<tamanoelementosAEliminar;indexElementosAEliminar++) {
				if(conjunto[indexConjuntoTotal]==elementosAEliminar[indexElementosAEliminar]) {
					conjunto=removeTheElement(conjunto,indexConjuntoTotal);
					tamanoConjunto=tamanoConjunto-1;
				}
			}
		}
	}
	
	public String[] muestra() {
		return conjunto;
	}
}
