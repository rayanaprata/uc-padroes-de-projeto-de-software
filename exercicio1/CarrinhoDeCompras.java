import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	ArrayList<Item> itensNoCarrinho = new ArrayList<Item>();
	int valTotal = 0;

	public void addItem(Item novoItem) {
		itensNoCarrinho.add(novoItem);
	}

	public void comprar(FormaDePagamento formaPagamento) {
		
		for (Item item : itensNoCarrinho) {
			valTotal += item.valor;
		}
		
		formaPagamento.pagar(valTotal);
		itensNoCarrinho.clear();
	}
	
}