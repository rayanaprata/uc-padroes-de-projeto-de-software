package builder2;

public class Casa { 

	private String alicerce; 
	private String estrutura; 
	private String telhado; 
	private String interior; 

	public String getAlicerce() {
		return alicerce;
	}

	public void setAlicerce(String alicerce) {
		this.alicerce = alicerce;
	}

	public String getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(String estrutura) {
		this.estrutura = estrutura;
	}

	public String getTelhado() {
		return telhado;
	}

	public void setTelhado(String telhado) {
		this.telhado = telhado;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	@Override
	public String toString() {
		
		return alicerce+"\n" + estrutura+"\n" + telhado+"\n" + interior+"\n";
	}

} 
