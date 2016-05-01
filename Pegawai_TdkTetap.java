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
public class Pegawai_TdkTetap extends Employee {

    private int gjlmbr, jamlmbr;

    public Pegawai_TdkTetap(int id, String nama, String jabatan, String istri, int anak, int thawal) {
        super(id, nama, jabatan, istri, anak, thawal);
        this.gjlmbr = gjlmbr;
    }

    public void Lembur(int jamlmbr) {
        this.jamlmbr = jamlmbr;
        if (jamlmbr <= 10) {
            gjlmbr = 0;
        } else {
            gjlmbr = jamlmbr * 10000;
        }
    }

    public int getLembur() {
        return gjlmbr;
    }
}
