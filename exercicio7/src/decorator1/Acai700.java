package decorator1;

public class Acai700 extends Acai{

	@Override
    public double getPreco() {
        return 6.00;
    }
 
    @Override
    public String getDescricao() {
        return descricao + " 700ml";
    }
}
