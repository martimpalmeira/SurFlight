
public class Mala extends Bagagem {

	private double altura;

	private double largura;

	private double profundidade;

	@Override
	public boolean seraDespachada() {
		if (super.seraDespachada()) {
			return true;
		} else {
			if (altura > 55 || largura > 33 || profundidade > 25) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public void cadastrarBagagem() {
		Bagagem mala = new Mala();
	}

}
