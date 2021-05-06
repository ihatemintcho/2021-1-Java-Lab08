package edu.handong.csee.java.hw2.converters;

/**
 * convertible interface
 */
public interface Convertible {

    /**
     * @param fromValue takes fromValue
     */
    public void setFromValue(double fromValue);
    /**
     * @return returns converted value
     */
    public double getConvertedValue();
    /**
     * converting function
     */
    public void convert();

}