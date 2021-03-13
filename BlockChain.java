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
// Creates a Blockchain
// Block1, Blockchain1, and crypto classes are the 
// best options to implement Blockchain
// We used Block, Blockchain, Transaction for simplicity,
// validity and display an output using sample input data
// Refer Block1, Blockchain1 and crypto classes for more detail
import java.util.Arrays;
import java.util.Scanner;

public class BlockChain {
    
   public static void main(String[] args) {
   
        
    System.out.println("--------------------------------------------------");
    System.out.println("***###********** Welcome to CBMTS **********###***");
    //System.out.println("***###*******###*****************###********###***\n");
    System.out.println("---------------------------------------------------");
    Scanner s=new Scanner(System.in);
    
   try{
    
    // Initialization
    double balance = 0.0;
    double purchaseamount = 0.0; 
    double transferamount = 0.0;
          
    //Create an account and Buy a Crypto Currency
    System.out.println("--------------BUY A CRYPTO CURRENCY---------------");
    System.out.println("Enter your  name:");
    String payername = s.next();
    //payername =s.next();
    System.out.println("Enter the amount you want to purchase:");
    purchaseamount=s.nextDouble();
       
    balance = balance + purchaseamount;
      
    System.out.println("Hello " + payername + " your balance is $ " +balance);
    
    System.out.println("--------------------TRANSFER--------------------");
    System.out.println("Enter the name of the payee / recipient:");
    //System.out.println("Enter the address of the payee / recipient");
    String payeename = s.next();
    //payeename =s.next();
    System.out.println("Enter the amount you want to transfer:");
    transferamount=s.nextInt();
    
    // Check Balance
    if(balance < transferamount){   
    System.out.println("Insufficient fund, transfer failed:");
    }
    
    //Transfer a certain amount to the Recipient / Payee
    
    else{ 
        balance = balance - transferamount;
        System.out.println("Transfer successful, the transfer amount is $ : "
                            +transferamount);
        System.out.println("Your current balance is $ : " + balance);
    }
    
    //Create the Block
    //Notice: The hashes for each block can also be created by
    
    System.out.println("---------------THE BLOCKS CREATED-----------------");
    
    Transaction transaction = new Transaction(payername, payeename, transferamount);
    
    Block firstBlock = new Block(0, Arrays.asList(transaction));//Genesis Block
    System.out.println("The First Block is:" +firstBlock.hashCode());
    
    // Notice: the next code shows how a Blockchain is 
    // created with similar transaction as an example
    
    //System.out.println("--------------------------------------------------");
    Block secondBlock = new Block(firstBlock.hashCode(), Arrays.asList(transaction));
    System.out.println("The Second Block is:" +secondBlock.hashCode());
    //System.out.println("--------------------------------------------------");
    Block thirdBlock = new Block(secondBlock.hashCode(), Arrays.asList(transaction));
    System.out.println("The Third Block is:" +thirdBlock.hashCode());
    //System.out.println("--------------------------------------------------");
    Block fourthBlock = new Block(thirdBlock.hashCode(), Arrays.asList(transaction));
    System.out.println("The Fourth Block is:" +fourthBlock.hashCode());
    //System.out.println("--------------------------------------------------");
    Block fifthBlock = new Block(fourthBlock.hashCode(), Arrays.asList(transaction));
    System.out.println("The Fifth Block is:" +fifthBlock.hashCode());
    //System.out.println("--------------------------------------------------");
    Block sixthBlock = new Block(fourthBlock.hashCode(), Arrays.asList(transaction));
    System.out.println("The Sixth Block is:" +sixthBlock.hashCode());
    
    System.out.println("---------------ARE THE BLOCKS VALID?-----------------");
    // Checks the validity of the Blocks
    if(firstBlock.hashCode()!= secondBlock.hashCode() &&
            secondBlock.hashCode()!= thirdBlock.hashCode()&&
            fourthBlock.hashCode()!= fifthBlock.hashCode() &&
            fifthBlock.hashCode()!= sixthBlock.hashCode())
            {
                System.out.println("The Blocks are valid!!");
            }
    else    {
                System.out.println("The Blocks are not valid!!");
            }
    }catch(Exception e)
    {
                System.out.println(e);
    }          
  }
}

