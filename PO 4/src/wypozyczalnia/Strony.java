
package wypozyczalnia;


public class Strony {
    private int iloscStron;
    private String papier;
    public Strony(int iloscStron, String papier){
        this.iloscStron=iloscStron;
        this.papier=papier;
    }
    public int podajStrony(){
        return iloscStron;
    }
    public String podajPapier(){
        return papier;
    }
    
}
