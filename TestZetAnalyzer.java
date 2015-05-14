
public class TestZetAnalyzer
{
  public static void main(String[] args)
  {
    ZetDeck deck = new ZetDeck(); 

    deck.get(0).toString(); 
    deck.get(4).toString(); 
    deck.get(7).toString(); 
    deck.get(25).toString(); 
    deck.get(78).toString(); 
    deck.get(45).toString(); 
    deck.get(32).toString(); 
    deck.get(29).toString(); 
    deck.get(56).toString(); 
    deck.get(41).toString(); 


    for (int i = 0; i < deck.size(); i++)
    {
      for(int j = 0; j<deck.size(); j++)
      {
        for(int k = 0; k < deck.size(); k++)
        {
          if (isZet(deck[i], deck[j], deck[k]))
            System.out.print(deck[i], deck[j], deck[k]);  
        }
      }

      System.out.println(findZet(deck)); 
    }
  }
}