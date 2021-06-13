package adapter.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class MainDepois {
	public static void main(String[] args) {

		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new LineAdapterClass());
		shapes.add(new RectangleAdapterClass());

		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;

		for (Shape shape : shapes) {
			shape.draw(x1, y1, x2, y2);
		}
	}
}
