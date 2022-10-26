package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CItyList {

    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * @throws IllegalArgumentException
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List getCities() {
        List list = cities;
        Collections.sort(list);
        return list;
    }


    /**
     * When given a city, return whether or not it belongs in the list
     * @param city
     * @return
     * Return true if city is in the list, false otherwise
     */
    public boolean hasCity(City city){
        if (cities.contains(city)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * When given a city, delete it from the list
     * @param city
     * Returns nothing
     * @throws IllegalArgumentException
     */
    public void deleteCity(City city){
        if (cities.contains(city)){
            cities.remove(new City(city.getCityName(), city.getProvinceName()));
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Return how many cities are in the list
     * @return integer
     * Return an integer equal to the number of cities in the list
     */
    public int countCities(){
        return cities.size();
    }

    public boolean hasCity2(City city){
        if (cities.contains((city))){
            return true;
        } else {
            return false;
        }
    }

    public void deleteCity2(City city){

    }

}
