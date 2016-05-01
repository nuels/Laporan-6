/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employe;

/**
 *
 * @author imgeek
 */
public class Manager extends Employee {

    private int bns, tjgn, tjgnjbtn, tjgnistri, tjgnanak;

    public Manager(int id, String nama, String jabatan, String istri, int anak, int thawal) {
        super(id, nama, jabatan, istri, anak, thawal);
    }

    public int getTunjangan() {
        if (lmkerja > 10) {
            tjgn = gjawal * lmkerja * 10 / 100;
        } else {
            tjgn = 0;
        }
        return tjgn;
    }

    public int getBonus() {
        if (lmkerja <= 5) {
            bns = 0;
        } else if (lmkerja >= 6 && lmkerja <= 10) {
            bns = lmkerja * gjawal * 5 / 100;
        } else if (lmkerja > 10) {
            bns = lmkerja * gjawal * 10 / 100;
        }
        return bns;
    }

    public int getTunjanganJabatan() {
        return tjgnjbtn = (gjawal * lmkerja + tjgn) * 10 / 100;
    }

    public int getTunjanganIstri() {
        if (wife = true) {
            tjgnistri = ((lmkerja * gjawal + tjgn) * 10 / 100);
        } else {
            tjgnistri = 0;
        }
        return tjgnistri;
    }

    public int getTunjanganAnak() {
        if (anak >= 1 && anak <= 3) {
            tjgnanak = (anak * gjawal + tjgn) * 15 / 100;
        } else if (anak > 3) {
            tjgnanak = (gjawal + tjgn) * 45 / 100;
        }
        return tjgnanak;
    }
}
