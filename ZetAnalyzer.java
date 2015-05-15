
public class ZetAnalyzer
{
  public static boolean isZet(ZetCard card1, ZetCard card2, ZetCard card3)
  {
    if (card1 == card2 || card1 == card3 || card2 == card3)
      return false;
  else
  {
    return ((card1.getColor() + card2.getColor() + card3.getColor() % 3 == 0) && 
        (card1.getShape() + card2.getShape() + card3.getShape() % 3 == 0) && 
        (card1.getFill() + card2.getFill() + card3.getFill() % 3 == 0) && 
        (card1.getNumber() + card2.getNumber() + card3.getNumber() % 3 == 0));  
  }
  }
  
  public static int[] findZet(ZetCard[] cards) 
  {
    int[] res = new int[3]; 
    
    for (int i = 0; i < cards.length; i++)
    {
      for(int j = 0; j<cards.length; j++)
      {
        for(int k = 0; k < cards.length; k++)
          
          if (isZet(cards[i], cards[j], cards[k]))
          {
            res[0] = cards[i]; 
            res[1] = cards[j]; 
            res[2] = cards[k]; 
          }   
      }
    }
    return res; 
  }

}
