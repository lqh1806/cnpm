/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.unit;

import dao.PlayedMatchDAO;
import java.util.ArrayList;
import model.PlayedMatch;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class PlayedMatchDAOTest {
    
    public PlayedMatchDAOTest() {
    }
    /**
     * Test of playerHistory method, of class PlayedMatchDAO.
     */
    @Test
    public void testPlayerHistory() {
        PlayedMatchDAO pm = new PlayedMatchDAO();
        ArrayList<PlayedMatch> arr = pm.playerHistory(6);
        Assert.assertEquals(0, arr.size());
        
    }
    
}
