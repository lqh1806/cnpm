/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.EloBoard;
import java.sql.*;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class EloBoardDAO extends DAO{
    public EloBoardDAO(){
        super();
    }
    
    public ArrayList<EloBoard> getEloBoard(){
        String tmpSql = "SELECT idPlayer,  SUM(mucTangGiamElo) as hsEloTangGiam FROM tblplayedmatch GROUP BY idPlayer";
        int[][] a = new int[100][100];
        int cnt = 0;
        int tmp = 0;
        ArrayList<EloBoard> arr = new ArrayList<EloBoard>();
        try{
            PreparedStatement ps = con.prepareStatement(tmpSql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                a[cnt][0] = rs.getInt("idPlayer");
                a[cnt][1] = rs.getInt("hsEloTangGiam");
                cnt++;
            }     
        }catch(Exception e){
            e.printStackTrace();
        }
        String sql = "UPDATE tbleloboard SET heSoEloMoi = heSoEloCu + ? WHERE idPlayer = ?";
        while(cnt > 0){
            try {
                PreparedStatement ps1 = con.prepareStatement(sql);
                ps1.setInt(1, a[tmp][1]);
                ps1.setInt(2, a[tmp][0]);
                ps1.executeUpdate();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            tmp++;
            cnt--;
        }
        String sql2 = "SELECT id, ten, namSinh, quocTich, heSoEloCu, heSoEloMoi, (heSoEloMoi -heSoEloCu) as hsEloTangGiam FROM tblplayer, tbleloboard WHERE tblplayer.id = tbleloboard.idPlayer;";
        try {
            PreparedStatement ps = con.prepareStatement(sql2);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                EloBoard eb = new EloBoard();
                eb.setIDPlayer(rs.getInt("id"));
                eb.setTen(rs.getString("ten"));
                eb.setNamSinh(rs.getInt("namSinh"));
                eb.setQuocTich(rs.getString("quocTich"));
                eb.setHeSoEloCu(rs.getInt("heSoEloCu"));
                eb.setHeSoEloMoi(rs.getInt("heSoEloMoi"));
                eb.setHeSoEloTangGiam(rs.getInt("hsEloTangGiam"));
                arr.add(eb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(arr, new Comparator<EloBoard>(){
 
            @Override
            public int compare(EloBoard o1, EloBoard o2) {
                if(o1.getHeSoEloTangGiam() == o2.getHeSoEloTangGiam()){
                    return o2.getHeSoEloMoi() - o1.getHeSoEloMoi();
                }
                return o2.getHeSoEloTangGiam() - o1.getHeSoEloTangGiam();
            }
         });
     return arr;           
}
}
