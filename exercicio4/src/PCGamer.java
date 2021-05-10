
public class PCGamer extends Computador{
	
	public PCGamer(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hd=hdd;
		this.cpu=cpu;
	}

	public String getInfo2() {
		return "PCGamer: RAM= "+this.ram +", HDD="+this.hd+", CPU="+this.cpu;
	}

}
