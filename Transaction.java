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

// The transaction creation process

public class Transaction {
    
    private String payername;
    private String payeename;   // Recipient 
    private Integer version;
    private double amount;

    //Constructor
    
    public Transaction(String payername, String payeename, double amount) {
        this.payername = payername;
        this.payeename = payeename;
        this.amount = amount;
    }
    
    // Getter and Setter Methods
    
    public String getPayername() {
        return payername;
    }

    public void setPayername(String payername) {
        this.payername = payername;
    }

    public String getPayeename() {
        return payeename;
    }

    public void setPayeename(String payeename) {
        this.payeename = payeename;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
     
}