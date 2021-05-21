/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.unit;

import dao.EloBoardDAO;
import java.util.ArrayList;
import model.EloBoard;
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
public class EloBoardDAOTest {
    
    public EloBoardDAOTest() {
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
     * Test of getEloBoard method, of class EloBoardDAO.
     */
    @Test
    public void testGetEloBoard() {
        System.out.println("getEloBoard");
        EloBoardDAO instance = new EloBoardDAO();
        ArrayList<EloBoard> expResult = null;
        ArrayList<EloBoard> result = instance.getEloBoard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
