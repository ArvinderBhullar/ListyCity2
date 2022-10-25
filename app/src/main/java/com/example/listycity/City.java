package com.example.listycity;

/**
 * This class defines a city. City{String} and Province{String}
 * @author arvinder
 * @version 1.0
 */
public class City implements Comparable{
    /**
     * This variable stores city name
     */
    private String city;
    /**
     * This variable stores province name
     */
    private String province;

    /**
     * This is a constructor. packagename.classname
     * @param city It stores name of city
     * @param province It stores name of province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This function returns the city name
     * @return {@link #city}
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This function returns the province name
     * @return {@link #province}
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This function compares if two city objects are equal
     * @return 1 if the city names are equal, 0 if they are unequal
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * This function compares if two city objects are equal
     * @return true if the city objects are equal, false if they are unequal
     */
    @Override
    // https://crunchify.com/how-to-override-equals-and-hashcode-method-in-java/
    public boolean equals(Object o){
        if (o==null) {
            return false;
        } else if (this.getProvinceName() == ((City) o).getProvinceName() &&
                this.getCityName() == ((City) o).getCityName()){
            return true;
        } else {
            return false;
        }
    }

    /**
     * This function returns the hashcode value of the object
     * @return integer which is the hashcode of the object
     */
    @Override
    public int hashCode(){
        int result = 0;
        result = (int) (getCityName().length() + getProvinceName().length());
        return result;
    }
}