//-There must be a Product class that holds the product name, product color, product category, product stock  information,  product  weight,  product  description  information.
//In  addition,  when  a  product  is orderedby users, a method should be written that reduces the number of stocks as much as the number of products purchased and controls the stock number.

public class product {
    
    private String productName1 ="Shirt" , productName2 ="Shoe", productName3 ="Hat", productName4 ="Necklace", productName5 ="Earrings" ;
    private int price1 = 15,price2 = 25, price3 = 35,price4 = 45,price5 = 55;
    private String productColor1 ="Blue", productColor2 ="Red", productColor3 ="Black", productColor4 ="Yellow", productColor5 ="White";    
    private int[] productCategory ={1,2};
    private int productStock1=3, productStock2=2, productStock3=99, productStock4=4, productStock5=1;    
    private int productWeight1=2, productWeight2=1, productWeight3=350, productWeight4 = 120, productWeight5=26;

    private String productDescription1 = "Keeps you dry", productDescription2 = "Keeps your feet safe", productDescription3 = "80's Fashion", productDescription4 = "Rustproof", productDescription5 = "Stainless Steel";
    int e1 = productStock1;
    int e2 = productStock2;
    int e3 = productStock3;
    int e4 = productStock4;
    int e5 = productStock5;
    
    public String getProductName(int a) {
        switch (a){
            case 1: return productName1; 
            case 2: return productName2;
            case 3: return productName3;
            case 4: return productName4;
            case 5: return productName5;
        }
            return "-";   
    }
    public void spProductStock(int a){
        switch (a){
            case 1: productStock1 -=1;
            return;
            case 2: productStock2 -=1;
            return;
            case 3: productStock3 -=1;
            return;
            case 4: productStock4 -=1;
            return;
            case 5: productStock5 -=1;
            return;
        }   
    }
    public void rkBuyer(){
        if (productStock1 < 0){
            productStock1 =0;
        }
        if (productStock2 < 0){
            productStock2 =0;
        }
        if (productStock3 < 0){
            productStock3 =0;
        }
        if (productStock4 < 0){
            productStock4 =0;
        }
        if (productStock5 < 0){
            productStock5 =0;
        }
        int e11 = e1 - productStock1;
        int e22 = e2 - productStock2;
        int e33 = e3 - productStock3;
        int e44 = e4 - productStock4;
        int e55 = e5 - productStock5;
        System.out.println("Your Shopping Cart");
        if (e1 > 0){
            System.out.println(" "+e11+" "+productName1+"("+e11*price1+"USD"+")"+"   ");
        }
        if (e2 > 0){
            System.out.println(" "+e22+" "+productName2+"("+e22*price2+"USD"+")"+"   ");
        }
        if (e3 > 0){
            System.out.println(" "+e33+" "+productName3+"("+e33*price3+"USD"+")"+"   ");
        }
        if (e4 > 0){
            System.out.println(" " +e44+" "+productName4+"("+e44*price4+"USD"+")"+"   ");
        }
        if (e5 > 0){
            System.out.println(" "+e55+" "+productName5+"("+e55*price5+"USD"+")"+"   ");
        }
        System.out.println("");
        System.out.println("Total: "+(e11*price1+e22*price2+e33*price3+e44*price4+e55*price5));
        
        
    }
    
    public String getProductColor(int a) {
        switch (a){
            case 1: return productColor1; 
            case 2: return productColor2;
            case 3: return productColor3;
            case 4: return productColor4;
            case 5: return productColor5;
        }
            return "-";   
    }
    public int getProductStock(int a) {
        switch (a){
            case 1: return productStock1; 
            case 2: return productStock2;
            case 3: return productStock3;
            case 4: return productStock4;
            case 5: return productStock5;
        }
            return 0;   
    }
    
    public int getProductWeight(int a) {
        switch (a){
            case 1: return productWeight1; 
            case 2: return productWeight2;
            case 3: return productWeight3;
            case 4: return productWeight4;
            case 5: return productWeight5;
        }
            return 0;   
    }
    public String getProductDescription(int a) {
        switch (a){
            case 1: return productDescription1; 
            case 2: return productDescription2;
            case 3: return productDescription3;
            case 4: return productDescription4;
            case 5: return productDescription5;
        }
            return "-";   
    }
    
    public String productCategory(int a){
        if(a == productCategory[0]){
            return "Clothes";
        }
        else if(a == productCategory[1]){
            return "Jewelery";
        }
        else{
            return "Wrong Dialing!";
        }
    }
    
    public void stockTester(int a){
        System.out.println("Checking Stock..");
        if (a<=0){
            System.out.println("We are out of stock");
        }
        else{
            System.out.println("Current Stock: "+a);
        }
    }
    public void stockCalc(){
        int i1 =0, i2=0,i3=0,i4=0,i5=0;
        if(productStock1 <0){
            
        }
    }
    
    
    
}
