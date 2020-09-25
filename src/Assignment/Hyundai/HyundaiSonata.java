package Assignment.Hyundai;

import Assignment.Builder.Car;

public class HyundaiSonata implements Hyundai {
    @Override
    public String getType() {
        return "Sonata";
    }

    @Override
    public String getCar(String color, String engine, boolean GPS, boolean tripComputer) {
        Car Sonata = new Car
                .CarBuilder(color, engine)
                .withGPS(GPS)
                .withTripComputer(tripComputer)
                .build();
        return Sonata.toString() + " Model - " + getType();
    }
}
