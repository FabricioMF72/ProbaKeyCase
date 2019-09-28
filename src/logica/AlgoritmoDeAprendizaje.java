/**
 * 
 */
package logica;

import java.util.ArrayList;

/**
 * @author Joshua
 *
 */
public class AlgoritmoDeAprendizaje {
	
	final String TextoEncriptado = "xZwM7BWIpSjYyGFr9rhpEa+cYVtACW7yQKmyN6OYSCv0ZEg9jWbc6lKzzCxRSSIvOvlimQZBMZOYnOwiA9yy3YU8zk4abFSItoW6Wj0ufQ0=";
	
	String ClaveMalFormada = "29dh120_dk1_3";
	String secretKey;
	
	public String[] EncontrarRepetidos (String[] Arreglo1, String[] Arreglo2)
	{
		
		ArrayList<String> ElementosRepetidos = new ArrayList<>();
		String[] Comunes;
		
		for (int indexArreglo1 = 0; indexArreglo1 < Arreglo1.length; indexArreglo1++)
		{
			for(int indexArreglo2 = 0; indexArreglo2 < Arreglo2.length; indexArreglo2++)
			{
				if (Arreglo1[indexArreglo1].equals(Arreglo2[indexArreglo2]))
				{
					ElementosRepetidos.add(Arreglo1[indexArreglo1]);
				}
			}
			
		}
		
		Comunes = ElementosRepetidos.toArray(new String [ElementosRepetidos.size()]);
		return Comunes;
	}
	
	public void IniciarPruebas()
	{
		boolean result = false;
		Muestra m = new Muestra();
		boolean ExisteMuestraAntigua=false;
		while (result == false)
		{
			
			boolean MensajeDescifrado = Encontrado(m.getMuestra());
			
			if (MensajeDescifrado == false)
			{
				if (ExisteMuestraAntigua==false)
				{
					System.out.println("Se crea una muestra antigua");
					m.setMuestraAntigua(m.muestraActual);
					ExisteMuestraAntigua=true;
				}
				else
				{
					System.out.println("no se encontro el elemento");
					String[] elementosAEliminar=EncontrarRepetidos(m.muestraActual,m.muestraAntigua);
					ConjuntoCombinaciones.getConjuntoCombinaciones().eliminarEliminarElementosDelConjunto(elementosAEliminar);
					ExisteMuestraAntigua=false;
					System.out.println("se reduce el tamaño del conjunto total eliminando los valores que se repitieron en la muestra antigua con la actual");
					System.out.println(ConjuntoCombinaciones.getConjuntoCombinaciones().getConjunto().length);
				}
			}
			else
			{
				result = MensajeDescifrado;
				System.out.println("Algoritmo Finalizado");
			}
		}
		
	}
	
	public Boolean Encontrado(String[] Muestra)
	{
		int tamañoMuestra = Muestra.length;
		for (int index = 0; index < tamañoMuestra; index++)
		{
			System.out.println(Muestra[index]);
			char[] caracteres = Muestra[index].toCharArray();
			//System.out.println(caracteres[0]);
			//System.out.println(caracteres[1]);

			secretKey = ClaveMalFormada.substring(0,7) + String.valueOf(caracteres[0]) + ClaveMalFormada.substring(8,11) + String.valueOf(caracteres[1]) + ClaveMalFormada.substring(12);
			
			if ((Desencriptado.decrypt(TextoEncriptado, secretKey) != null) && (caracteres[0] != 'b') && (caracteres[1] != '3'))
			{
				return true;
			}
		}
		return false;
	}
}
