package com.kodilla.exception.test;

import java.util.HashMap;


public class FlightScanner {


    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> airportSearching = new HashMap<>();
        airportSearching.put("Barcelona", true);
        airportSearching.put("Krakow", true);
        airportSearching.put("Londyn", true);
        airportSearching.put("Amsterdam", false);
        airportSearching.put("Wenecja", false);
        airportSearching.put("Moskwa", false);

        if (airportSearching.containsKey(flight.getArrivalAirport())) {
            if (airportSearching.get(flight.getArrivalAirport())) {
                System.out.println("The airport is in the base.");
            } else {
                System.out.println("The flight is not available");
            }

        } else {
            throw new RouteNotFoundException();
        }
    }
}
