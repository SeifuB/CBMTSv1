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

public class Person {
    
    public String personid;
    public String firstname;
    public String lastname;
    public Date dob; // Date of Birth
    
    // Constructor

    public Person(String personid, String firstname, String lastname, Date dob) {
        this.personid = personid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
    }
    
    // Getter and Setter Methods

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    
        
}

