package com.example.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CityListTest {
    private CItyList mockCityList() {
        CItyList cityList = new CItyList();
        cityList.add(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    @DisplayName("Testing addition of cities")
    void testAdd() {
        CItyList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testGetCities() {
        CItyList cityList = mockCityList();
        assertEquals(0,
                mockCity().compareTo(cityList.getCities().get(0)));
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0,
                mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testAddException() {
        CItyList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows( IllegalArgumentException.class, () -> {
            cityList.add(city); });
    }

    @Test
    void testHasCity() {
        CItyList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertTrue(cityList.hasCity(new City("Yellowknife", "Northwest Territories")));

    }

    @Test
    void testDeleteException() {
        CItyList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        assertThrows( IllegalArgumentException.class, () -> {
            cityList.deleteCity(city); });
    }

    @Test
    void testDeleteCity() {
        CItyList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        cityList.deleteCity(city);
        assertFalse(cityList.hasCity(city));
    }

    @Test
    void testCountCity() {
        CItyList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertEquals(2,
                cityList.countCities());
    }

    @Test
    void testHasCity2() {
        CItyList cList = mockCityList();
        City city = new City("Test", "Ro");
        cList.add(city);
        assertTrue(cList.hasCity2(new City("Test", "Ro")));
    }

}