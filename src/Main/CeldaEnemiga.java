package Main;

public class CeldaEnemiga extends Celda {

	public CeldaEnemiga(int i, int j) {
		super(i, j);	
	}

	@Override
	public Celda queSoy() {
		return this;
	}

}
