package edu.handong.csee.java.hw2;

/**
 * class Allconverter
 */
public class AllConverter
{
    /**
     * this variable is the data that will be handled and returned
     */
    private double fromValue;
    /**
     * this variable is the 'data type' of measurement
     */
    private String originalMeasure;

    private double measurementA;
    private double measurementB;

    /**
     * this method sets fromValue and forwards it to continue the chain.
     * @param fromValue takes fromValue from IntegratedConverter
     * @return returns this
     */
    public AllConverter setFromValue(double fromValue)
    {
        this.fromValue = fromValue;
        return this;
    }

    /**
     * this method sets originalMeasure and forwards it to contiue the chain.
     * @param originalMeasure takes originalMeasure from IntegreatedConverter
     * @return returns this
     */
    public AllConverter setOriginalMeasure(String originalMeasure)
    {
        this.originalMeasure = originalMeasure;
        return this;
    }

    /**
     * this method finally converts fromValue of originalMeasure to 2 different forms and prints.
     */
    public void convertAndPrintOut()
    {        
        if(originalMeasure.equals("KM"))
        {
            measurementA = fromValue * 1000;
            measurementB = fromValue / 1.6;
            System.out.println(fromValue + " " + originalMeasure + " to " + measurementA + " M");
            System.out.println(fromValue + " " + originalMeasure + " to " + measurementB + " MILE");

        }
        else if(originalMeasure.equals("TON"))
        {
            measurementA = fromValue * 1000;
            measurementB = fromValue * 1000000;
            System.out.println(fromValue + " " + originalMeasure + " to " + measurementA + " KG");
            System.out.println(fromValue + " " + originalMeasure + " to " + measurementB + " G");
        }
        else
        {
            System.out.println("AllConverter cannot support the measure!");
        }
    }
}