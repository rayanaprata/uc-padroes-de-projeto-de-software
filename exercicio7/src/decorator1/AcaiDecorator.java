package decorator1;

public abstract class AcaiDecorator extends Acai{
	
	public Acai acai;
	
	 public AcaiDecorator(Acai umAcai) {
		 acai = umAcai;
	 }
	 
	 @Override
	    public String getDescricao() {
	        return acai.getDescricao()  + " + " + descricao;
	    }
	 
	    public double getPreco() {
	        return acai.getPreco() + preco;
	    }
	 
	 

}


