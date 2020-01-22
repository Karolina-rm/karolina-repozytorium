package com.kodilla.exception.test;

import java.util.HashMap;


public class FlightScanner {

    private HashMap<String,Boolean> getAirportSearching;

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> airportSearching = new HashMap<>();
        airportSearching.put("Barcelona", true);
        airportSearching.put("Krakow", true);
        airportSearching.put("Londyn", true);
        airportSearching.put("Amsterdam", false);
        airportSearching.put("Wenecja", false);
        airportSearching.put("Moskwa", false);

        if ("co?") {

        }


    } else {

        throw new RouteNotFoundException("Object not found!");
    }


}
