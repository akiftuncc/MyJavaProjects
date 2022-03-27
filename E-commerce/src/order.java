
import java.util.Scanner;

//-For order transactions, there must be an Order class that holds the ordering user object, the ordered product object, and the credit card objects to which the payment is made.
//In addition, a method must be used here that accesses the method that controls the product stock information of the Product class and accesses the purchasing method of the User class.
public class order {
    
    public static void main(String[] args){
        int favorites[] = {0,0,0,0,0};
        int sm = 0;
        String color,product,cathegory,description;
        int stock,weight;
        int buyCheck = 0;
        user user1 = new user();
        product product1 = new product();
        CreditCard CC = new CreditCard();
        
        Scanner input = new Scanner(System.in);
        System.out.println("*****ACCOUNT CREATION PAGE****\n"
                          +"______________________________");
        System.out.print("Name: ");
        user1.setName(input.nextLine());
        System.out.print("Surname: ");
        user1.setSurName(input.nextLine());
        System.out.print("User Name: ");
        user1.setUserName(input.nextLine());
        System.out.print("Password: ");
        user1.setPassword(input.nextLine());
        System.out.print("E-mail: ");
        user1.seteMail(input.nextLine());
        System.out.print("Home Adress: ");
        user1.setHomeAdress(input.nextLine());
        System.out.print("Work Adress: ");
        user1.setWorkAdress(input.nextLine());
        System.out.print("Date of Birth: ");
        user1.setBirthDate(input.nextLine());
        System.out.println("_____________________________");
        System.out.println("ACCOUNT SUCCESSFULLY CREATED!");
        
        System.out.println("\n********************\n"
                + "     Welcome "+user1.getName()+" "+user1.getSurName()+"\n********************");
        while (true){
            if(sm == 1){
                    break;
                }
            while (true){               
            System.out.println("\nCathegories:    Cloth:1   Jewelery:2");
            System.out.print("Your Dialing: ");
            int key = input.nextInt();
            cathegory = product1.productCategory(key);
            if(key !=1 & key !=2){
                System.out.println(cathegory);
            }   
            else{
                System.out.println("\nYou pick "+cathegory+" cathegory but we have just 5 products, so I will show you all the products.\n");
                break;
            }
            }
            System.out.println("Buy Shirt = 1   Buy Shoes = 2   Buy Hats = 3   Buy Necklaces = 4   Buy Earrings = 5    Favorite Product Selection Page = 6     Quit = 7");
            int a = input.nextInt();
            if (a>=1 &5>=a){
                while(true){
                System.out.println("Color Options: Blue=1 Red=2 Black=3 Yellow=4 White=5 Leave Page=6");
                System.out.print("Your Dialing: ");
                int umbColor = input.nextInt();
                if (umbColor == 6){
                    System.out.println("Leaving Page.."); break;
                }
                {if (umbColor<=0 & umbColor>=6){
                    System.out.println("Wrong Dialing!");
                }
                else{
                            System.out.println("");
                    color = product1.getProductColor(umbColor);
                    product = product1.getProductName(a);
                    stock = product1.getProductStock(a);
                    description = product1.getProductDescription(a);
                    weight = product1.getProductWeight(a);
                    product1.stockTester(stock);
                    product1.spProductStock(a);
                    if (stock <= 0){
                        break;
                    }
                    System.out.print("-Description: "+description+"  \n-Weight: "+weight);
                    if(a == 1 | a == 2){
                        System.out.println(" kg");
                    }
                    else{
                        System.out.println(" gr");
                    }
                    System.out.println("-Color: "+color+"\n-Product: "+product);
                    buyCheck = a;
                    break;
                    
                }}
            }
            }
            
            else if (a == 6){
                System.out.println("__________________________________________");
                System.out.println("Welcome To Favorite Product Selection Page\n");
                while (true){
                System.out.println("\nTo add (Shirt Press 1) (Shoes Press 2) (Hats Press 3) (Necklaces Press 4) (Earrings Press 5) (Leave Press 6)");
                int b = input.nextInt();
                user1.setFavoriteProducts(favorites);
                if (b == 6){
                    System.out.print("Favorite products: ");
                    user1.getFavoriteProducts();
                    System.out.println("");
                    System.out.println("Leaving Favorite Product Selection Page..");
                    break;
                }
                else if (b == 1){
                    System.out.println("Shirts added to your favorite products list.");
                    favorites[0] = 1;
                }
                else if (b == 2){
                    System.out.println("Shoes added to your favorite products list.");
                    favorites[1] = 2;
                }
                else if (b == 3){
                    System.out.println("Hats added to your favorite products list.");
                    favorites[2] = 3;
                }
                else if (b == 4){
                    System.out.println("Neclaces added to your favorite products list.");
                    favorites[3] = 4;
                }
                else if (b == 5){
                    System.out.println("Earrings added to your favorite products list.");
                    favorites[4] = 5;
                }
                else{
                    System.out.println("Wrong Dialing!");
                }
            }
                
            } 
            else if (a == 7){
                System.out.println("Thanks For Your Shopping");
                break;
            }
            else{
                System.out.println("Wrong Dialing! ");
            }
        if(buyCheck != 0){
            
            System.out.println("If you want to add more products to your shopping cart Press '1'"
                            + "\nIf you want to complete your shopping Press '2'  ");
            int lpm = input.nextInt();
            if(lpm == 1){
                continue;
            }
            else if (lpm == 2){ 
            System.out.println("You Have To Login Before Shopping");

            int i = 3;
            while (true){
            System.out.print("Username: ");
            String id = input.next();
            System.out.print("Password: ");
            String pass = input.next();
            if(id.equals(user1.getUserName()) & pass.equals(user1.getPassword())){
                System.out.println("Logged In");
                System.out.println("Welcome: "+user1.getName()+" "+user1.getSurName());
                System.out.println("______________________");
                System.out.println("Account Details: ");
                System.out.println("Home Adress: "+user1.getHomeAdress());
                System.out.println("Work Adress: "+user1.getWorkAdress());
                System.out.println("Birth Date: "+user1.getBirthDate());
                System.out.println("E-mail: "+user1.geteMail());
                
                System.out.println("You don't have any credit cards.");
                System.out.println("We are creating a new credit card automatically");
                CC.setCreditCardNumber();
                CC.setExpirationDate();
                CC.setCreditCardUser(user1.getName()+" "+user1.getSurName());
                CC.setSecurityCode();
                System.out.println("Your card is successfully created.    ");
                System.out.println("________________________________________________");
                System.out.print("Card User: "+CC.getCreditCardUser()+"   Card Number: "+CC.getCreditCardNumber());
                System.out.print("  Card Expiration Date: "+CC.getExpirationDate(1)+"/"+CC.getExpirationDate(2)+"    Card Security Code: "+CC.getSecurityCode());
                System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("\n*****************************"
                                +  "\nNote Your Credit Card Details"
                                +  "\n*****************************");
                System.out.println("Our System is automatically Sending you to buy page.");
                int qol = 3;
                int place = 0;
                System.out.println("For Home Adress Press '1'    For Work Adress Press '2'");
                int q4 = input.nextInt();
                product1.rkBuyer();
                while (qol>0){
                System.out.print("Credit Card Number: ");
                int elo = input.nextInt();
                System.out.println("");
                System.out.print("Expiration Date:\nMonth: ");
                int elo1 = input.nextInt();
                System.out.print("\nYear: ");
                int elo2 = input.nextInt();
                System.out.println(" "+ CC.getExpirationDate(1)+"/"+CC.getExpirationDate(2));
                System.out.print("Security Code: ");
                int elo3 = input.nextInt();
                if(elo == CC.getCreditCardNumber() & elo1 == CC.getExpirationDate(1) & elo2 == CC.getExpirationDate(2) & elo3 == CC.getSecurityCode() ){
                    if (q4 == 1){
                        System.out.println(user1.getHomeAdress());
                    }
                    if (q4 == 2){
                        System.out.println(user1.getWorkAdress());
                    }
                    System.out.println("You Successfully Bought.");
                    System.out.println("Thanks For your shopping");
                    sm = 1;
                    break;
                }
                else{
                    qol -= 1;
                    System.out.println("Wrong Card Details\nRemaining Entires: "+qol);
                }
                }
                if (sm == 1){
                    break;
                }
                System.out.println("Wrong Entries. Leaving page...");
                break;
                
                
            }
            else{
                i-=1;
                System.out.println("Wrong id or password\nentry rights: "+i);   
            }
            if (i == 0){
                System.out.println("Disconnecting from server..");
                break;
            }
            }}
            else{
                System.out.println("Wrong Dialing!");
            }  
        }
        }
        
        
        
        
        
        
        
        
    }
    
}
