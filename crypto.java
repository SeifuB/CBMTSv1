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

// This class generates Hashes 

import java.security.MessageDigest; 

public class crypto { 

// Function that takes the string input 
// and returns the hashed string. 
    public static String sha256(String input){ 
    
    try { 
        
        MessageDigest sha = MessageDigest.getInstance("SHA-256"); 
        int i = 0; 
        byte[] hash = sha.digest(input.getBytes("UTF-8")); 
        
        // hexHash will contain the Hexadecimal hash 

        StringBuffer hexHash = new StringBuffer(); 
        while (i < hash.length) { 
            
            String hex = Integer.toHexString(0xff & hash[i]); 
			
            if (hex.length() == 1) 
                hexHash.append('0'); 
		hexHash.append(hex); 
		i++; 
			} 
			return hexHash.toString(); 
		} catch (Exception e) { 
		throw new RuntimeException(e); 
    } 
}
}
