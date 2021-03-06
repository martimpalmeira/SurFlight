import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Viagem {

	private String data;

	private String origem;

	private String destino;

	private int numMaximoMala;

	private int numMaximoBolsa;

	private int numMaximoMochila;

	private int numMaximoPassageiros;

	private ArrayList<Bagagem> bagagens;

	private ArrayList<Passageiro> passageiros;

	
	// Construtor
	public Viagem(String data, String origem, String destino, int numMaximoBolsa, int numMaximoMala,
			int numMaximoMochila, int numMaximoPassageiros) {
		this.data = data;
		this.origem = origem;
		this.destino = destino;
		this.numMaximoBolsa = numMaximoBolsa;
		this.numMaximoMala = numMaximoMala;
		this.numMaximoMochila = numMaximoMochila;
		this.numMaximoPassageiros = numMaximoPassageiros;
		passageiros = new ArrayList<Passageiro>();
		bagagens = new ArrayList<Bagagem>();
	}


	//VERIFICAM SE PODE CADASTRAR CADA TIPO DE BAGAGEM
	public boolean podeCadastrarBolsa() {
		int numBolsasCadastradas = 0;
		for (int i = 0; i < bagagens.size(); i++) {
			if (bagagens.get(i) instanceof Bolsa) {
				numBolsasCadastradas++;
			}
		}
		if (numBolsasCadastradas < numMaximoBolsa) {
			return true;
		} else {
			return false;
		}
	}

	public boolean podeCadastrarMala() {
		int numMalasCadastradas = 0;
		for (int i = 0; i < bagagens.size(); i++) {
			if (bagagens.get(i) instanceof Mala) {
				numMalasCadastradas++;
			}
		}
		if (numMalasCadastradas < numMaximoMala) {
			return true;
		} else {
			return false;
		}
	}

	public boolean podeCadastrarMochila() {
		int numMochilasCadastradas = 0;
		for (int i = 0; i < bagagens.size(); i++) {
			if (bagagens.get(i) instanceof Mochila) {
				numMochilasCadastradas++;
			}
		}
		if (numMochilasCadastradas < numMaximoMochila) {
			return true;
		} else {
			return false;
		}
	}

	
	//CADASTRO DAS BAGAGENS DO PASSAGEIRO
	public void cadastrarBagagensDoPassageiro(Passageiro passageiro, double numBagDoPassageiro, int i) {

		for (int j = 1; j < numBagDoPassageiro + 1;) {

			if (passageiro.podeCadastrarBagagemDoPassageiro()) {

				exibir("Cadastrando " + j + "?? bagagem do " + i + "?? passageiro");

				Bagagem bagagem = null;

				exibir("Informe o n??mero da bagagem que ser?? cadastrada\n(1)bolsa\n(2)mala\n(3)mochila");
				int tipoBagagem = lerInt();

				if (!this.podeCadastrarBolsa() && tipoBagagem == 1) {
					exibir("N??mero de BOLSAS excedido");
				} else if (!this.podeCadastrarMala() && tipoBagagem == 2) {
					exibir("N??mero de MALAS excedido");
				} else if (!this.podeCadastrarMochila() && tipoBagagem == 3) {
					exibir("N??mero de MOCHILAS excedido");
				} else {
					
					exibir("Informe o peso da bagagem");
					double pesoBagagem = lerDouble();

					if (pesoBagagem <= 10) {
						System.out.println("Informe a cor da bagagem");
						String corBagagem = lerString();
						System.out.println("Informe a marca da bagagem");
						String marcaBagagem = lerString();
						
						if (tipoBagagem == 1) {
							bagagem = new Bolsa(pesoBagagem, corBagagem, marcaBagagem, passageiro);
							j++;

						} else if (tipoBagagem == 2) {

							exibir("Informe a altura da mala(cm): ");
							double altura = lerDouble();
							if (altura <= 55) {
								exibir("Informe a largura da mala(cm): ");
								double largura = lerDouble();
								if (largura <= 35) {
									exibir("Informe a profundidade da mala(cm): ");
									double profundidade = lerDouble();
									if (profundidade <= 25) {
										bagagem = new Mala(pesoBagagem, corBagagem, marcaBagagem, passageiro, altura,
												largura, profundidade);
										j++;
									} else {
										exibir("PROFUNDIDADE da mala ultrapassa tamanho limite");
									}
								} else {
									exibir("LARGURA da mala ultrapassa tamanho limite");
								}

							} else {
								exibir("ALTURA da mala ultrapassa tamanho limite");
							}

						} else if (tipoBagagem == 3) {
							
							bagagem = new Mochila(pesoBagagem, corBagagem, marcaBagagem, passageiro);
							j++;
						}

						passageiro.addBagagem(bagagem);
						this.bagagens.add(bagagem);

					} else {
						exibir("Bagagem ser?? despachada");
					}
				}

			} else {
				exibir("N??mero de bagagens por passageiro EXCEDIDO");
				break;
			}
		}
	}
	
	
	//CADASTRO DOS PASSAGEIROS
	public void cadastrarPassageiros() {

		for (int i = 1; i < this.numMaximoPassageiros + 1; i++) {

			exibir("*** Cadastrando " + i + "?? passageiro ***");
			exibir("Digite o cpf do passageiro:");
			String cpf = lerString();
			exibir("Digite o nome do passageiro:");
			String nome = lerString();
			exibir("Digite o passaporte do passageiro:");
			String passaporte = lerString();

			Passageiro passageiro = new Passageiro(cpf, nome, passaporte);

			exibir("Quantas bagagens deseja cadastrar?\n(0)\n(1)\n(2)");
			int numBagDoPassageiro = lerInt();

			this.cadastrarBagagensDoPassageiro(passageiro, numBagDoPassageiro, i);
		}
	}

	
	
	// METODOS DE LEITURA E EXIBICAO
	public String lerString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public int lerInt() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public double lerDouble() {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		sc.nextLine();
		return num;
	}

	public void exibir(String txt) {
		System.out.println(txt);
	}

}
