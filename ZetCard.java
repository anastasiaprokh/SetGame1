
public class ZetCard extends Card
{
  private int number;
  private int shape;
  private int fill;
  private int color;
  
  public ZetCard(int number, int shape, int fill, int color)
  {
    super(idMaker(number, shape, fill, color));

    this.number = number;
    this.shape = shape;
    this.fill = fill;
    this.color = color;
  }
  
  private static int idMaker(int number, int shape, int fill, int color)
  {
    double a = 20/3;
    return (int)(number*a + shape*a + fill*a + color*a);
  }
  
  public int getNumber()
  {
    return number;
  }
  
  public int getShape()
  {
    return shape;
  }
  
  public int getFill()
  {
    return fill;
  }
  
  public int getColor()
  {
    return color;
  }
  
  public String toString()
  {
    return "number is " + number + ", shape is " + shape + ", fill is " + fill + ", color is " + color;
  }
  

}
