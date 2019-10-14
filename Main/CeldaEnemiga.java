package Main;

public class CeldaEnemiga extends Celda {

	
	public CeldaEnemiga(int i, int j) {
		super(i, j);	
	}
	public String queSoy() {
		if (personaje==null)
			return "celdaEnemiga";
		else return "TanqueCr_H";

	}
	
}

