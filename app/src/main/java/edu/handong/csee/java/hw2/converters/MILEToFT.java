package edu.handong.csee.java.hw2.converters;

/**
 * this class implements Convertible to accommodate MILE input and changing it to FT
 */
public class MILEToFT
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
     * this method converts mile to km
     */
    public void convert()
    {
        measurement = measurement * 1.6;
    }
    
}
