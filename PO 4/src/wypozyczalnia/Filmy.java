/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

public class Filmy extends Wspolny {
    public int minutyTrwania;
    private Autor autor;
    public Filmy(int nId, String wyd, double wyceniana, int minuty, Autor autor){
        super(nId, wyd,  wyceniana);
        minutyTrwania=minuty;
        this.autor=autor;
    }
    public Autor podajAutora(){
        return autor;
    }
}
