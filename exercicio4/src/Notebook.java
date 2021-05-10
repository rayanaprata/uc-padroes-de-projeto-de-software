
public class Notebook extends Computador{
	
	public Notebook (String ram, String hdd, String cpu){
		this.ram=ram;
		this.hd=hdd;
		this.cpu=cpu;
	}
	
	public String getInfo1() {	
		return "Notebook: RAM= "+this.ram +", HDD="+this.hd+", CPU="+this.cpu;
	}

}
