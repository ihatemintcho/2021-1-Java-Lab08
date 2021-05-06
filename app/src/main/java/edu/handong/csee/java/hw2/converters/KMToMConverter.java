package edu.handong.csee.java.hw2.converters;

/**
 *  this class implements Convertible to accommodate KM input and changing it to M
 */
public class KMToMConverter implements Convertible
{
    /**
     * this variable is the data that will be handled and returned
     */
    private double measurement;

    /**
     * this method receives fromValue from cmdline and makes it easier to handle
     */
    public void setFromValue(double fromValue)
    {
        measurement = fromValue;
    }

    /**
     * this method returns the converted measurement back to run()
     */
    public double getConvertedValue()
    {
        return measurement;
    }

    /**
     * this method converts km to m
     */
    public void convert()
    {
        measurement = measurement * 1000;
    }

}