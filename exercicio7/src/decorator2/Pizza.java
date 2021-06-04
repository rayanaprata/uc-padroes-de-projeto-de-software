package decorator2;

public abstract class Pizza {
 
    String descricao = "Pizza";
    double preco;
    
    public void setDescricao(String descricao){
		this.descricao = descricao;
	}
 
	public String getDescricao(){
		return descricao;
	}
	 
	public double getPreco() {
		return preco;
	}
	 
}