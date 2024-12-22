package tm.manuton.truco;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class TrucoPlayer {
    private Player player;
    private int points;
    private List<Card> hand = new ArrayList<Card>();

    private List<Card> used = new ArrayList<Card>();

    private int envidoPoints;

    public TrucoPlayer(Player player){
        this.player = player;
        this.points = 0;
        this.envidoPoints = 0;
    }

    public void addPoint(){
        points++;
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public void removeCard(Card card){
        hand.remove(card);
    }

    public void resetCards(){
        hand.clear();
        used.clear();
    }




}
