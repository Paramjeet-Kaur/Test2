import java.util.ArrayList;

public class Square extends Shape implements TwoDimensionalShapeInterface {
private Double Side;

	public Square(String Color,Double Side,ArrayList<Shape> s) {
		super(Color,s);
		this.Side=Side;
		// TODO Auto-generated constructor stub
		
	}

	public Double getSide() {
		return Side;
	}

	public void setSide(Double side) {
		Side = side;
	}

	@Override
	public double calculateArea() {
		Double SquareArea=this.Side*this.Side;
		return SquareArea;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}
	

}
