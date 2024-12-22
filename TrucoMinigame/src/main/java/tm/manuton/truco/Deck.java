package tm.manuton.truco;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<Card>();

    public Deck(){
        for (int i = 1; i <= 12; i++){
            if (i == 8 || i == 9)
                continue;
            deck.add(new Card(1, i, "Gold"));
            deck.add(new Card(1, i, "Cups"));
            deck.add(new Card(1, i, "Swords"));
            deck.add(new Card(1, i, "Clubs"));
            setValues(deck);
        }
    }

    private void setValues(List<Card> d){
        for (Card card : d){
            switch (card.getNumber()){
                case 1: {
                    if (card.getSuit().equals("Gold"))
                        card.setValue(8);
                    else if (card.getSuit().equals("Cups"))
                        card.setValue(8);
                    else if (card.getSuit().equals("Swords"))
                        card.setValue(13);
                    else if (card.getSuit().equals("Clubs"))
                        card.setValue(14);
                    break;
                }
                case 2:
                    card.setValue(9);
                    break;
                case 3:
                    card.setValue(10);
                    break;
                case 4:
                    card.setValue(1);
                    break;
                case 5:
                    card.setValue(2);
                    break;
                case 6:
                    card.setValue(3);
                    break;
                case 7:{
                    if (card.getSuit().equals("Gold"))
                        card.setValue(11);
                    else if (card.getSuit().equals("Cups"))
                        card.setValue(4);
                    else if (card.getSuit().equals("Swords"))
                        card.setValue(12);
                    else if (card.getSuit().equals("Clubs"))
                        card.setValue(4);
                    break;
                }
                case 10:
                    card.setValue(5);
                    break;
                case 11:
                    card.setValue(6);
                    break;
                case 12:
                    card.setValue(7);
                    break;
            }
        }
    }

    public void Shuffle(){
        for (int i = 0; i < deck.size(); i++){
            int random = (int) (Math.random() * deck.size());
            Card temp = deck.get(i);
            deck.set(i, deck.get(random));
            deck.set(random, temp);
        }
    }

    public Card getCard(){
        return deck.remove(0);
    }

    public List<Card> getDeck(){
        return deck;
    }

    public void Reset(){
        deck.clear();
        for (int i = 1; i <= 12; i++){
            if (i == 8 || i == 9)
                continue;
            deck.add(new Card(1, i, "Gold"));
            deck.add(new Card(1, i, "Cups"));
            deck.add(new Card(1, i, "Swords"));
            deck.add(new Card(1, i, "Clubs"));
            setValues(deck);
        }
    }




}
