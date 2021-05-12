package builder2;

public class Main{ 
	public static void main(String[] args){ 

		CasaBuilder builder;
		Engenheiro engenheiro;
		Casa casa;

		builder = new IglooBuilder(); 
		engenheiro = new Engenheiro(builder); 
		engenheiro.construirCasa(); 
		casa = builder.getCasa(); 

		System.out.println("Casa construída: \n"+ casa);

		builder = new MadeiraBuilder(); 
		engenheiro = new Engenheiro(builder); 
		engenheiro.construirCasa(); 
		casa = builder.getCasa(); 

		System.out.println("Casa construída: \n"+ casa);

		builder = new AlvenariaBuilder(); 
		engenheiro = new Engenheiro(builder); 
		engenheiro.construirCasa(); 
		casa = builder.getCasa(); 

		System.out.println("Casa construída: \n"+ casa);


	} 
}
//SAIDA ESPERADA
//Casa construída: 
//Baras de Gelo
//Blocos de Gelo
//Telhado de Gelo
//Esculturas de Gelo
//
//Casa construída: 
//Baras de Madeira
//Blocos de Madeira
//Telhado de Madeira
//Lareira
//
//Casa construída: 
//Baras de Ferro
//Blocos de Cimento
//Telhado de Barro
//Churrasqueira
