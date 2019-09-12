package Main;

public class CeldaAmiga extends Celda {

	public CeldaAmiga(int i, int j) {
		super(i, j);
	}

	
	public String queSoy() {
		if (personaje==null) {
			return "celdaAliada";
		}
		else return "ironman";

	}

}
