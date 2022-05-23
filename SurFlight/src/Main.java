public class Main {

	public static void main(String[] args) {

		cadastrarViagemComPassageiroComBagagem();
		
	}

	public static void cadastrarViagemComPassageiroComBagagem() {
	
		Viagem viagem = new Viagem("30/05/2022", "Salvador-BA", "São Paulo-SP", 2, 3, 4, 3);

		viagem.cadastrarPassageiro();
	}
	
}
