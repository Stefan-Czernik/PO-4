/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

public class Audiobooki extends Wspolny {
    public String format;
    private Autor aut;
    public Audiobooki(int nId, String wyd, double wyceniana, String form,Autor aut){
        super(nId, wyd,  wyceniana);
        format=form;
        this.aut=aut;
    }
    public Autor zwrocAutora(){
        return aut;
    }
}
