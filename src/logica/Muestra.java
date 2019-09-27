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
		for(int i=0;i<tamanoMuestra;i++) {
			muestraActual[i]=conjuntoTotal.getConjunto()[i];
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
