import java.util.ArrayList;
import java.util.Date;

public class Viagem {

	private Date data;

	private String origem;

	private String destino;

	private int numMaximoMala;

	private int numMaximoBolsa;

	private int numMaximoMochila;

	private int numMaximoBagagens = numMaximoMochila + numMaximoBolsa + numMaximoMala;

	private ArrayList<Bagagem> bagagens;

	public void cadastrarPassageiro(String cpf, String nome, String passaporte, String tipoBagagem) {
		Passageiro passageiro = new Passageiro();
		passageiro.setCpf(cpf);
		passageiro.setNome(nome);
		passageiro.setPassaporte(passaporte);
		cadastrarBagagem(tipoBagagem, passageiro);

	}

	public void cadastrarBagagem(String tipoBagagem, Passageiro passageiro) {
		Bagagem bagagem = null;

		switch (tipoBagagem) {
		case "mala":
			bagagem = new Mala();
			break;
		case "bolsa":
			bagagem = new Bolsa();
			break;
		case "mochila":
			bagagem = new Mochila();
			break;
		}

		bagagens.add(bagagem);

		passageiro.addBagagem(bagagem);
	}

	public boolean podeCadastrarBagagemDoPassageiro(Passageiro passageiro) {
		if (passageiro.getBagagem().size() < 2) {
			return true;
		} else {
			return false;
		}

	}

	public boolean podeCadastrarBagagemNaViagem() {
		if (this.bagagens.size() < numMaximoBagagens) {
			return true;
		} else {
			return false;
		}
	}

}
