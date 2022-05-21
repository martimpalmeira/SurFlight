import java.util.ArrayList;

public class Passageiro {

	private String cpf;

	private String nome;

	private String passaporte;

	private ArrayList<Bagagem> bagagens;
	
	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public ArrayList<Bagagem> getBagagem() {
		return bagagens;
	}

	public void setBagagem(ArrayList<Bagagem> bagagem) {
		this.bagagens = bagagem;
	}

	public void addBagagem(Bagagem bagagem) {
		this.bagagens.add(bagagem);
	}
	
	

	
	
	

}
