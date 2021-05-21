/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.unit;

import dao.PlayedMatchDAO;
import java.util.ArrayList;
import model.PlayedMatch;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class PlayedMatchDAOTest {
    
    public PlayedMatchDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of playerHistory method, of class PlayedMatchDAO.
     */
    @Test
    public void testPlayerHistory() {
        System.out.println("playerHistory");
        int id = 0;
        PlayedMatchDAO instance = new PlayedMatchDAO();
        ArrayList<PlayedMatch> expResult = null;
        ArrayList<PlayedMatch> result = instance.playerHistory(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
