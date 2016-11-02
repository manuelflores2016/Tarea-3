
public class Planeta extends CuerpoEstelar{
	boolean es_habitante;
	int especies_conocidas;
	
	Planeta (int posicion, int masa, boolean es_habitante, int especies_conocidas){
		super(posicion, masa);
		this.es_habitante= es_habitante;
		this.especies_conocidas = especies_conocidas;
}
}
