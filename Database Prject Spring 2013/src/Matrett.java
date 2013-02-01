
import java.util.ArrayList;


// matrett er en rett som inneholder flere matvarer

public class Matrett {
    private String navn;
    private int antall;
    private ArrayList<Matvare> matv = new ArrayList<Matvare>();
    
    public Matrett(String navn,int antall,ArrayList innhold){
        this.navn = navn;
        this.antall = antall;
       
    }

    public String getNavn() {
        return navn;
    }

    public int getAntall() {
        return antall;
    }

    public ArrayList<Matvare> getMatv() {
        return matv;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }
         
}
