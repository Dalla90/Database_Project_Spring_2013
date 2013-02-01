// en matvare inneholder flere ingredienser
import java.util.ArrayList;


public class Matvare {

    private String navn;
    private int antall;
    private ArrayList<Ingredienser> ingr = new ArrayList<Ingredienser>();
    
    public Matvare(String navn,int antall){
        this.antall = antall;
        this.navn = navn;
      
    }

    public String getNavn() {
        return navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }
    public String toString(){
        return "navn: "+navn+" \n"+"antall: "+antall;
    }
    
}
