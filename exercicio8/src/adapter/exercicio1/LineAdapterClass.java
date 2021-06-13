package adapter.exercicio1;

public class LineAdapterClass extends Line implements Shape {

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		drawLine(x1, y1, x2, y2);
	}

}
