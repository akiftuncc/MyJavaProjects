public class NewClass {    
    public static void main(String[] args){
        int sayi = 0; // sayi 25 olduğunda listedeki tüm değerler yerleştirildi demektir
        int sayi1 = 0; // sayi1 200 olduğunda döngü tekrara girdiğinden dolayı başa sarar
        int matrix[][] = {{-9,-9,-9,-9,-9},{-9,-9,-9,-9,-9},{-9,-9,-9,-9,-9},{-9,-9,-9,-9,-9},{-9,-9,-9,-9,-9}}; // listedei tüm değerler -9 ile başlar
        int a[] = {((int)(Math.random()*5)),((int)(Math.random()*5))}; // 0'ın random konumu
        int a1[] = new int[2];
        while (true){ // doğru komninasyon oluşana kadar sürekli while döndürür
            sayi = 0;
            sayi1 = 0;
            for (int i =0; i<5;i++){
                for (int j = 0; j<5; j++){
                    matrix[i][j] = -9; // her denemede listedeki değerler tekrar -9 olur
                }
            }
        while(sayi<25 & sayi1<200){ 
            if(matrix[a[0]][a[1]] == -9){  // listedeki değerlerin birbiriyle çakışmaması için eğer ki değer -9 ise atama yapar
                matrix[a[0]][a[1]] = sayi; // konum değişir
                sayi++;
                a1 = a; // eski konumu kaydeder            
            }
            else{  // listedeki değer -9 değilse 
                sayi1++; 
                a = a1; // konumun değişmemesi için eski konuma döner
            }
            a= algoritma(a[0],a[1]); // kurallara göre konum değiştirme algoritması çalıştırılır
        }
        if (sayi == 25){ // while sonlandırılır
                break;
            }
        }
        System.out.println("");
        for (int i = 0; i<5; i++){ // matrix'i bastırır
            for (int j = 0; j<5;j++){
                if(matrix[i][j]>=10){ 
                    System.out.print(matrix[i][j]+" "); 
                }
                else{
                    System.out.print(matrix[i][j]+"  ");
                }
            }
            System.out.println("");
        }
    }
    
    public static int[] algoritma(int i,int j){ // sayı yerleştirme algoritması // içine i ve j değerleri girer
        int Matrix[] = new int[2]; // 2 değerli matrix oluşturur
        while(true){
            int random = (int)(Math.random()*8+1); // rastgele sayı bulur
            if (random == 1){ // rastgele sayıya göre rastgele konum ekler
                j = j+3;
                if (!(i<0 | i>4 | j<0 | j>4)){  // eğer ki matrix sınırlarını aşmazsa j+3 uygulanır              
                    break;
                }
                else{         // eğer ki matrix sınırlarını aşarsa j+3-3 olup uygular          
                    j = j-3; 
                    break;
                }}
            if (random == 2){ // random == 8 e kadar tüm ihtimaller yazılır
                j = j-3;
                if (!(i<0 | i>4 | j<0 | j>4)){    
                    break;
                }
                else{
                  j = j+3;
                  break;
            }}
            if (random == 3){ 
                i = i+3;
                if (!(i<0 | i>4 | j<0 | j>4)){
                    break;
                }
                else{
                    i-= 3;
                    break;
            }}
            if (random == 4){ 
                i = i-3;
                if (!(i<0 | i>4 | j<0 | j>4)){       
                    break;
                }
                else{
                    i +=3;
                    break;
            }}
            if (random == 5){ 
                i+=2;
                j+=2;
                if(!(i<0 | i>4 | j<0 | j>4)){
                break;}
                else{
                    i-=2;
                    j-=2;
                    break;
                }}
            if (random == 6){ 
                i-=2;
                j-=2;
                if(!(i<0 | i>4 | j<0 | j>4)){
                    break;
                }
                else{
                    i+=2;
                    j+=2;
                    break;
                }}
            if (random == 7){ 
                i+=2;
                j-=2;
                if(!(i<0 | i>4 | j<0 | j>4)){
                break;}
                else{
                    i-=2;
                    j+=2;
                    break;
                }}
            if (random == 8){ 
                i-=2;
                j+=2;
                if(!(i<0 | i>4 | j<0 | j>4)){  
                break;}
                else{
                    i+=2;
                    j-=2;
                    break;
                }}   
        }
        Matrix[0] = i;
        Matrix[1] = j;
        return Matrix;   // Matrix'i döndürür     
    }
}