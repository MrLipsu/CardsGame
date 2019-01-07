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
import cardsgame.Deck;
import cardsgame.Card;
import java.util.ArrayList;

/**
 *
 * @author ysago
 */
public class DeckTest {
    
    private Card cardTest;
    private Deck deckTest;
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        cardTest = new Card("Heart", "7");
        deckTest = new Deck();
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Test Methode toString
     */
    @Test
    public void deckTestToString()
    {
        deckTest.addCard(cardTest);
        assertEquals("Le deck contient la carte : [7 of Heart]", deckTest.toString());
    }
    @Test
    public void deckTestgetTotalCards()
    {
        
        deckTest.addCard(cardTest);
        assertEquals(1, deckTest.getTotalCards());
    }
    
    @Test
    public void deckTestAddCard()
    {
        assertEquals(0, deckTest.getTotalCards());
        deckTest.addCard(cardTest);
        assertEquals(1, deckTest.getTotalCards());
    }
    
    @Test
    public void deckTestGetCards()
    {
        Deck expectedResult = new Deck();
        expectedResult.addCard(cardTest);
        deckTest.addCard(cardTest);
        assertEquals(expectedResult.getCards(), deckTest.getCards());
    }
    
    
    
}
