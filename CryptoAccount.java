/* Admas University, School of Post Graduate Studies
Department of Computer Science-Section2
Course Name: Object Oriented Software Development
Project Members:
Seifu Birega        PGMGC/8062/20
Yordanos Woldu      PGMGC/8053/20
Mekonnen Ayalew     PGMGC/3118/20
Simeon G/Yohanes    PGMGC/8067/20
Habtamu Birhan      PGMGC/8023/20
 */
package CBMTS;

// Creates the  Account for the CBMTS users

public class CryptoAccount {
    
    private double balance;
    //public String accountcode;
    private String payername;
    private String payeeaddress; // Recipient address
    
    // Constructor

    public CryptoAccount(double balance, String payername, String payeeaddress) {
        this.balance = balance;
        this.payername = payername;
        this.payeeaddress = payeeaddress;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPayername() {
        return payername;
    }

    public void setPayername(String payername) {
        this.payername = payername;
    }

    public String getPayeeaddress() {
        return payeeaddress;
    }

    public void setPayeeaddress(String payeeaddress) {
        this.payeeaddress = payeeaddress;
    }
    
}
