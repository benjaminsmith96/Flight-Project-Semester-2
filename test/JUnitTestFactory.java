/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Flights.AFactory;
import Flights.AlphaFP;
import Flights.AlphaFlights;
import Flights.FFactory;
import java.sql.Time;
import java.util.Date;
import org.junit.Test;

/**
 *
 * @author Stephen
 */
public class JUnitTestFactory {
    
    public JUnitTestFactory() {
    }
    
    @Test
    public void TestFactory()
    {
        FFactory flight = new AFactory();
        AlphaFlights airline = (AlphaFlights) flight.createAirplane("Alpha");
        AlphaFP flightPrice = (AlphaFP) flight.createFlightPrice("Alpha");
        airline.setFlight(flightPrice);
        int airlineNumber = 10;
        airline.setAirplaneID(airlineNumber);
        String arrivalAirport = null;
        airline.getFlight().setArrivalAirport(arrivalAirport);
        String departureAirport = null;
        airline.getFlight().setDepartureAirport(departureAirport);
        Time arrivalTime = null;
        airline.getFlight().setArrivalTime(arrivalTime);
        Time departureTime = null;
        airline.getFlight().setDepartureTime(departureTime);
        Date departureDate = null;
        airline.getFlight().setDepartureDate(departureDate);
        Date arrivalDate = null;
        airline.getFlight().setArrivalDate(arrivalDate);
        int flightID = 10;
        airline.getFlight().setFlightID(flightID);
        int currentFirst = 10;
        airline.getFlight().setCurrentFirstCapacity(currentFirst);
        int currentBusiness = 10;
        airline.getFlight().setCurrentBusinessCapacity(currentBusiness);
        int currentEconomic = 10;
        airline.getFlight().setCurrentEconomicCapacity(currentEconomic);
        System.out.println(airline.getAirplaneID());
        System.out.println(airline.getFlight().getFlightID());
        System.out.println(airline.getFlight().getCurrentBusinessCapacity());
    }
}
