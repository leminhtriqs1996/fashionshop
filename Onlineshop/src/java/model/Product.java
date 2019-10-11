/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Le Hoa
 */
public class Product {
    
    	private int ID_PRODUCT;
	private int ID_CATEGORY;
	private String NAME;
	private String IMAGE;
	private Double PRICE;
	private String SUPPLIER;
	private String INFORMATION;
        
        /*ADDED*/
        private String size;
        private String color;
        private String country;
        private int quantity_remaining;
        private String gender;
        private int command_quantity;
        private String kindOfFabric;

    public Product() {
    }

    public Product(int ID_PRODUCT, int ID_CATEGORY, String NAME, String IMAGE, Double PRICE, String SUPPLIER, String INFORMATION) {
        this.ID_PRODUCT = ID_PRODUCT;
        this.ID_CATEGORY = ID_CATEGORY;
        this.NAME = NAME;
        this.IMAGE = IMAGE;
        this.PRICE = PRICE;
        this.SUPPLIER = SUPPLIER;
        this.INFORMATION = INFORMATION;
    }

    public Product(int ID_PRODUCT, int ID_CATEGORY, String NAME, String IMAGE, Double PRICE, String SUPPLIER, String INFORMATION, String size, String color, String country, int quantity_remaining, String gender, int command_quantity, String kindOfFabric) {
        this.ID_PRODUCT = ID_PRODUCT;
        this.ID_CATEGORY = ID_CATEGORY;
        this.NAME = NAME;
        this.IMAGE = IMAGE;
        this.PRICE = PRICE;
        this.SUPPLIER = SUPPLIER;
        this.INFORMATION = INFORMATION;
        this.size = size;
        this.color = color;
        this.country = country;
        this.quantity_remaining = quantity_remaining;
        this.gender = gender;
        this.command_quantity = command_quantity;
        this.kindOfFabric = kindOfFabric;
    }
    
    
    
    public int getID_PRODUCT() {
        return ID_PRODUCT;
    }

    public void setID_PRODUCT(int ID_PRODUCT) {
        this.ID_PRODUCT = ID_PRODUCT;
    }

    public int getID_CATEGORY() {
        return ID_CATEGORY;
    }

    public void setID_CATEGORY(int ID_CATEGORY) {
        this.ID_CATEGORY = ID_CATEGORY;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(String IMAGE) {
        this.IMAGE = IMAGE;
    }

    public Double getPRICE() {
        return PRICE;
    }

    public void setPRICE(Double PRICE) {
        this.PRICE = PRICE;
    }

    public String getSUPPLIER() {
        return SUPPLIER;
    }

    public void setSUPPLIER(String SUPPLIER) {
        this.SUPPLIER = SUPPLIER;
    }

    public String getINFORMATION() {
        return INFORMATION;
    }

    public void setINFORMATION(String INFORMATION) {
        this.INFORMATION = INFORMATION;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getQuantity_remaining() {
        return quantity_remaining;
    }

    public void setQuantity_remaining(int quantity_remaining) {
        this.quantity_remaining = quantity_remaining;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCommand_quantity() {
        return command_quantity;
    }

    public void setCommand_quantity(int command_quantity) {
        this.command_quantity = command_quantity;
    }

    public String getKindOfFabric() {
        return kindOfFabric;
    }

    public void setKindOfFabric(String kindOfFabric) {
        this.kindOfFabric = kindOfFabric;
    }

    @Override
    public String toString() {
        return "Product{" + "ID_PRODUCT=" + ID_PRODUCT + ", ID_CATEGORY=" + ID_CATEGORY + ", NAME=" + NAME + ", IMAGE=" + IMAGE + ", PRICE=" + PRICE + ", SUPPLIER=" + SUPPLIER + ", INFORMATION=" + INFORMATION + '}';
    }
        
        
        
        
        
    
}
