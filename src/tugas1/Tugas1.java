/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author LEGION
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        hewanDarat a= new Macan();
        System.out.println(a.jenisMakanan());
        System.out.println(a.jenisPernafasan());
        System.out.println(a.bergerak());
        hewanLaut b= new Paus();
        System.out.println(b.jenisMakanan());
        System.out.println(b.jenisPernafasan());
        System.out.println(b.bergerak());
        hewanUdara c= new manukKutilang();
        System.out.println(c.jenisMakanan());
        System.out.println(c.jenisPernafasan());
        System.out.println(c.bergerak());
        }catch(Exception error){
            System.out.println("Errornya adalah : " +error.getMessage());
        }finally{
            System.out.println("Selesai yagesya");
        }
    }
    
}
