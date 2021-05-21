/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.PlayedMatch;
import java.sql.*;

/**
 *
 * @author Administrator
 */
public class PlayedMatchDAO extends DAO{
    public PlayedMatchDAO(){
        super();
    }
    
    public ArrayList<PlayedMatch> playerHistory(int id){
        ArrayList<PlayedMatch> arr = new ArrayList<PlayedMatch>();
        String sql = "SELECT id, idPlayer, tenDoiThu, mucTangGiamElo FROM tblplayedmatch WHERE idPlayer = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                PlayedMatch pm = new PlayedMatch();
                pm.setIDPlayedMatch(rs.getInt("id"));
                pm.getPlayer().setIDPlayer(rs.getInt("idPlayer"));
                pm.setTenDoiThu(rs.getString("tenDoiThu"));
                pm.setMucTangGiamElo(rs.getInt("mucTangGiamElo"));
                arr.add(pm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
}
