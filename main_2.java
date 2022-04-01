import java.util.ArrayList;

public class main_2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ArrayList<Square> SquareList = new ArrayList<>();
    
    Square s1 = new Square();
    SquareList.add(s1);
    Square s2 = new Square();
    SquareList.add(s2);
    Square s3 = new Square();
    SquareList.add(s3);
    Square s4 = new Square();
    SquareList.add(s4);
    Square s5 = new Square();
    SquareList.add(s5);
    
    for (int i = 0; i < SquareList.size(); i++) {
      System.out.println(SquareList.get(i).getArea());
      SquareList.get(i).howToColor();
    }
  }
}