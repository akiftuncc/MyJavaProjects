// Akif TUNC | 190315078    ||   Birhat Tas | 190315010
import java.util.ArrayList;
import java.util.Scanner;
public class NewClass {   
    public static void main(String[] args){       
        Scanner input = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<String>();
        ArrayList<String> strList1 = new ArrayList<String>();       
        int a = 0;
        
        while (a<10){           
            a++;
            System.out.println("Enter a Word (remaining "+(11-a)+" words)");
            String word = input.nextLine();
            strList.add(word); // adds words to list
        }
        int value = 0;
        while (value < 10){
            value++;
        for (int i = 0; i<strList.size(); i++){
            int val = 0;
            for (int j = 0; j<strList.size();j++){ 
                if (strList.get(i).equals(strList.get(j))){
                   val++; 
                } 
                if (val > 1){
                    strList.remove(j); // if there are more than 1 word, removes other words from list
                }}}}
        System.out.println(strList);
        }}
