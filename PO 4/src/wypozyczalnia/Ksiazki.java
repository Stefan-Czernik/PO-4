/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

public class Ksiazki extends Wspolny {
    public Strony strona;
    private Autor auto;
    public Ksiazki(int nId, String wyd, double wyceniana, Strony strona,Autor auto){
        super(nId, wyd,  wyceniana);
        this.strona=strona;
        this.auto=auto;
    }
    public Autor podajAutora(){
        return auto;
    }
    public Strony podajInfo(){
        return strona;
    }
    
    
}
