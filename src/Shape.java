import java.util.ArrayList;

public class Shape {
 private String Color;
 private ArrayList<Shape> s=new ArrayList<Shape>();
 public Shape(String Color,ArrayList<Shape> s)
 {
	 this.Color=Color;
	 this.s=s;
 }
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}

}
