/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;


public class Autor {
    private String imie;
    private String nazwisko;
    public Autor (String imie, String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    public String podajImie(){
        return imie;
    }
    public String podajNazwisko(){
        return nazwisko; 
    }
    
}
