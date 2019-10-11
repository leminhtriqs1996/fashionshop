/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author FSC
 */
public class Staff {

    private int ID_STAFF;
    private String NAME;
    private String TEL;
    private String EMAIL;
    private String PASS;
    private String STAFF_ADDRESS;
    
    public Staff(){
    }    

    public Staff(int ID_STAFF, String NAME, String TEL, String EMAIL, String PASS, String STAFF_ADDRESS) {
        this.ID_STAFF = ID_STAFF;
        this.NAME = NAME;
        this.TEL = TEL;
        this.EMAIL = EMAIL;
        this.PASS = PASS;
        this.STAFF_ADDRESS = STAFF_ADDRESS;
    }

    public int getID_STAFF() {
        return ID_STAFF;
    }

    public void setID_STAFF(int ID_STAFF) {
        this.ID_STAFF = ID_STAFF;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

    public String getSTAFF_ADDRESS() {
        return STAFF_ADDRESS;
    }

    public void setSTAFF_ADDRESS(String STAFF_ADDRESS) {
        this.STAFF_ADDRESS = STAFF_ADDRESS;
    }

    @Override
    public String toString() {
        return "Staff{" + "ID_STAFF=" + ID_STAFF + ", NAME=" + NAME + ", TEL=" + TEL + ", EMAIL=" + EMAIL + ", PASS=" + PASS + ", STAFF_ADDRESS=" + STAFF_ADDRESS + '}';
    }
    

    

}
