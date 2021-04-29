
public class Paypal implements FormaDePagamento {
	
	String email;
	String senha;

	public Paypal(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public void pagar(int valTotal) {
		System.out.println("Valor Total = " + valTotal + " pago com Paypal.");			
	}
	
}