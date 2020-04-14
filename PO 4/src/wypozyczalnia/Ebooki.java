/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

public class Ebooki extends Wspolny {
    public String rozszerzenie;
    private Autor aut;
    
    public Ebooki(int nId, String wyd, double wyceniana, String rozszerz, Autor aut){
        super(nId, wyd, wyceniana);
        this.aut=aut;
        rozszerzenie=rozszerz;
}
    public Autor podajAutora(){
        return aut;
    }
}
