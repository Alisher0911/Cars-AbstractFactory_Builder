package Assignment.Kia;

import Assignment.Builder.Car;

public class KiaCerato implements Kia {
    @Override
    public String getType() {
        return "Cerato";
    }

    @Override
    public String getCar(String color, String engine, boolean GPS, boolean tripComputer) {
        Car Cerato = new Car
                .CarBuilder(color, engine)
                .withGPS(GPS)
                .withTripComputer(tripComputer)
                .build();
        return Cerato.toString() + " Model - " + getType();
    }
}
