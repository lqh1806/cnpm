/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.unit;

import dao.EloBoardDAO;
import java.util.ArrayList;
import model.EloBoard;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Administrator
 */
public class EloBoardDAOTest {
    @Test
    public void testGetEloBoard1(){
        EloBoardDAO eb = new EloBoardDAO();
        ArrayList<EloBoard> arr = eb.getEloBoard();
        Assert.assertNotNull(arr);
        Assert.assertEquals(5, arr.size());
    }
    
    @Test
    public void testGetEloBoard2(){
        EloBoardDAO eb = new EloBoardDAO();
        ArrayList<EloBoard> arr = eb.getEloBoard();
        Assert.assertNotNull(arr);
        Assert.assertEquals(5, arr.size());
        Assert.assertEquals(10, arr.get(0).getHeSoEloTangGiam());
        Assert.assertEquals(10, arr.get(1).getHeSoEloTangGiam());
        Assert.assertTrue(arr.get(2).getHeSoEloTangGiam() < 0);
    }
    
    @Test
    public void testGetEloBoard3(){
        EloBoardDAO eb = new EloBoardDAO();
        ArrayList<EloBoard> arr = eb.getEloBoard();
        Assert.assertNotNull(arr);
        Assert.assertTrue(arr.get(2).getHeSoEloTangGiam() < 0);
        Assert.assertTrue(arr.get(3).getHeSoEloTangGiam() < 0);
        Assert.assertTrue(arr.get(4).getHeSoEloTangGiam() < 0);
        
    }
}
