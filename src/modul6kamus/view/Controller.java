/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6kamus.view;
import java.util.*;
/**
 *
 * @author khoirul-06990
 */
public class Controller {
    static  ArrayList<Data> data = new ArrayList<Data>();
    
    public static void Data()
    {
        data.add(new Data("buku","book"));
        data.add(new Data("kamu","you"));
        data.add(new Data("mobil","car"));
        data.add(new Data("sekarang", "now"));
    }
    
    public static String CekIndo(String indo)
    {
        int i = 0;
        String hasil = null;
        while(!data.get(i).getIndo().equals(indo))
        {
            i++;
        }
        if(data.get(i).getIndo().equals(indo))
        {
            hasil = data.get(i).getIng();
        }
        return hasil;
    }
    
    public static String CekIng(String ing)
    {
        String hasil = null;
        for(int i = 0; i<data.size(); i++)
        {
            if (data.get(i).getIng().equals(ing))
            {
                hasil = data.get(i).getIndo();
                break;
            }
        }return hasil;
    }
}
