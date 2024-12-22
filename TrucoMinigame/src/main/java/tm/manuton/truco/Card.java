package tm.manuton.truco;

public class Card {
    private int Value;
    private int Number;
    private int EnvidoValue;
    private String Suit;

    public Card(int CardValue, int EnvidoValue, int CardNumber, String CardSuit){
        this.Value = CardValue;
        this.Number = CardNumber;
        this.Suit = CardSuit;
        this.EnvidoValue = EnvidoValue;
    }
    public int getValue(){
        return Value;
    }

    public void setValue(int value){
        Value = value;
    }

    public int getNumber(){
        return Number;
    }

    public String getSuit(){
        return Suit;
    }

    public int getEnvidoValue(){
        return EnvidoValue;
    }

    public void setEnvidoValue(int value){
        EnvidoValue = value;
    }

    public String toString(){
        return Number + " of " + Suit;
    }

    public boolean equals(Card card){
        return card.getNumber() == Number && card.getSuit().equals(Suit);
    }

}
