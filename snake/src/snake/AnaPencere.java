/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author akif
 */
public class AnaPencere extends JFrame {
    
    private int mGenislik = 600;
    private int mYukseklik = 600;
    
    private static AnaPencere mPencere = null;
    
    private AnaPencere(){
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Pencereyi kapatınca uygulama kapanır.
        setDimension(mGenislik,mYukseklik); 
        setResizable(false); // Pencere boyu değişmez
        
        Yilan Y = new Yilan();
        
        add(Y);
        
   
    }
    public static AnaPencere PencereGetir(){
        if(mPencere == null){
            mPencere = new AnaPencere();
            return mPencere;
        }
        return new AnaPencere();
    }
    
    public void setDimension(int Genislik, int Yukseklik){
        
        Dimension Dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        int PosX = 0;
        int PosY = 0;
        
        if(mGenislik+100>Dim.width){
            mGenislik = Dim.width-100;
        }
        if(mYukseklik+100>Dim.height){
            mYukseklik = Dim.height-100;
        }
        
        PosX = (Dim.width-mGenislik)/2;
        PosY = (Dim.height-mYukseklik)/2;
        
        setBounds(PosX,PosY,mGenislik,mYukseklik);
        
 
    }
    
}
