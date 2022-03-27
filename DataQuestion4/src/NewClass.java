// Akif TUNC | 190315078    ||   Birhat Tas | 190315010
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
public class NewClass {   
    public static void main(String[] args) throws IOException{
        File f = new File("C:/Users/akif/Desktop/Yeni klasör/yazilar.txt");  // Creates a txt file      
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<String> strList = new ArrayList<String>();
        ArrayList<String> strList1 = new ArrayList<String>();
        ArrayList<String> strList2 = new ArrayList<String>();               
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
            writer.append("So close, no matter how far"); // write these words to txt
            writer.newLine();
            writer.append("Couldn't be much more from the heart");
            writer.newLine();
            writer.append("Forever trusting who we are");
            writer.newLine();
            writer.append("And nothing else matters");
            writer.newLine();
            writer.append("Never opened myself this way");
            writer.newLine();
            writer.append("Life is ours, we live it our way");
            writer.newLine();
            writer.append("All these words, I don't just say");
            writer.newLine();
            writer.append("And nothing else matters");
            writer.newLine();
            writer.append("Trust I seek and I find in you");
            writer.newLine();
            writer.append("Every day for us something new");
            writer.newLine();
            writer.append("Open mind for a different view");
            writer.newLine();
            writer.append("And nothing else matters");
            writer.newLine();
            writer.append("Never cared for what they do");
            writer.newLine();
            writer.append("Never cared for what they know");
            writer.newLine();
            writer.append("But I know");
            writer.newLine();                                    
            writer.flush();            
        } catch (FileNotFoundException ex) {           
        } catch (IOException ex) {           
        }       
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));           
            while (true){
                int a = reader.read();
                if (a == -1){ // stops reading if all words are readen
                    break;
                }
                if (a<97 & a>64){ // makes all lettes lower case
                    a = a+32;
                }
                intList.add(a); 
            }           
        } catch (FileNotFoundException ex) {           
        }             
        for (int i = 0; i<intList.size(); i++){           
            if (intList.get(i) == 32 | intList.get(i) == 10 ){
                intList.set(i, 32); // makes new line = space 
            }
            else if (intList.get(i)<65 | intList.get(i)>123){
                intList.set(i, 333); // makes punctuation marks' ascii value same. 333 is a random number that i choose
            }}        
        for (int i = 0; i<intList.size(); i++){
            if (intList.get(i)== 333){
                intList.remove(i); // removes punctuation marks
            }
            int ascii = intList.get(i);
            char a = (char)ascii;   // ascii to letter         
            String b = a+""; // all letters adds to string b
            strList.add(b);                       
        }        
        String a = "";
        for (int i = 0; i<strList.size(); i++){
            a = a+strList.get(i);
            if (strList.get(i).equals(" ")){
                strList1.add(a); // adds words to lists 
                strList2.add(a);
                a = "";
            }            
        }
            System.out.println("ALL WORDS");      
            System.out.println(strList1);
            System.out.println(""); 
            
            for (int i = 0; i<strList1.size(); i++){            
                for (int j = 0; j<strList1.size(); j++){                
                    if (i!=j){                  
                        if (strList1.get(i).equals(strList1.get(j))){
                        strList1.remove(j); // removes same words
}}}}    
        System.out.println("NEW LIST WITH REMOVED WORDS");
        System.out.println(strList1);
        System.out.println("");        
        int deger = 0;
        for (int i = 0; i<strList1.size(); i++){
            deger++; // counts how many different words typed.
        }
        System.out.println(deger+" different words");   
}}
