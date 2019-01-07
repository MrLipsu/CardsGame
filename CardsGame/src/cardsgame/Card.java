package cardsgame;
/**
 *
 * @author Sagodira Yoan & Sagodira Sébastien
 * @version V1.0
 */
public class Card
{
    // variables d'instance
    private String color;
    private String rank;
    
    /**
     * Getter Color -
     * @return String
     */
    public String getColor()
    {
        return this.color;
    }
    
    /**
     * Setter Color
     * @param color : String
     */
    public void setColor(String color)
    {
        this.color = color;
    }
    
    /**
     * Getter Rank -
     * @return String
     */
    public String getRank()
    {
        return this.rank;
    }
    
     /**
     * Setter Rank
     * @param rank : String
     */
    public void setRank(String rank)
    {
        this.rank = rank;
    }
    
    /**
     * Constructeur d'objets de classe Card
     */
    public Card(String color, String rank)
    {
        // initialisation des variables d'instance
        this.color = color; 
        this.rank = rank;
    }
    
    /**
     * Méthode toString : Elle retourne le rang et la couleur de la carte
     *
     * @return   string
     */
    @Override
    public String toString()
    {
        // Insérez votre code ici
        return this.rank + " of " + this.color;
    }
}
