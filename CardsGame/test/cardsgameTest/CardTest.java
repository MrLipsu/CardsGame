/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardsgameTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import cardsgame.Card;
/**
 *
 * @author ysago
 */
public class CardTest {
    
    
    
    @AfterClass
    public static void tearDownClass() {
    }
    

    /**
     * Test of getColor method, of class Card.
     */
    @Test
    public void testGetColor() {
        
        
        String expResult = "Heart";
        String result = cardTest.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setColor method, of class Card.
     */
    @Test
    public void testSetColor() {
        String color = "Diamond";
        Card instance = cardTest;
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(color, cardTest.getColor());
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        Card instance = cardTest;
        String expResult = "7";
        String result = instance.getRank();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRank method, of class Card.
     */
    @Test
    public void testSetRank() {
        String rank = "8";
        Card instance = cardTest;
        instance.setRank(rank);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(rank, cardTest.getRank());
    }
    
    /**
     * Test of constructor of class Card.
     */
    @Test
    public void testCard() {
        Card expectedResult = new Card("Heart","7");
        String rank = "7";
        String color = "Heart";
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(rank, expectedResult.getRank());
        assertEquals(color, expectedResult.getColor());
    }
    
    
    private Card cardTest;

    /**
     * Constructeur de la classe-test CardTest
     */
    public CardTest()
    {
    }

    /**
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        cardTest = new Card("Heart","7");
    }
    
    /**
     * Test du toString
     *
     * @return     void
     */
    @Test
    public void testCardToString()
    {   
        assertEquals(cardTest.toString(), "7 of Heart");
    }

    /**
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }
    
}
