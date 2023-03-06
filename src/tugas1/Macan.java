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
public class Macan extends hewanDarat{

    @Override
    public String jenisMakanan() {
        String makanan="Macan merupakan hewan karnivora";
        return makanan;
    }

    @Override
    public String jenisPernafasan() {
       String nafas="Macan bernafas menggunakan paru-paru";
       return nafas;
    }

    @Override
    public String bergerak() {
       String nafas="Macan bergerak menggunakan kaki";
       return nafas;
    }
    
}
