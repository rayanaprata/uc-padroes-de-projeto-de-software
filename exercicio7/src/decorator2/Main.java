package decorator2;

public class Main {

	public static void main(String[] args) {

		Pizza pz1 = new Pequena();
		pz1 = new Mussarela(pz1);
		pz1 = new Oregano(pz1);
		pz1 = new Tomate(pz1);
		pz1 = new CreamCheese(pz1);
		System.out.println(pz1.getDescricao() + " R$ " + pz1.getPreco());


		Pizza pz2 = new Media();
		pz2 = new Mussarela(pz2);
		pz2 = new Oregano(pz2);
		pz2 = new Bacon(pz2);
		pz2 = new Tomate(pz2);
		System.out.println(pz2.getDescricao() + " R$ " + pz2.getPreco());


		Pizza pz3 = new Grande();
		pz3 = new Mussarela(pz3);
		pz3 = new Pepperoni(pz3);
		pz3 = new Bacon(pz3);
		pz3 = new CreamCheese(pz3);
		pz3 = new Oregano(pz3);
		pz3 = new Tomate(pz3);
		System.out.println(pz3.getDescricao() + " R$ " + pz3.getPreco());


	}

}
//SAIDA ESPERADA
//Pizza Pequena + Mussarela + Oregano  + Tomate  + CreamCheese R$ 14.7
//Pizza Media + Mussarela + Oregano  + Bacon + Tomate  R$ 17.5
//Pizza Grande + Mussarela + Pepperoni + Bacon + CreamCheese + Oregano  + Tomate  R$ 23.7
