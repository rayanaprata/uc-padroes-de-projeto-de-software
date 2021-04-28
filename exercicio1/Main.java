
public class Main {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);

		carrinho.addItem(item1);
		carrinho.addItem(item2);

		carrinho.comprar(new Paypal("email@examplo.com", "senha"));

		carrinho.comprar(new CartaoDeCredito("Joao", "1234567890123456", "786", "12/21"));

	}

}
