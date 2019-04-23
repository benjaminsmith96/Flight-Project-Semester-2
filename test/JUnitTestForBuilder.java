/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import BookingBuilder.Booking;
import DB.FlightDBController;
import Flights.Airline;
import Users.Customer;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;

/**
 *
 * @author Stephen
 */
public class JUnitTestForBuilder {

    private int bookingID;
    private int flightNumber;
    private String classType;
    private int baggage;
    private Customer user;
    private Airline flight;
    
    public JUnitTestForBuilder() {
    }
    
    @Test
    public void TestBuilder() throws Exception{
        flightNumber = 1;
        baggage = 1;
        classType = "First Class";
        bookingID = 9;
        
        FlightDBController db1 = new FlightDBController();
        Calendar cal = Calendar.getInstance();
        Date date=cal.getTime();

        flight = db1.createFlight(flightNumber);
        user = new Customer();
        
        Booking b =  new Booking.BBuilder(bookingID, user, flight, baggage, classType, date).build();
        System.out.println(b.getBookingID());
        System.out.println(b.getBaggage());
        System.out.println(b.getBookingDate());
    }
}
