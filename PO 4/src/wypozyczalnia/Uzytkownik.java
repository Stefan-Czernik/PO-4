/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;
import java.util.Date;

public class Uzytkownik {
    private String nazwisko;
    private String imie;
    private String miejsceZamieszkania; 
    private int wiek;
   // private Date dataZapisu;
    boolean blokada=false ; 
    boolean wszystkoOplacone;
    
    public Uzytkownik(String naz,String im, String miejsce, int wi, boolean oplaty){
        this.nazwisko=naz;
        this.imie=im;
        this.miejsceZamieszkania=miejsce;
        this.wiek=wi;
       // dataZapisu=data;
        this.wszystkoOplacone=oplaty;
    }
    
    public boolean czyZablokowac() {
    if (wszystkoOplacone == false){
        blokada = true;
        return true;
            }
    else {
        return false;
    }
}
    
}
