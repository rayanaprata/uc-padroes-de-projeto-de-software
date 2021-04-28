import java.util.ArrayList;

public class CarrinhoDeCompras implements FormaDePagamento {
	
	ArrayList<Item> itensNoCarrinho = new ArrayList<Item>();
	String formaPagamento;
	int valTotal = 0;

	public void addItem(Item novoItem) {
		itensNoCarrinho.add(novoItem);
	}

	public void comprar(Object objeto) {
		
		for (Item item : itensNoCarrinho) {
			valTotal += item.valor;
		}
		
		if (objeto instanceof Paypal) {
			formaPagamento = "Paypal";
		} else if (objeto instanceof CartaoDeCredito){
			formaPagamento = "cartao de credito";
		} else {
        	System.out.println("Forma de pagamento inválida!");
        }
		
		System.out.println("Valor Total = " + valTotal + " pago com " + formaPagamento + ".");
		itensNoCarrinho.clear();
	}
	
}