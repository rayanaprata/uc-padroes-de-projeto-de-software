
public class FabricaKicks implements FabricaCarro{

	@Override
	public Bateria criarBateria() {
		return new BateriaMoura();
	}

	@Override
	public Direcao criarDirecao() {
		return new DirecaoKicks();
	}

	@Override
	public Motor criarMotor() {
		return new MotorKicks();
	}

	@Override
	public Suspensao criarSuspensao() {
		return new SuspensaoKicks();
	}

}
