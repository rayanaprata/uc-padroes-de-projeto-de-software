
public class FabricaFiesta implements FabricaCarro{
	
	@Override
	public Bateria criarBateria() {
		return new BateriaACDelco();
	}

	@Override
	public Direcao criarDirecao() {
		return new DirecaoFiesta();
	}
	
	@Override
	public Motor criarMotor() {
		return new MotorFiesta();
	}

	@Override
	public Suspensao criarSuspensao() {
		return new SuspensaoFiesta();
	}

}
