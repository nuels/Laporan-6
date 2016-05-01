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
public class Employee {

    protected String nama, jabatan, istri;
    protected boolean wife;
    protected int id, anak, thawal, lmkerja;
    protected final int th = 2016;
    protected final int gjawal = 2500000;

    public Employee(int id, String nama, String jabatan, String istri, int anak, int thawal) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.istri = istri;
        this.anak = anak;
        this.thawal = thawal;
        lmkerja = th - thawal;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public boolean getWife() {
        if (istri.equalsIgnoreCase("ya")) {
            wife = true;
        } else {
            wife = false;
        }
        return wife;
    }

    public String getIstri() {
        return istri;
    }

    public int getId() {
        return id;
    }

    public int getAnak() {
        return anak;
    }

    public int getLamakerja() {
        return lmkerja;
    }
}
