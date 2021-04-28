
public class CartaoDeCredito {
	
	String nomeTitular;
	String numCartao;
	String codSeguranca;
	String dataVencimento;
	
	public CartaoDeCredito(String nomeTitular, String numCartao, String codSeguranca, String dataVencimento) {
		super();
		this.nomeTitular = nomeTitular;
		this.numCartao = numCartao;
		this.codSeguranca = codSeguranca;
		this.dataVencimento = dataVencimento;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public String getNumCartao() {
		return numCartao;
	}
	
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	
	public String getCodSeguranca() {
		return codSeguranca;
	}
	
	public void setCodSeguranca(String codSeguranca) {
		this.codSeguranca = codSeguranca;
	}
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}