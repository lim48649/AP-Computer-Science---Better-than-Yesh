package unit6;

public class Square extends Rectangle {

	public Square(int x, int y, int side) {
		super(x, y, x+side, y+side);
	}
}