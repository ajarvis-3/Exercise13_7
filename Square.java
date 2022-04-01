
public class Square extends GeometricObject implements Colorable {
  public double side;
  public Square() {
    
    side = 2.0;
    
  }
  
  public double getArea() {
    // TODO Auto-generated method stub
    return side * side;
  }
  
  public void setSide(double side) {
    
  this.side = side;
  }
  
  @Override
  public double getPerimeter() {
    // TODO Auto-generated method stub
    return side + side + side + side;
  }  
  public double getSide() {
    
    return side;
  }

  @Override
  public void howToColor() {
    // TODO Auto-generated method stub
    System.out.println("Color all four sides");
  }

}
