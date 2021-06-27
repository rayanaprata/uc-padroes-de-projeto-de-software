
public class Carro {
	
	public String motor;
	public String suspensao;
	public String direcao;
	public String bateria;  
	
	public String cambio;
	public String nome;
	public String opcional;
	public double preco;
	
	public Carro() {
		
	}
	
	public Carro(String motor, String suspensao, String direcao, String bateria) {

		this.motor = motor;
		this.suspensao = suspensao;
		this.direcao = direcao;
		this.bateria = bateria;

		this.cambio = "Desligado";
	}

	public void acelerar(int velocidade) {
		if(cambio.equalsIgnoreCase("Desligado")) {
			System.out.println("Carro desligado.");
		}else if(cambio.equalsIgnoreCase("Neutro")) {

			System.out.println("O carro n�o pode acelerar porque est� no Neutro.");
		}else if(cambio.equalsIgnoreCase("PrimeiraMarcha")) {

			if(velocidade > 60) {
				System.out.println("O carro precisa aumentar a marcha.");
			} else {
				System.out.println("O carro est� � " + velocidade + " km/h na primeira marcha.");
			}		
		}else if(cambio.equalsIgnoreCase("SegundaMarcha")) {

			if(velocidade > 100) {
				System.out.println("N�o � poss�vel acelerar mais.");
			} else if(velocidade < 60){
				System.out.println("Diminua a marcha, o carro est� � " + velocidade + " km/h na segunda marcha.");
			}else{
				System.out.println("O carro est� � " + velocidade + " km/h na segunda marcha.");
			}		
		}else if(cambio.equalsIgnoreCase("MarchaRe")) {

			System.out.println("O carro est� � " + velocidade + " km/h na marcha r�.");
		}

	}

	public void aumentarMarcha() {
		if(cambio.equalsIgnoreCase("Desligado")) {
			System.out.println("Carro desligado.");
		}else if(cambio.equalsIgnoreCase("Neutro")) {

			cambio = "PrimeiraMarcha";
		}else if(cambio.equalsIgnoreCase("PrimeiraMarcha")) {

			cambio = "SegundaMarcha";
		}else if(cambio.equalsIgnoreCase("SegundaMarcha")) {

			System.out.println("O carro j� est� na segunda marcha.");
		}else if(cambio.equalsIgnoreCase("MarchaRe")) {

			cambio = "Neutro";
		}

	}

	public void diminuirMarcha() {
		if(cambio.equalsIgnoreCase("Desligado")) {
			System.out.println("Carro desligado.");
		}else if(cambio.equalsIgnoreCase("Neutro")) {

			cambio = "MarchaRe";
		}else if(cambio.equalsIgnoreCase("PrimeiraMarcha")) {

			cambio = "Neutro";
		}else if(cambio.equalsIgnoreCase("SegundaMarcha")) {

			cambio = "PrimeiraMarcha";
		}else if(cambio.equalsIgnoreCase("MarchaRe")) {

			System.out.println("O carro j� est� na marcha r�.");
		}

	}

	public void ligar() {
		cambio = "Neutro";
	}

	public void desligar() {
		cambio = "Desligado";
	}

	public void getDescricao() {
		System.out.println("Nome:\n "+ nome);
		System.out.println("Pre�o:\n " + preco);
		System.out.println("Motor:\n " + motor);
		System.out.println("Suspens�es:\n " + suspensao);
		System.out.println("Dire��o:\n " + direcao);
		System.out.println("Bateria:\n " + bateria);
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco( double preco) {
		this.preco = preco;
	}
	
	public String getOpcional(){
		return opcional;
	}

}
