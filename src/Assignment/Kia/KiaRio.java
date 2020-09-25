package Assignment.Kia;

import Assignment.Builder.Car;

public class KiaRio implements Kia {
    @Override
    public String getType() {
        return "Rio";
    }

    @Override
    public String getCar(String color, String engine, boolean GPS, boolean tripComputer) {
        Car Rio = new Car
                .CarBuilder(color, engine)
                .withGPS(GPS)
                .withTripComputer(tripComputer)
                .build();
        return Rio.toString() + " Model - " + getType();
    }
}
