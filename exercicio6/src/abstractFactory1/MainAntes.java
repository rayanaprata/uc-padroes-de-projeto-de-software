package abstractFactory1;

public class MainAntes {
	public static void main(String[] args) {

		ElfKing king1 = new ElfKing();
		ElfCastle castle1 = new ElfCastle();
		ElfArmy army1 = new ElfArmy();
		System.out.println(king1.getDescription());
		System.out.println(castle1.getDescription());
		System.out.println(army1.getDescription());

		OrcKing king = new OrcKing();
		OrcCastle castle = new OrcCastle();
		OrcArmy army = new OrcArmy();
		System.out.println(king.getDescription());
		System.out.println(castle.getDescription());
		System.out.println(army.getDescription());

	}
}
