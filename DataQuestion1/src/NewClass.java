// Akif TUNC | 190315078    ||   Birhat Tas | 190315010
import java.util.Scanner;

public class NewClass {  
    public static void main(String[] args){        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        
        if (a>0){
            int binler1 = a/1000;            
            int yuzler1 = a % 1000;
            int onlar1 = a % 100;
            int birler = a % 10;
            int yuzler2 = yuzler1 / 100;
            int onlar2 = onlar1 / 10;
            int yuzler = (int)yuzler2;
            int onlar = (int)onlar2;
            int binler = (int)binler1;
            
            double total = Math.pow(birler,4)+Math.pow(onlar,4)+Math.pow(yuzler,4)+Math.pow(binler,4);
            
            int total1 = (int)total;
            
            if (total1 == a){
                System.out.println("Armstrong");
            }
            else{
                System.out.println("değil");
            }}}}
