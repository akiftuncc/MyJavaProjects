//-There  must be a  User class that holds the  username,  name,  surname, date of birth, password, email address,  home  and  work  addresses,  products  ordered,  
//favorite  products,  and  credit  card  objects belonging to the  user. In this  class, there should also be  two methods that perform the  user's  product orderingand product favorites.


public class user {
    private String userName;
    private String name;
    private String surName;
    private String birthDate;
    private String password;
    private String eMail;
    private String homeAdress;
    private String workAdress;
    private int[] productsOrdered; //
    private int[] favoriteProducts; 
    private int[] creditCardObjects; //

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surName
     */
    public String getSurName() {
        return surName;
    }

    /**
     * @param surName the surName to set
     */
    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * @return the homeAdress
     */
    public String getHomeAdress() {
        return homeAdress;
    }

    /**
     * @param homeAdress the homeAdress to set
     */
    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    /**
     * @return the workAdress
     */
    public String getWorkAdress() {
        return workAdress;
    }

    /**
     * @param workAdress the workAdress to set
     */
    public void setWorkAdress(String workAdress) {
        this.workAdress = workAdress;
    }
    
    public void setFavoriteProducts(int[] favoriteProducts1){
        favoriteProducts = favoriteProducts1;
    }
    public void getFavoriteProducts(){
        int a[] = favoriteProducts;
        int q = 0;
        if (a[0] == 1){
            System.out.print("  Shirts");
            q = 1;
        }
        if (a[1] == 2){
            System.out.print("  Shoes");
            q = 1;
        }
        if (a[2] == 3){
            System.out.print("  Hats");
            q = 1;
        }
        if (a[3] == 4){
            System.out.print("  Neclaces");
            q = 1;
        }
        if (a[4] == 5){
            System.out.print("  Earrings");
            q = 1;
        }
        if (q == 0){
            System.out.println("You don't have favorite products yet.");
        }
    }
    
    
    
}
