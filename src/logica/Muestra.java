package logica;
import logica.ConjuntoCombinaciones;
public class Muestra {
	String[] muestraAntigua;
	String[] muestraActual;
	ConjuntoCombinaciones conjuntoTotal= ConjuntoCombinaciones.getConjuntoCombinaciones();
	int porcientoMuestra=4;
	
	public String[] getMuestra() {
		int tamanoMuestra=conjuntoTotal.getConjunto().length/porcientoMuestra;
		muestraActual=new String[tamanoMuestra];
		conjuntoTotal.shuffle();
		for(int index=0;index<tamanoMuestra;index++) {
			muestraActual[index]=conjuntoTotal.getConjunto()[index];
		}
		return muestraActual;	
	}

	public String[] getMuestraAntigua() {
		return muestraAntigua;
	}

	public void setMuestraAntigua(String[] muestraAntigua) {
		this.muestraAntigua = muestraAntigua;
	}
}
