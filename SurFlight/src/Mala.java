
public class Mala extends Bagagem {

	private double altura;

	private double largura;

	private double profundidade;
	
	@Override
	public boolean seraDespachada() {
		final double PESO_MAXIMO = 10;
		if (peso>10) {
			if (altura <= 55 && largura <= 33 && profundidade <= 25) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
