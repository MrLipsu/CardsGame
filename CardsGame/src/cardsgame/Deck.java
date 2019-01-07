package cardsgame;

import java.util.ArrayList;

/**
 * Décrivez votre classe Deck ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Deck
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre  
    private ArrayList<Card> cards;

    /**
     * Constructeur d'objets de classe Deck
     */
    public Deck()
    {
        // initialisation des variables d'instance
        this.cards = new ArrayList<Card>();
    }
    
    /**
     * Méthode toString : Elle retourne le contenue du deck
     *
     * @return   string
     */
    @Override
    public String toString()
    {
        // Insérez votre code ici
        return "Le deck contient la carte : " + this.cards.toString();
    }
    
    public int getTotalCards()
    {
        return cards.size();
        //we could use this method when making 
        //a complete poker game to see if we needed a new deck
    }

    public void addCard(Card card1) {
        this.cards.add(card1);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

}
