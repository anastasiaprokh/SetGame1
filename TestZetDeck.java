
public class TestZetDeck
{
  public static void main(String[]args)
  {
    ZetDeck test = new ZetDeck();
    for(int i = 0; i<3; i++)
    {
      System.out.println(test.takeTop());
    }
  }
 
}
