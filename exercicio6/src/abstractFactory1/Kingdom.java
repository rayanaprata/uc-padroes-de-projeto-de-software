package abstractFactory1;

public class Kingdom {
	private Army army;
	private Castle castle;
	private King king;

	public Kingdom(KingdomFactory factory) {
		this.army = factory.createArmy();
		this.castle = factory.createCastle();
		this.king = factory.createKing();
	}

	public void getDescription() {
		System.out.println(king.getDescription());
		System.out.println(castle.getDescription());
		System.out.println(army.getDescription());
		System.out.println();
	}

}
