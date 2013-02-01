/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Test {
    private String navn;
    
    public Test(String navn){
        this.navn = navn;
    }
    
    public String getNavn(){
        return navn;
    }
    
    @Override
    public String toString(){
        return "Navn: " + navn;
    }
}
