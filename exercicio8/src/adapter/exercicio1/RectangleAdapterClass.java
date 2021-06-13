package adapter.exercicio1;

public class RectangleAdapterClass extends Rectangle implements Shape {

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		drawRectangle(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
	}

}
