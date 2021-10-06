package com.springaop;

import java.util.HashMap;
import java.util.Map;

public class PassengerDaoImpl implements PassengerDao {

    private static Map<Integer,Passenger> passengersMap = new HashMap<>();

    @Override
    public Passenger getPassenger(int i) {

        if(passengersMap.get(i) != null) {
            return passengersMap.get(i);
        }
        Passenger passenger = new Passenger(i);
        passengersMap.put(i, passenger);
        return passenger;
    }
}
