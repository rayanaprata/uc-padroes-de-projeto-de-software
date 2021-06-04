package decorator2;

public class PizzaDecorator extends Pizza{
	
	public Pizza pizza;
	
	public PizzaDecorator(Pizza umaPizza) {
		pizza = umaPizza;
	}
	
	@Override
    public String getDescricao() {
        return pizza.getDescricao()  + " + " + descricao;
    }
 
    public double getPreco() {
        return pizza.getPreco() + preco;
    }

}
