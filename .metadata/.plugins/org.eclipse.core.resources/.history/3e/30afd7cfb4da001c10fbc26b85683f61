
public class Mala extends Bagagem {

	private double altura;

	private double largura;

	private double profundidade;
	
	

	public Mala(double peso, String cor, String marca, Passageiro passageiro, double altura, double largura,
			double profundidade) {
		super(peso, cor, marca, passageiro);
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}



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
	
	
}
