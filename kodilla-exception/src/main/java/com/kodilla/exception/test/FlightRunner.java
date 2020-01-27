package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {


        Flight barToMos = new Flight("Barcelona", "Moskwa");
        FlightScanner barToMosScanner = new FlightScanner();

        try {
            barToMosScanner.findFlight(barToMos);
        } catch (RouteNotFoundException r) {
            System.out.println("There is no such flight!");
        } finally {
            System.out.println("These are your searching results.");
        }

        Flight barToLon = new Flight("Barcelona", "Londyn");
        FlightScanner barToLonScanner = new FlightScanner();

        try {
            barToLonScanner.findFlight(barToLon);
        } catch (RouteNotFoundException r) {
            System.out.println("There is no such flight!");
        } finally {
            System.out.println("These are your searching results.");
        }

        Flight barToMad = new Flight("Barcelona", "Madryt");
        FlightScanner barToMadScanner = new FlightScanner();

        try {
            barToMadScanner.findFlight(barToMad);
        } catch (RouteNotFoundException r) {
            System.out.println("There is no such flight!");
        } finally {
            System.out.println("These are your searching results.");
        }

    }
}










    /*
        Flight kraToLon = new Flight ("Krakow", "Londyn");
        Flight amsToWen = new Flight ("Amsterdam", "Wenecja");*/


