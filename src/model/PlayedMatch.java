/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class PlayedMatch implements Serializable{
    private int IDPlayedMatch;
    private String ketQua;
    private int mucTangGiamElo;
    private String tenDoiThu;
    private Player player;
    
    public PlayedMatch(){
        super();
        player = new Player();
    }

    public int getIDPlayedMatch() {
        return IDPlayedMatch;
    }

    public void setIDPlayedMatch(int IDPlayedMatch) {
        this.IDPlayedMatch = IDPlayedMatch;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public int getMucTangGiamElo() {
        return mucTangGiamElo;
    }

    public void setMucTangGiamElo(int mucTangGiamElo) {
        this.mucTangGiamElo = mucTangGiamElo;
    }

    public String getTenDoiThu() {
        return tenDoiThu;
    }

    public void setTenDoiThu(String tenDoiThu) {
        this.tenDoiThu = tenDoiThu;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Object[] toObject(){
        return new Object[]{
            IDPlayedMatch, getPlayer().getIDPlayer(), tenDoiThu, mucTangGiamElo
        };
    }
}
