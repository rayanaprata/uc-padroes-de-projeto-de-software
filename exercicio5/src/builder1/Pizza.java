package builder1;

public class Pizza {
	
    private String massa;
    private String molho;
    private String cobertura;

    public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}
	
	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	@Override
    public String toString() {
    	return "Massa: "+massa+"\nMolho: "+molho+"\nCobertura: "+cobertura;
    }
}