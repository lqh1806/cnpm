/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.User;
import java.sql.*;

/**
 *
 * @author Administrator
 */
public class UserDAO extends DAO{
    public UserDAO(){
        super();
    }
    
    public boolean checkLogin(User user){
        boolean res = false;
        String sql = "SELECT positionName, id, ten FROM tbluser where userName = ? AND password = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                user.setIDUser(rs.getInt("id"));
                user.setTen(rs.getString("ten"));
                user.setPositionName(rs.getString("positionName"));
                res = true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }
}
