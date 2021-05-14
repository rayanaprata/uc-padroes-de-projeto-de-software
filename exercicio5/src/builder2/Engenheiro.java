package builder2;

public class Engenheiro{ 

protected CasaBuilder projeto;

	public Engenheiro(CasaBuilder projeto) {
		this.projeto = projeto;
	}
	
	public void construirCasa() {
		projeto.buildAlicerce();
		projeto.buildEstrutura();
		projeto.buildTelhado();
		projeto.buildInterior();
	}
	
	public Casa getCasa() {
		return projeto.getCasa();
	}
	
} 