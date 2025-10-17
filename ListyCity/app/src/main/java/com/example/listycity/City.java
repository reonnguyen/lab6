package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable{
    private String city;
    private String province;

    /**
     * Constructor for City object
     * @param city city name
     * @param province province name
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the city
     * @return name of city
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Gets the name of the province
     * @return name of province
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares cities alphabetically by city name.
     * @param o the object to be compared
     * @return a negative integer if this city is less than o, zero if they are equal, positive integer otherwise
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * Checks equality of two City objects.
     * Two cities are considered equal if both their names and provinces match.
     * @param o the object to be compared
     * @return True if equal, False otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return this.city.equals(city.city) && this.province.equals(city.province);
    }

    /**
     * Returns a hash code for the City object.
     * @return hash code based on city and province
     */
    @Override
    public int hashCode() {
        return (city + province).hashCode();
    }

}

