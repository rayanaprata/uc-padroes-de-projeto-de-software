package decorator1;

public class Acai500 extends Acai{
	
	@Override
    public double getPreco() {
        return 4.00;
    }
 
    @Override
    public String getDescricao() {
        return descricao + " 500ml";
    }
	
}
