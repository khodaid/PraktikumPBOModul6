/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6kamus.view;

/**
 *
 * @author khoirul-06990
 */
public class Data {
    private String indo;
    private String ing;
    
    public Data(String indo, String ing)
    {
        this.indo = indo;
        this.ing = ing;
    }
    
    public Data()
    {
        
    }

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    public String getIndo() {
        return indo;
    }

    public void setIndo(String indo) {
        this.indo = indo;
    }
    
}
