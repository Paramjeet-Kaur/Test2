import java.util.Scanner;
public class Triangle extends Shape implements TwoDimensionalShapeInterface{
	private Double base;
	private Double height;
	public Triangle(String Color,Double base,Double height) {
		super(Color);
		this.base=base;
		this.height=height;
		// TODO Auto-generated constructor stub
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return 0;
		
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}
	public Double calculateAreaOfTriangle(Double base,Double height)
	{
		Double TriangleArea=0.5*this.base*this.height;
		return TriangleArea;
	}
}
