// Akif TUNC | 190315078    ||  Birhat Tas | 190315010
import java.util.ArrayList;
import java.util.Collections;
public class NewClass {   
    public static void main(String[] args){        
        ArrayList<Integer> numList1 = new ArrayList<Integer>();
        ArrayList<Integer> numList2 = new ArrayList<Integer>();
        ArrayList<Integer> numList3 = new ArrayList<Integer>();       
        int a1 = 0;
        
        while (a1<15){
            a1++;
            int a = ((int)(Math.random()*10));
            numList1.add(a);  // adds random numbers to List 1
        }
        while (a1<40){
            a1++;
            int a = ((int)(Math.random()*15+5));
            numList2.add(a); // adds random numbers to List 2
        }
        System.out.println("__________LISTS_______________");
        System.out.println("List 1: "+ numList1);
        System.out.println("List 2: "+ numList2);
        System.out.println("");
        System.out.println("___________SORTED_LISTS_______");
        Collections.sort(numList1); // Sorts lists
        System.out.println("List 1: "+ numList1);
        Collections.sort(numList2);
        System.out.println("List 2: "+ numList2);
        System.out.println("");
        int s = 0;

        for (int i = 0; i<numList1.size(); i++){
            if (i > numList1.size()){
                continue;
            }
            for (int j = 0; j<numList1.size(); j++){
                if (j > numList1.size()){
                continue;
            }
                if (i!=j){
                    if ( numList1.get(i) == numList1.get(j) ){
                        numList1.remove(i);  // removes same numbers
                    }}}}        
        for (int i = 0; i<numList2.size(); i++){
            if (i > numList2.size()){
                continue;
            }
            for (int j = 0; j<numList2.size(); j++){
                if (j > numList2.size()){
                continue;
            }
                if (i!=j){
                    if ( numList2.get(i) == numList2.get(j) ){
                        numList2.remove(i); // removes same numbers
                    }}}}        
        for (int i = 0; i<numList1.size(); i++){
            numList3.add(numList1.get(i));
        }
        for (int i = 0; i<numList2.size(); i++){ // adds list 2 to list 3
            numList3.add(numList2.get(i));
        }
        System.out.println("___________________List 3 IS ADDED_______________");
        System.out.println("List 1: "+ numList1);     
        System.out.println("List 2: "+ numList2);
        System.out.println("List 3: "+ numList3);
        System.out.println("");
        
        for (int i = 0; i<numList3.size(); i++){
            if (i > numList3.size()){
                continue;
            }
            for (int j = 0; j<numList3.size(); j++){
                if (j > numList3.size()){
                continue;
            }
                if (i!=j){
                    if ( numList3.get(i) == numList3.get(j) ){
                        numList3.remove(i); // removes same numbers in list 3
                    }}}}       
        System.out.println("________________SORTED LIST 3________________");
        Collections.sort(numList3); // sorts list 3
        System.out.println(numList3);
}}