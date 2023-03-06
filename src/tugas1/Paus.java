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
public class Paus implements hewanLaut{

    @Override
public String jenisMakanan() {
    String makanan="Paus merupakan hewan omnivora";
    return makanan;
    }
    @Override
    public String jenisPernafasan() {
    String nafas="Paus bernafas menggunakan paru-paru";
    return nafas;
    }

    @Override
    public String bergerak() {
    String nafas="Paus bergerak menggunakan sirip";
    return nafas;
    }
}
