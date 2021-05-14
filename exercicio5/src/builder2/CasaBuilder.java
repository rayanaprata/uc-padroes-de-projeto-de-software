package builder2;

public abstract class CasaBuilder{ 

protected Casa casa = new Casa();
	
	public abstract void buildAlicerce();
	public abstract void buildEstrutura();
	public abstract void buildTelhado();
	public abstract void buildInterior();
	
	public Casa getCasa() {
		return casa;
	}
    
	 
} 