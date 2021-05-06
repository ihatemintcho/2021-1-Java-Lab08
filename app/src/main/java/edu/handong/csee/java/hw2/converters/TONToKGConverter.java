package edu.handong.csee.java.hw2.converters;

/**
 * this class implements Convertible to accommodate TON input and changing it to KG
 */
public class TONToKGConverter implements Convertible
{
    /**
     * this variable is the data that will be handled and returned
     */
    private double measurement;

    /**
     * this method receives fromValue from cmdline and makes it easier to handle
     * @param fromValue takes fromValue to set
     */
    public void setFromValue(double fromValue)
    {
        measurement = fromValue;
    }

    /**
     * this method returns the converted measurement back to run()
     * @return returns converted value
     */
    public double getConvertedValue()
    {
        return measurement;
    }

    /**
     * this method converts ton to kg
     */
    public void convert()
    {
        measurement = measurement * 1000;
    }
    
}