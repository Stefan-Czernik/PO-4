/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

public class PlytyMuzyczne extends Wspolny {
    public String nosnik;
    private Autor aut;
    public PlytyMuzyczne(int nId, String wyd, double wyceniana, String nos,Autor aut){
        super(nId, wyd,  wyceniana);
        this.aut=aut;
        nosnik=nos;
    }
    public Autor podajAutora(){
        return aut;
    }
}
