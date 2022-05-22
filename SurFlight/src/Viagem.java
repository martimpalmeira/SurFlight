import java.util.ArrayList;
import java.util.Date;

public class Viagem {

	private 	String data;

	private String origem;

	private String destino;

	private int numMaximoMala;

	private int numMaximoBolsa;

	private int numMaximoMochila;

	private int numMaximoBagagens = numMaximoMochila + numMaximoBolsa + numMaximoMala;
	
	private int numMaximoPassageiros;

	private ArrayList<Bagagem> bagagens;
	
	private ArrayList<Passageiro> passageiros;
	

	public Viagem(String data, String origem, String destino, int numMaximoMala, int numMaximoBolsa,
			int numMaximoMochila, int numMaximoPassageiros) {
		super();
		this.data = data;
		this.origem = origem;
		this.destino = destino;
		this.numMaximoMala = numMaximoMala;
		this.numMaximoBolsa = numMaximoBolsa;
		this.numMaximoMochila = numMaximoMochila;
		this.numMaximoPassageiros = numMaximoPassageiros;
		bagagens = new ArrayList<>();
		passageiros = new ArrayList<>();
	}

	public Passageiro cadastrarPassageiro(String cpf, String nome, String passaporte) {
		Passageiro passageiro = new Passageiro();
		passageiro.setCpf(cpf);
		passageiro.setNome(nome);
		passageiro.setPassaporte(passaporte);
		ArrayList<Bagagem> bagagens = new ArrayList<Bagagem>();
		passageiro.setBagagem(bagagens);
		return passageiro;

	}

//	public void cadastrarBagagem(String tipoBagagem, Passageiro passageiro) {	
//		Bagagem bagagem;
//		switch (tipoBagagem) {
//		case "mala":
//			 bagagem = new Mala();
//			break;
//		case "bolsa":
//			 bagagem = new Bolsa();
//			break;
//		case "mochila":
//			 bagagem = new Mochila();
//			break;
//		default:
//			bagagem = null;
//		}
//
//		this.bagagens.add(bagagem);
//		bagagem.setPassageiro(passageiro);
//		passageiro.addBagagem(bagagem);
//		
//	}

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

	public ArrayList<Bagagem> getBagagens() {
		return bagagens;
	}

	public void setBagagens(ArrayList<Bagagem> bagagens) {
		this.bagagens = bagagens;
	}

	public ArrayList<Passageiro> getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(ArrayList<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}

	public int getNumMaximoPassageiros() {
		return numMaximoPassageiros;
	}

	public void setNumMaximoPassageiros(int numMaximoPassageiros) {
		this.numMaximoPassageiros = numMaximoPassageiros;
	}
	
	
	
	
	
	

}
