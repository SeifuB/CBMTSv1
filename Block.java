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

import java.util.Date;
import java.util.List;

// Creates a block in a Blockchain
// Block1, Blockchain1, and crypto classes are the 
// best options to implement Blockchain
// We used Block, Blockchain, Transaction for simplicity,
// validity and display an output using sample input data
// Refer Block1, Blockchain1 and crypto classes for more detail

public class Block {
    
    private int previousHash;
    private List<Transaction> transactions;
    private long timeStamp; 
    
    // Constructor

    public Block(int previousHash, List<Transaction> transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        this.timeStamp = new Date().getTime();;
    }
    
    // Getter and Setter Methods

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
 }