/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author Le Hoa
 */
public class Command {

    private int ID_COMMAND;
    private int ID_USER;
    private int ID_PRODUCT;
    private Timestamp BUY_DATE;
    private int QUANTITY;
    private double TOTAL;
    private boolean INDEXCHECK;

    public Command() {
    }

    public Command(int ID_PRODUCT, int ID_COMMAND, double TOTAL, int QUANTITY, Timestamp BUY_DATE, int ID_USER) {
        this.ID_PRODUCT = ID_PRODUCT;
        this.ID_COMMAND = ID_COMMAND;
        this.TOTAL = TOTAL;
        this.QUANTITY = QUANTITY;
        this.BUY_DATE = BUY_DATE;
        this.ID_USER = ID_USER;
    }

    public Command(int ID_COMMAND, int ID_USER, Timestamp BUY_DATE, boolean INDEXCHECK) {
        this.ID_COMMAND = ID_COMMAND;
        this.ID_USER = ID_USER;
        this.BUY_DATE = BUY_DATE;
        this.INDEXCHECK = INDEXCHECK;
    }

    public boolean isINDEXCHECK() {
        return INDEXCHECK;
    }

    public void setINDEXCHECK(boolean INDEXCHECK) {
        this.INDEXCHECK = INDEXCHECK;
    }
    

    public int getID_COMMAND() {
        return ID_COMMAND;
    }

    public void setID_COMMAND(int ID_COMMAND) {
        this.ID_COMMAND = ID_COMMAND;
    }

    public int getID_PRODUCT() {
        return ID_PRODUCT;
    }

    public void setID_PRODUCT(int ID_PRODUCT) {
        this.ID_PRODUCT = ID_PRODUCT;
    }

    public int getID_USER() {
        return ID_USER;
    }

    public void setID_USER(int ID_USER) {
        this.ID_USER = ID_USER;
    }

    public Timestamp getBUY_DATE() {
        return BUY_DATE;
    }

    public void setBUY_DATE(Timestamp BUY_DATE) {
        this.BUY_DATE = BUY_DATE;
    }

    public int getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(int QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public double getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(double TOTAL) {
        this.TOTAL = TOTAL;
    }

    @Override
    public String toString() {
        return "Command{" + "ID_COMMAND=" + ID_COMMAND + ", ID_PRODUCT=" + ID_PRODUCT + ", ID_USER=" + ID_USER + ", BUY_DATE=" + BUY_DATE + ", QUANTITY=" + QUANTITY + ", TOTAL=" + TOTAL + '}';
    }

    public static int getRandomIntBetweenRange(int min, int max) {
        int x = (int) ((Math.random() * ((max - min) + 1)) + min);
        return x;
    }

}
