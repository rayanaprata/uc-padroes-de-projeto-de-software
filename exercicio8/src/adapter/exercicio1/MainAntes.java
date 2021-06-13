package adapter.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class MainAntes {
	public static void main(String[] args) {

		List<Object> shapes = new ArrayList<Object>();
		shapes.add(new Line());
		shapes.add(new Rectangle());

		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;
		
		for (Object shape : shapes) {

			if (shape.getClass().getSimpleName().equals("Line")) {
				((Line) shape).drawLine(x1, y1, x2, y2);

			} else if (shape.getClass().getSimpleName().equals("Rectangle")) {
				((Rectangle)shape).drawRectangle(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
			}
		}

	}
}
