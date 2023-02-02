package edu.ucalgary.oop;

/*
@author Tochi Isaac
Copyright Ann Barcomb and Emily Marasco, 2021-2023
All rights reserved.
*/

public class Itinerary {
    private Trip[] trips = new Trip[20];

    // Returns a string in the format of:
    // value (key)
    public static String fmtString(String key, String value) {
        return value + " (" + key + ")";
    }

    // Constructor
    public Itinerary(String[][] myTrips) {
        for (int i = 0; i < myTrips.length; i++) {
            trips[i] = new Trip(myTrips[i]);
        }
    }

    // Getter
    public Trip[] getTrips() {
        return this.trips;
    }

    public String formatByArrival() {
        StringBuilder sb = new StringBuilder();
        int currYear = 0, currMonth = 0;
        for (Trip trip : trips) {
            if (trip == null) break;
            int year = trip.getYear(trip.getArrival());
            int month = trip.getMonth(trip.getArrival());
            if (year != currYear) {
                sb.append(year + " (Year)\n");
                currYear = year;
                currMonth = 0;
            }
            if (month != currMonth) {
                sb.append("--" + month + " (Month)\n");
                currMonth = month;
            }
            sb.append("----" + trip.getCity() + " (City), " + trip.getCountry() + " (Country) (Place)\n");
        }
        return sb.toString().strip();
    }

    // The first array holds years (2021-2023).
    // The second array holds months.
    // The third array holds formatted locations occurring in the year/month
    public String[][][] byDate() {
        String[][][] dateArray = new String[3][12][20];
        int count = 0;
        for (Trip trip : trips) {
            if (trip == null) break;
            int year = trip.getYear(trip.getArrival()) - 2021;
            int month = trip.getMonth(trip.getArrival()) - 1;
            boolean added = false;
            for (int i = 0; i < 20; i++) {
                if (dateArray[year][month][i] == null) {
                    dateArray[year][month][i] = fmtString("City", trip.getCity()) + ", " + fmtString("Country", trip.getCountry());
                    added = true;
                    break;
                }
            }
            if (!added) {
                count++;
            }
        }
        return dateArray;
    }


}
