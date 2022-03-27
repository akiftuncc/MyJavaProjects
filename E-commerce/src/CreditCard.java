//-There must be a CreditCard class that contains the credit card number, credit card user, security code and expiration date of the credit cards.

public class CreditCard {
    private int creditCardNumber;
    private String creditCardUser;
    private int securityCode;
    private int[] expirationDate = {0,0};
    

    /**
     * @return the creditCardNumber
     */
    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * @param creditCardNumber the creditCardNumber to set
     */
    public void setCreditCardNumber() {
        this.creditCardNumber = (int)(Math.random() * 89999+10000);
    }

    /**
     * @return the creditCardUser
     */
    public String getCreditCardUser() {
        return creditCardUser;
    }

    /**
     * @param creditCardUser the creditCardUser to set
     */
    public void setCreditCardUser(String creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    /**
     * @return the securityCode
     */
    public int getSecurityCode() {
        return securityCode;
    }

    /**
     * @param securityCode the securityCode to set
     */
    public void setSecurityCode() {
        this.securityCode = (int)(Math.random() * 899+100);
    }

    /**
     * @return the expirationDate
     */
    public int getExpirationDate(int a) {
        int i = expirationDate[0];
        int j = expirationDate[1];
        if (a == 1){
            return i;
        } 
        else{
            return j;
        }
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate() {
        expirationDate[0] = (int)(Math.random() * 2+10);
        expirationDate[1] = (int)(Math.random() * 10+2022);
    }
    

}
