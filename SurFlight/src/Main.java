public class Main {

	public static void main(String[] args) {

		cadastrarViagemComPassageiroComBagagem();
		
	}

	public static void cadastrarViagemComPassageiroComBagagem() {
		
		String data = "30/05/2022";
		String origem = "Salvador-BA";
		String destino = "São Paulo-SP";
		int numMaximoBolsas = 2;
		int numMaximoMalas = 3;
		int numMaximoMochilas = 4;
		int numMaximoPassageiros = 3;
	
		Viagem viagem = new Viagem(data, origem, destino, numMaximoBolsas, numMaximoMalas, numMaximoMochilas, numMaximoPassageiros);

		viagem.cadastrarPassageiros();
	}
	
}
