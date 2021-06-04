package decorator1;

public class Acai350 extends Acai{
    
    @Override
    public double getPreco() {
        return 3.00;
    }
 
    @Override
    public String getDescricao() {
        return descricao + " 350ml";
    }
     
}
