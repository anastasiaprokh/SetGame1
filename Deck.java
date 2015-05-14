
import java.util.*;

public class Deck 
{
  private ArrayList<Card> deck;
  
  public Deck()
  {
    deck = new ArrayList<Card>();
  }
  
  public Deck(int capacity)
  {
    deck = new ArrayList<Card>(capacity);
  }
  
  public void add(Card card)
  {
    deck.add(card);
  }
  
  public int getNumCards()
  {
    return deck.size();
  }
  
  public boolean isEmpty()
  {
    return deck.size()==0;
  }
  
  public void shuffle()
  {
    Collections.shuffle(deck);
  }
  
  public void sort()
  {
    Collections.sort(deck);
  }
  
  public void bogosort() // Bonus method
  {
    boolean isSorted = true;
    for (int n = 1; n < deck.size(); n++)
      if (deck.get(n).compareTo(deck.get(n-1)) < 0)
        isSorted = false;
    
    while (!isSorted)
    {
      shuffle();
      
      isSorted = true;
      for (int n = 1; n < deck.size(); n++)
        if (deck.get(n).compareTo(deck.get(n-1)) < 0)
          isSorted = false;
    }
  }
  
  public Card takeTop()
  {
    return deck.remove(deck.size()-1);
  }
  
  public String toString()
  {
    String cards = "";
    for (Card card : deck)
      cards += card.toString() + "\n";
    
    return cards;
  }
}
