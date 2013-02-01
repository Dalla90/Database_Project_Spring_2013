
public class Ingredienser {
    private String navn;
    private int antall;
    
    public Ingredienser(String navn,int antall){
        this.navn = navn;
        this.antall = antall;
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
        return "ingrediensnavn: "+navn+"\n"+"antall: "+antall;
    }
}
