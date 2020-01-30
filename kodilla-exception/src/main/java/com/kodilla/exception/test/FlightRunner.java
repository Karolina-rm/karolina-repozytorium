package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {


        Flight mosToBar = new Flight("Wenecja", "Moskwa");
        FlightScanner mosToBarScanner = new FlightScanner();

        try {
            mosToBarScanner.findFlight(mosToBar);
            System.out.println("The flight is available!");
        } catch (RouteNotFoundException r) {
            System.out.println("There is no such flight!");
        } finally {
            System.out.println("These are your searching results.");
        }

        Flight barToLon = new Flight("Barcelona", "Londyn");
        FlightScanner barToLonScanner = new FlightScanner();

        try {
            barToLonScanner.findFlight(barToLon);
            System.out.println("The flight is available!");
        } catch (RouteNotFoundException r) {
            System.out.println("There is no such flight!");
        } finally {
            System.out.println("These are your searching results.");
        }

        Flight barToMad = new Flight("Barcelona", "Madryt");
        FlightScanner barToMadScanner = new FlightScanner();

        try {
            barToMadScanner.findFlight(barToMad);
            System.out.println("The flight is available!");
        } catch (RouteNotFoundException r) {
            System.out.println("There is no such flight!");
        } finally {
            System.out.println("These are your searching results.");
        }

    }
}


