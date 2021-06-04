package decorator1;

public class Main {
    public static void main(String[] args) {
        
        Acai acai1 = new Acai350();
        System.out.println(acai1.getDescricao() + " R$ " + acai1.getPreco());
         
        Acai acai2 = new Acai350();
        acai2 = new Morango(acai2);
        acai2 = new Banana(acai2);
        System.out.println(acai2.getDescricao() + " R$ " + acai2.getPreco());
         
        Acai acai3 = new Acai500();
        acai3 = new Banana(acai3);
        acai3 = new LeiteNinho(acai3);
        acai3 = new Nutella(acai3);
        System.out.println(acai3.getDescricao() + " R$ " + acai3.getPreco());
         
        Acai acai4 = new Acai500();
        acai4 = new Nutella(acai4);
        acai4 = new Morango(acai4);
        System.out.println(acai4.getDescricao() + " R$ " + acai4.getPreco());
         
        Acai acai5 = new Acai700();
        acai5 = new Morango(acai5);
        acai5 = new Banana(acai5);
        acai5 = new LeiteNinho(acai5);
        acai5 = new Granola(acai5);
        acai5 = new Nutella(acai5);
        System.out.println(acai5.getDescricao() + " R$ " + acai5.getPreco());
    }
}
//SAIDA ESPERADA
//Açaí 350ml R$ 3.0
//Açaí 350ml + Morango + Banana R$ 5.0
//Açaí 500ml + Banana + Leite Ninho + Nutella R$ 8.5
//Açaí 500ml + Nutella + Morango R$ 5.5
//Açaí 700ml + Morango + Banana + Leite Ninho + Granola + Nutella R$ 12.0