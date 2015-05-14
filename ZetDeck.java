import java. util.*;

public class ZetDeck extends Deck
{
  private ArrayList <ZetCard> ZetDeck;
  public ZetDeck()
  {
    super(81);
    for (int n = 1; n<4; n++)
    {
      for (int s = 1; s<4; s++)
      {
        for (int c = 1; c<4; c++)
        {
          for(int f = 1; f<4; f++)
          {
            ZetDeck.add(new ZetCard(n,s,c,f));
          }
        }
      }
    }
  }

}
