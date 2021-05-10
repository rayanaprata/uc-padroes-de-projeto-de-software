
public class Servidor extends Computador{

	public Servidor(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hd=hdd;
		this.cpu=cpu;
	}

	public String getInfo5() {
		return "Servior: RAM= "+this.ram +", HDD="+this.hd+", CPU="+this.cpu;
	}

}
