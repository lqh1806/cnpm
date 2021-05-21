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
public class EloBoard extends Player implements Serializable{
    private int heSoEloCu;
    private int heSoEloMoi;
    private int heSoEloTangGiam;
    private User user;

    public int getHeSoEloCu() {
        return heSoEloCu;
    }

    public void setHeSoEloCu(int heSoEloCu) {
        this.heSoEloCu = heSoEloCu;
    }

    public int getHeSoEloMoi() {
        return heSoEloMoi;
    }

    public void setHeSoEloMoi(int heSoEloMoi) {
        this.heSoEloMoi = heSoEloMoi;
    }

    public int getHeSoEloTangGiam() {
        return heSoEloTangGiam;
    }

    public void setHeSoEloTangGiam(int heSoEloTangGiam) {
        this.heSoEloTangGiam = heSoEloTangGiam;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public Object[] toObject(){
        return new Object[]{ this.getIDPlayer(), this.getTen(), this.getNamSinh(),
        this.getQuocTich(), heSoEloCu, heSoEloMoi, heSoEloTangGiam};
    }
}
