/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Adaptor.AAdaptor;
import Flights.Airline;
import Flights.Flight;
import org.junit.Test;

/**
 *
 * @author Stephen
 */
public class JUnitTestForAdaptor {
    
    public JUnitTestForAdaptor() {
    }

    @Test
    public void testAdapter(){
      AAdaptor planePicker = new AAdaptor();
      Airline newAirline = new Airline(){};
      Flight newFlight = new Flight(){};
      newAirline.setFlight(newFlight);
      
      planePicker.planeType("Mid Size jet", newAirline);
      planePicker.planeType("Light Jet", newAirline);
      planePicker.planeType("Heavy Jet", newAirline);
      planePicker.planeType("Helicopter", newAirline);   
    }
}
