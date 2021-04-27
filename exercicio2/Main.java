
public class Main {
	
	
	public static void main(String[] args) {
		
		ContaEstacionamento contaEstacionamento;
		Veiculo veiculo = new Veiculo("ABC-1234",Veiculo.PASSEIO);
	
		contaEstacionamento = new 
				ContaEstacionamento(veiculo, "08-03-2018 18:30:00", "08-03-2018 22:30:00");
		contaEstacionamento.imprimirConta();
		
		contaEstacionamento = new 
				ContaEstacionamento(veiculo, "08-03-2018 18:30:00", "10-03-2018 19:30:00");
		contaEstacionamento.imprimirConta();
		
	}
	
}
