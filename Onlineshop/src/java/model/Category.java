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
public class Category {
    
 	private int ID_CATEGORY;
	private String NAME;
	private String DESCRIPTION;

    public Category() {
    }

    public Category(int ID_CATEGORY, String NAME, String DESCRIPTION) {
        this.ID_CATEGORY = ID_CATEGORY;
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
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

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    @Override
    public String toString() {
        return "Category{" + "ID_CATEGORY=" + ID_CATEGORY + ", NAME=" + NAME + ", DESCRIPTION=" + DESCRIPTION + '}';
    }
        
        
    
}
