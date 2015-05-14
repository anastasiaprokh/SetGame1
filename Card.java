
public class Card implements Comparable<Card>
{
  private int id;
  
  public Card(int id)
  {
    this.id = id;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public boolean equals(Object other)
  {
    Card temp = (Card) other;
    return this.id == temp.id;
  }
  
  public int compareTo(Card other)
  {
    return this.id - other.id;
  }
  
  public String toString()
  {
    return id + "";
  }

}
