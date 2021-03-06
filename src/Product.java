/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * FILE: abstract .java class named Product that implements the .java interface Item.
 */

import java.util.Date;

public abstract class Product implements Item {

    int serialNumber;
    Date manufacturedOn;
    String name;

    static int currentProductionNumber;

    /*
    Add a constructor that will take in the name of the product and set this to the field variable name.
    You will also assign a serial number from the currentProductionNumber.
    The currentProductionNumber should be incremented in readiness for the next instance.
    Set manufacturedOn as the current date and time.
    */

    public Product(String name) {

        this.name = name;

        /*
         Add an integer class variable called currentProductionNumber.
         This will store the next number to be assigned to serialNumber.
        */
        serialNumber = currentProductionNumber++; //unary operator

        //Set manufacturedOn as the current date and time.
        manufacturedOn = new Date();
    }

    public void setCurrentProductionNumber(int productionNumber) {
        serialNumber = productionNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getManufactureDate() {
        return manufacturedOn;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    //Add a toString method that will return the following
    public String toString() {

        return "Manufacturer : " + manufacturer + "\n "
            + "Serial Number : " + serialNumber + "\n"
            + "Date : " + manufacturedOn + "\n"
            + "Name : " + name;
    }
}