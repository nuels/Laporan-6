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
import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        int x;
        do {
            System.out.print("Masukkan id : ");
            int id = in.nextInt();
            System.out.print("Masukkan nama : ");
            String nm = i.nextLine();
            System.out.print("Apakah sudah mempunyai istri (ya / tidak) ? ");
            String istri = i.nextLine();
            System.out.print("Masukkan jumlah anak yang dimiliki : ");
            int an = in.nextInt();
            System.out.print("Masukkan tahun awal bekerja : ");
            int thaw = in.nextInt();
            System.out.print("Masukkan jabatan (manager / pns / nonpns) : ");
            String jbtn = i.nextLine();
            Pegawai_Tetap pns = new Pegawai_Tetap(id, nm, jbtn, istri, an, thaw);
            Pegawai_TdkTetap nonpns = new Pegawai_TdkTetap(id, nm, jbtn, istri,
                    an, thaw);
            Manager manager = new Manager(id, nm, jbtn, istri, an, thaw);
            if (jbtn.equalsIgnoreCase("nonpns")) {
                x = 1;
            } else if (jbtn.equalsIgnoreCase("pns")) {
                x = 2;
            } else if (jbtn.equalsIgnoreCase("manager")) {
                x = 3;
            } else {
                x = 0;
            }
            switch (x) {
                case 1:
                    System.out.print("Masukkan jam lembur : ");
                    nonpns.Lembur(in.nextInt());
                    System.out.println("\n ID : " + nonpns.getId() + "\n Nama : "
                            + nonpns.getNama() + "\n Jabatan : " + nonpns.getJabatan()
                            + "\n Mempunyai istri : " + nonpns.getIstri() + "\n Jumlah anak : "
                            + nonpns.getAnak() + "\n Lama bekerja : " + (nonpns.getLamakerja())
                            + " tahun" + "\n Gaji akhir : " + (nonpns.gjawal * nonpns.getLamakerja()
                            + nonpns.getLembur()) + "\n");
                    break;
                case 2:
                    System.out.println("\n ID : " + pns.getId()
                            + "\n Nama : " + pns.getNama() + "\n Jabatan : " + pns.getJabatan()
                            + "\n Mempunyai istri : " + pns.getIstri() + "\n Jumlah anak : "
                            + pns.getAnak() + "\n Lama bekerja : " + (pns.getLamakerja()) + " tahun"
                            + "\n Gaji akhir : " + (pns.gjawal * pns.getLamakerja() + pns.getTunjangan()
                            + pns.getBonus() + pns.getTunjanganIstri()
                            + pns.getTunjanganAnak()) + "\n");
                    break;
                case 3:
                    System.out.println("\n ID : " + manager.getId()
                            + "\n Nama : " + manager.getNama() + "\n Jabatan : " + manager.getJabatan()
                            + "\n Mempunyai istri : " + manager.getIstri() + "\n Jumlah anak : "
                            + manager.getAnak() + "\n Lama bekerja : " + (manager.getLamakerja())
                            + " tahun" + "\n Gaji akhir : " + ((manager.gjawal * manager.getLamakerja())
                            + manager.getTunjangan() + manager.getBonus() + manager.getTunjanganIstri()
                            + manager.getTunjanganAnak() + manager.getTunjanganJabatan() + "\n"));
                    break;
            }
        } while (x > 0 && x < 4);
    }
}
