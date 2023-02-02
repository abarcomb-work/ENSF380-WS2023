package edu.ucalgary.oop;

/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
All rights reserved.
*/

public class Trip {
    private String arrival;
    private String departure;
    private String city;
    private String country;

    // Returns a string in the format of:
    // value (key)
    public String fmtString(String key, String value) {
        return value + " (" + key + ")";
    }

    // Constructor
    public Trip(String[] array) {
        arrival  = array[0];
        departure = array[1];
        city = array[2];
        country = array[3];
    }

    // Given a date string, return just the year
    public static int getYear(String date) {
        String year = date.substring(0, 4);
        return Integer.parseInt(year);
    }

    // Given a date string, return just the month
    // Since it is an int, a date like "2022-01-12" returns 1
    public static int getMonth(String date) {
        String month = date.substring(5, 7);
        return Integer.parseInt(month);
    }

    // Return a formatted string of key/value pairs, with commas
    // between each. See the output for an example.
    public String formatTrip() {
        String trip = fmtString("arrival", arrival) + ", " + fmtString("departure", departure) + ", " + fmtString("city", city) + ", " + fmtString("country", country);
        return trip;
    }

    // Getter
    public String getArrival() {
        String arrival = this.arrival;
        return arrival;
    }

    // Getter
    public String getDeparture() {
        String departure = this.departure;
        return departure;
    }

    // Getter
    public String getCity() {
        String city = this.city;
        return city;
    }

    // Getter
    public String getCountry() {
        String country = this.country;
        return country;
    }

    // Setter
    public void setArrival(String date) {
        this.arrival = date;
    }

    // Setter
    public void setDeparture(String date) {
        this.departure = date;
    }

    // Setter 
    public void setCity(String city) {
        this.city = city;
    }

    // Setter 
    public void setCountry(String country) {
        this.country = country;
    }

}
