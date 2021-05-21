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
public class Player implements Serializable{
    private int IDPlayer;
    private String ten;
    private int namSinh;
    private String quocTich;
    private int rankNumber;
    
    public Player(){
        super();
    }

    public int getIDPlayer() {
        return IDPlayer;
    }

    public void setIDPlayer(int IDPlayer) {
        this.IDPlayer = IDPlayer;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public int getRankNumber() {
        return rankNumber;
    }

    public void setRankNumber(int rankNumber) {
        this.rankNumber = rankNumber;
    }
    
    
}
