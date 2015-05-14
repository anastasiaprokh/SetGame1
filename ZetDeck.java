import java.util.*;

public class ZetDeck extends Deck
{
  public ZetDeck()
  {
    super(81);
    for (int n = 1; n<=3; n++)
      for (int s = 1; s<=3; s++)
        for (int f = 1; f<=3; f++)
          for(int c = 1; c<=3; c++)
            super.add(new ZetCard(n,s,f,c));
  }
  
}
