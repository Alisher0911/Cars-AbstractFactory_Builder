package Assignment.Kia;

import Assignment.Builder.Car;

public class KiaSportage implements Kia {
    @Override
    public String getType() {
        return "Sportage";
    }

    @Override
    public String getCar(String color, String engine, boolean GPS, boolean tripComputer) {
        Car Sportage = new Car
                .CarBuilder(color, engine)
                .withGPS(GPS)
                .withTripComputer(tripComputer)
                .build();
        return Sportage.toString() + " Model - " + getType();
    }
}
