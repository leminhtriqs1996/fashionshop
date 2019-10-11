/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Le Hoa
 */
public class Customer {
    	private int ID_CUSTOMER;
	private String NAME;
	private java.sql.Date DATEOFBIRTH;
	private String PHONE;
        private String EMAIL;
        private String PASSWORD;
        private String ADDRESS;
        private String GENDER;
        
    public Customer(int ID_CUSTOMER, String NAME, java.sql.Date DATEOFBIRTH, String PHONE, String EMAIL, String PASSWORD, String ADDRESS, String GENDER) {
        this.ID_CUSTOMER = ID_CUSTOMER;
        this.NAME = NAME;
        this.DATEOFBIRTH = DATEOFBIRTH;
        this.PHONE = PHONE;
        this.EMAIL = EMAIL;
        this.PASSWORD = PASSWORD;
        this.ADDRESS = ADDRESS;
        this.GENDER = GENDER;
    }

    public Customer() {
    }

    public int getID_CUSTOMER() {
        return ID_CUSTOMER;
    }

    public void setID_CUSTOMER(int ID_CUSTOMER) {
        this.ID_CUSTOMER = ID_CUSTOMER;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Date getDATEOFBIRTH() {
        return DATEOFBIRTH;
    }

    public void setDATEOFBIRTH(Date DATEOFBIRTH) {
        this.DATEOFBIRTH = DATEOFBIRTH;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    @Override
    public String toString() {
        return "Customer{" + "ID_CUSTOMER=" + ID_CUSTOMER + ", NAME=" + NAME + ", DATEOFBIRTH=" + DATEOFBIRTH + ", PHONE=" + PHONE + ", EMAIL=" + EMAIL + ", PASSWORD=" + PASSWORD + ", ADDRESS=" + ADDRESS + ", GENDER=" + GENDER + '}';
    }
    
        
        
}
