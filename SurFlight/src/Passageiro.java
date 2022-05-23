import java.util.ArrayList;

public class Passageiro {

	private String cpf;

	private String nome;

	private String passaporte;

	private ArrayList<Bagagem> bagagens;
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public ArrayList<Bagagem> getBagagens() {
		return bagagens;
	}

	public void setBagagens(ArrayList<Bagagem> bagagem) {
		this.bagagens = bagagem;
	}

	public void addBagagem(Bagagem bagagem) {
		this.bagagens.add(bagagem);
	}
	
	public boolean podeCadastrarBagagemDoPassageiro() {
		if (this.bagagens.size() < 2) {
			return true;
		}
		return false;
	}
	

	
	
	

}
