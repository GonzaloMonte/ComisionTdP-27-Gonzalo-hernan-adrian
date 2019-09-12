package Main;

public class CeldaAmiga extends Celda {

	public CeldaAmiga(int i, int j) {
		super(i, j);
		
	}
<<<<<<< HEAD
	public Celda queSoy() {
		return this;
=======

	
	public String queSoy() {
		if (personaje==null) {
			return "celdaAliada";
		}
		else return "ironman";
>>>>>>> 41ddb4bbc9f65d917ec55752adee6202554c3035
	}

}
